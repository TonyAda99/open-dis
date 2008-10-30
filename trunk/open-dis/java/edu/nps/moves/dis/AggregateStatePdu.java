package edu.nps.moves.dis;

import java.util.*;
import java.io.*;
import javax.xml.bind.annotation.*;

/**
 * Section 5.3.9.1 informationa bout aggregating entities anc communicating information about the aggregated entities.        requires manual intervention to fix the padding between entityID lists and silent aggregate sysem lists--this padding        is dependent on how many entityIDs there are, and needs to be on a 32 bit word boundary. UNFINISHED
 *
 * Copyright (c) 2008, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class AggregateStatePdu extends EntityManagementFamilyPdu implements Serializable
{
   /** ID of aggregated entities */
   protected EntityID  aggregateID = new EntityID(); 

   /** force ID */
   protected short  forceID;

   /** state of aggregate */
   protected short  aggregateState;

   /** entity type of the aggregated entities */
   protected EntityType  aggregateType = new EntityType(); 

   /** formation of aggregated entities */
   protected long  formation;

   /** marking for aggregate; first char is charset type, rest is char data */
   protected AggregateMarking  aggregateMarking = new AggregateMarking(); 

   /** dimensions of bounding box for the aggregated entities, origin at the center of mass */
   protected Vector3Float  dimensions = new Vector3Float(); 

   /** orientation of the bounding box */
   protected Orientation  orientation = new Orientation(); 

   /** center of mass of the aggregation */
   protected Vector3Double  centerOfMass = new Vector3Double(); 

   /** velocity of aggregation */
   protected Vector3Float  velocity = new Vector3Float(); 

   /** number of aggregates */
   protected int  numberOfDisAggregates;

   /** number of entities */
   protected int  numberOfDisEntities;

   /** number of silent aggregate types */
   protected int  numberOfSilentAggregateTypes;

   /** number of silent entity types */
   protected int  numberOfSilentEntityTypes;

   /** aggregates  list */
   protected List aggregateIDList = new ArrayList(); 
   /** entity ID list */
   protected List entityIDList = new ArrayList(); 
   /** @@@padding to put the start of the next list on a 32 bit boundary. This needs to be fixed */
   protected short  pad2;

   /** silent entity types */
   protected List silentAggregateSystemList = new ArrayList(); 
   /** silent entity types */
   protected List silentEntitySystemList = new ArrayList(); 
   /** number of variable datum records */
   protected long  numberOfVariableDatumRecords;

   /** variableDatums */
   protected List variableDatumList = new ArrayList(); 

/** Constructor */
 public AggregateStatePdu()
 {
    setPduType( (short)33 );
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   marshalSize = marshalSize + aggregateID.getMarshalledSize();  // aggregateID
   marshalSize = marshalSize + 1;  // forceID
   marshalSize = marshalSize + 1;  // aggregateState
   marshalSize = marshalSize + aggregateType.getMarshalledSize();  // aggregateType
   marshalSize = marshalSize + 4;  // formation
   marshalSize = marshalSize + aggregateMarking.getMarshalledSize();  // aggregateMarking
   marshalSize = marshalSize + dimensions.getMarshalledSize();  // dimensions
   marshalSize = marshalSize + orientation.getMarshalledSize();  // orientation
   marshalSize = marshalSize + centerOfMass.getMarshalledSize();  // centerOfMass
   marshalSize = marshalSize + velocity.getMarshalledSize();  // velocity
   marshalSize = marshalSize + 2;  // numberOfDisAggregates
   marshalSize = marshalSize + 2;  // numberOfDisEntities
   marshalSize = marshalSize + 2;  // numberOfSilentAggregateTypes
   marshalSize = marshalSize + 2;  // numberOfSilentEntityTypes
   for(int idx=0; idx < aggregateIDList.size(); idx++)
   {
        AggregateID listElement = (AggregateID)aggregateIDList.get(idx);
        marshalSize = marshalSize + listElement.getMarshalledSize();
   }
   for(int idx=0; idx < entityIDList.size(); idx++)
   {
        EntityID listElement = (EntityID)entityIDList.get(idx);
        marshalSize = marshalSize + listElement.getMarshalledSize();
   }
   marshalSize = marshalSize + 1;  // pad2
   for(int idx=0; idx < silentAggregateSystemList.size(); idx++)
   {
        EntityType listElement = (EntityType)silentAggregateSystemList.get(idx);
        marshalSize = marshalSize + listElement.getMarshalledSize();
   }
   for(int idx=0; idx < silentEntitySystemList.size(); idx++)
   {
        EntityType listElement = (EntityType)silentEntitySystemList.get(idx);
        marshalSize = marshalSize + listElement.getMarshalledSize();
   }
   marshalSize = marshalSize + 4;  // numberOfVariableDatumRecords
   for(int idx=0; idx < variableDatumList.size(); idx++)
   {
        VariableDatum listElement = (VariableDatum)variableDatumList.get(idx);
        marshalSize = marshalSize + listElement.getMarshalledSize();
   }

   return marshalSize;
}


public void setAggregateID(EntityID pAggregateID)
{ aggregateID = pAggregateID;
}

@XmlElement
public EntityID getAggregateID()
{ return aggregateID; 
}

public void setForceID(short pForceID)
{ forceID = pForceID;
}

@XmlAttribute
public short getForceID()
{ return forceID; 
}

public void setAggregateState(short pAggregateState)
{ aggregateState = pAggregateState;
}

@XmlAttribute
public short getAggregateState()
{ return aggregateState; 
}

public void setAggregateType(EntityType pAggregateType)
{ aggregateType = pAggregateType;
}

@XmlElement
public EntityType getAggregateType()
{ return aggregateType; 
}

public void setFormation(long pFormation)
{ formation = pFormation;
}

@XmlAttribute
public long getFormation()
{ return formation; 
}

public void setAggregateMarking(AggregateMarking pAggregateMarking)
{ aggregateMarking = pAggregateMarking;
}

@XmlElement
public AggregateMarking getAggregateMarking()
{ return aggregateMarking; 
}

public void setDimensions(Vector3Float pDimensions)
{ dimensions = pDimensions;
}

@XmlElement
public Vector3Float getDimensions()
{ return dimensions; 
}

public void setOrientation(Orientation pOrientation)
{ orientation = pOrientation;
}

@XmlElement
public Orientation getOrientation()
{ return orientation; 
}

public void setCenterOfMass(Vector3Double pCenterOfMass)
{ centerOfMass = pCenterOfMass;
}

@XmlElement
public Vector3Double getCenterOfMass()
{ return centerOfMass; 
}

public void setVelocity(Vector3Float pVelocity)
{ velocity = pVelocity;
}

@XmlElement
public Vector3Float getVelocity()
{ return velocity; 
}

@XmlAttribute
public int getNumberOfDisAggregates()
{ return (int)aggregateIDList.size();
}

/** Note that setting this value will not change the marshalled value. The list whose length this describes is used for that purpose.
 * The getnumberOfDisAggregates method will also be based on the actual list length rather than this value. 
 * The method is simply here for java bean completeness.
 */
public void setNumberOfDisAggregates(int pNumberOfDisAggregates)
{ numberOfDisAggregates = pNumberOfDisAggregates;
}

@XmlAttribute
public int getNumberOfDisEntities()
{ return (int)entityIDList.size();
}

/** Note that setting this value will not change the marshalled value. The list whose length this describes is used for that purpose.
 * The getnumberOfDisEntities method will also be based on the actual list length rather than this value. 
 * The method is simply here for java bean completeness.
 */
public void setNumberOfDisEntities(int pNumberOfDisEntities)
{ numberOfDisEntities = pNumberOfDisEntities;
}

@XmlAttribute
public int getNumberOfSilentAggregateTypes()
{ return (int)silentAggregateSystemList.size();
}

/** Note that setting this value will not change the marshalled value. The list whose length this describes is used for that purpose.
 * The getnumberOfSilentAggregateTypes method will also be based on the actual list length rather than this value. 
 * The method is simply here for java bean completeness.
 */
public void setNumberOfSilentAggregateTypes(int pNumberOfSilentAggregateTypes)
{ numberOfSilentAggregateTypes = pNumberOfSilentAggregateTypes;
}

@XmlAttribute
public int getNumberOfSilentEntityTypes()
{ return (int)silentEntitySystemList.size();
}

/** Note that setting this value will not change the marshalled value. The list whose length this describes is used for that purpose.
 * The getnumberOfSilentEntityTypes method will also be based on the actual list length rather than this value. 
 * The method is simply here for java bean completeness.
 */
public void setNumberOfSilentEntityTypes(int pNumberOfSilentEntityTypes)
{ numberOfSilentEntityTypes = pNumberOfSilentEntityTypes;
}

public void setAggregateIDList(List pAggregateIDList)
{ aggregateIDList = pAggregateIDList;
}

@XmlElementWrapper(name="aggregateIDListList" )
public List getAggregateIDList()
{ return aggregateIDList; }

public void setEntityIDList(List pEntityIDList)
{ entityIDList = pEntityIDList;
}

@XmlElementWrapper(name="entityIDListList" )
public List getEntityIDList()
{ return entityIDList; }

public void setPad2(short pPad2)
{ pad2 = pPad2;
}

@XmlAttribute
public short getPad2()
{ return pad2; 
}

public void setSilentAggregateSystemList(List pSilentAggregateSystemList)
{ silentAggregateSystemList = pSilentAggregateSystemList;
}

@XmlElementWrapper(name="silentAggregateSystemListList" )
public List getSilentAggregateSystemList()
{ return silentAggregateSystemList; }

public void setSilentEntitySystemList(List pSilentEntitySystemList)
{ silentEntitySystemList = pSilentEntitySystemList;
}

@XmlElementWrapper(name="silentEntitySystemListList" )
public List getSilentEntitySystemList()
{ return silentEntitySystemList; }

@XmlAttribute
public long getNumberOfVariableDatumRecords()
{ return (long)variableDatumList.size();
}

/** Note that setting this value will not change the marshalled value. The list whose length this describes is used for that purpose.
 * The getnumberOfVariableDatumRecords method will also be based on the actual list length rather than this value. 
 * The method is simply here for java bean completeness.
 */
public void setNumberOfVariableDatumRecords(long pNumberOfVariableDatumRecords)
{ numberOfVariableDatumRecords = pNumberOfVariableDatumRecords;
}

public void setVariableDatumList(List pVariableDatumList)
{ variableDatumList = pVariableDatumList;
}

@XmlElementWrapper(name="variableDatumListList" )
public List getVariableDatumList()
{ return variableDatumList; }


public void marshal(DataOutputStream dos)
{
    super.marshal(dos);
    try 
    {
       aggregateID.marshal(dos);
       dos.writeByte( (byte)forceID);
       dos.writeByte( (byte)aggregateState);
       aggregateType.marshal(dos);
       dos.writeInt( (int)formation);
       aggregateMarking.marshal(dos);
       dimensions.marshal(dos);
       orientation.marshal(dos);
       centerOfMass.marshal(dos);
       velocity.marshal(dos);
       dos.writeShort( (short)aggregateIDList.size());
       dos.writeShort( (short)entityIDList.size());
       dos.writeShort( (short)silentAggregateSystemList.size());
       dos.writeShort( (short)silentEntitySystemList.size());

       for(int idx = 0; idx < aggregateIDList.size(); idx++)
       {
            AggregateID aAggregateID = (AggregateID)aggregateIDList.get(idx);
            aAggregateID.marshal(dos);
       } // end of list marshalling


       for(int idx = 0; idx < entityIDList.size(); idx++)
       {
            EntityID aEntityID = (EntityID)entityIDList.get(idx);
            aEntityID.marshal(dos);
       } // end of list marshalling

       dos.writeByte( (byte)pad2);

       for(int idx = 0; idx < silentAggregateSystemList.size(); idx++)
       {
            EntityType aEntityType = (EntityType)silentAggregateSystemList.get(idx);
            aEntityType.marshal(dos);
       } // end of list marshalling


       for(int idx = 0; idx < silentEntitySystemList.size(); idx++)
       {
            EntityType aEntityType = (EntityType)silentEntitySystemList.get(idx);
            aEntityType.marshal(dos);
       } // end of list marshalling

       dos.writeInt( (int)variableDatumList.size());

       for(int idx = 0; idx < variableDatumList.size(); idx++)
       {
            VariableDatum aVariableDatum = (VariableDatum)variableDatumList.get(idx);
            aVariableDatum.marshal(dos);
       } // end of list marshalling

    } // end try 
    catch(Exception e)
    { 
      System.out.println(e);}
    } // end of marshal method

public void unmarshal(DataInputStream dis)
{
    super.unmarshal(dis);

    try 
    {
       aggregateID.unmarshal(dis);
       forceID = (short)dis.readUnsignedByte();
       aggregateState = (short)dis.readUnsignedByte();
       aggregateType.unmarshal(dis);
       formation = dis.readInt();
       aggregateMarking.unmarshal(dis);
       dimensions.unmarshal(dis);
       orientation.unmarshal(dis);
       centerOfMass.unmarshal(dis);
       velocity.unmarshal(dis);
       numberOfDisAggregates = (int)dis.readUnsignedShort();
       numberOfDisEntities = (int)dis.readUnsignedShort();
       numberOfSilentAggregateTypes = (int)dis.readUnsignedShort();
       numberOfSilentEntityTypes = (int)dis.readUnsignedShort();
        for(int idx = 0; idx < numberOfDisAggregates; idx++)
        {
           AggregateID anX = new AggregateID();
            anX.unmarshal(dis);
            aggregateIDList.add(anX);
        };

        for(int idx = 0; idx < numberOfDisEntities; idx++)
        {
           EntityID anX = new EntityID();
            anX.unmarshal(dis);
            entityIDList.add(anX);
        };

       pad2 = (short)dis.readUnsignedByte();
        for(int idx = 0; idx < numberOfSilentAggregateTypes; idx++)
        {
           EntityType anX = new EntityType();
            anX.unmarshal(dis);
            silentAggregateSystemList.add(anX);
        };

        for(int idx = 0; idx < numberOfSilentEntityTypes; idx++)
        {
           EntityType anX = new EntityType();
            anX.unmarshal(dis);
            silentEntitySystemList.add(anX);
        };

       numberOfVariableDatumRecords = dis.readInt();
        for(int idx = 0; idx < numberOfVariableDatumRecords; idx++)
        {
           VariableDatum anX = new VariableDatum();
            anX.unmarshal(dis);
            variableDatumList.add(anX);
        };

    } // end try 
   catch(Exception e)
    { 
      System.out.println(e); 
    }
 } // end of unmarshal method 


 /**
  * The equals method doesn't always work--mostly on on classes that consist only of primitives. Be careful.
  */
 public boolean equals(AggregateStatePdu rhs)
 {
     boolean ivarsEqual = true;

    if(rhs.getClass() != this.getClass())
        return false;

     if( ! (aggregateID.equals( rhs.aggregateID) )) ivarsEqual = false;
     if( ! (forceID == rhs.forceID)) ivarsEqual = false;
     if( ! (aggregateState == rhs.aggregateState)) ivarsEqual = false;
     if( ! (aggregateType.equals( rhs.aggregateType) )) ivarsEqual = false;
     if( ! (formation == rhs.formation)) ivarsEqual = false;
     if( ! (aggregateMarking.equals( rhs.aggregateMarking) )) ivarsEqual = false;
     if( ! (dimensions.equals( rhs.dimensions) )) ivarsEqual = false;
     if( ! (orientation.equals( rhs.orientation) )) ivarsEqual = false;
     if( ! (centerOfMass.equals( rhs.centerOfMass) )) ivarsEqual = false;
     if( ! (velocity.equals( rhs.velocity) )) ivarsEqual = false;
     if( ! (numberOfDisAggregates == rhs.numberOfDisAggregates)) ivarsEqual = false;
     if( ! (numberOfDisEntities == rhs.numberOfDisEntities)) ivarsEqual = false;
     if( ! (numberOfSilentAggregateTypes == rhs.numberOfSilentAggregateTypes)) ivarsEqual = false;
     if( ! (numberOfSilentEntityTypes == rhs.numberOfSilentEntityTypes)) ivarsEqual = false;

     for(int idx = 0; idx < aggregateIDList.size(); idx++)
     {
        AggregateID x = (AggregateID)aggregateIDList.get(idx);
        if( ! ( aggregateIDList.get(idx).equals(rhs.aggregateIDList.get(idx)))) ivarsEqual = false;
     }


     for(int idx = 0; idx < entityIDList.size(); idx++)
     {
        EntityID x = (EntityID)entityIDList.get(idx);
        if( ! ( entityIDList.get(idx).equals(rhs.entityIDList.get(idx)))) ivarsEqual = false;
     }

     if( ! (pad2 == rhs.pad2)) ivarsEqual = false;

     for(int idx = 0; idx < silentAggregateSystemList.size(); idx++)
     {
        EntityType x = (EntityType)silentAggregateSystemList.get(idx);
        if( ! ( silentAggregateSystemList.get(idx).equals(rhs.silentAggregateSystemList.get(idx)))) ivarsEqual = false;
     }


     for(int idx = 0; idx < silentEntitySystemList.size(); idx++)
     {
        EntityType x = (EntityType)silentEntitySystemList.get(idx);
        if( ! ( silentEntitySystemList.get(idx).equals(rhs.silentEntitySystemList.get(idx)))) ivarsEqual = false;
     }

     if( ! (numberOfVariableDatumRecords == rhs.numberOfVariableDatumRecords)) ivarsEqual = false;

     for(int idx = 0; idx < variableDatumList.size(); idx++)
     {
        VariableDatum x = (VariableDatum)variableDatumList.get(idx);
        if( ! ( variableDatumList.get(idx).equals(rhs.variableDatumList.get(idx)))) ivarsEqual = false;
     }


    return ivarsEqual;
 }
} // end of class
// Copyright (c) 1995-2009 held by the author(s).  All rights reserved.
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions
//  are met:
// 
//  * Redistributions of source code must retain the above copyright
// notice, this list of conditions and the following disclaimer.
// * Redistributions in binary form must reproduce the above copyright
// notice, this list of conditions and the following disclaimer
// in the documentation and/or other materials provided with the
// distribution.
// * Neither the names of the Naval Postgraduate School (NPS)
//  Modeling Virtual Environments and Simulation (MOVES) Institute
// (http://www.nps.edu and http://www.MovesInstitute.org)
// nor the names of its contributors may be used to endorse or
//  promote products derived from this software without specific
// prior written permission.
// 
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
// AS IS AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
// LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
// FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
// COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
// INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
// BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
// LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
// CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
// LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
// ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
// POSSIBILITY OF SUCH DAMAGE.
