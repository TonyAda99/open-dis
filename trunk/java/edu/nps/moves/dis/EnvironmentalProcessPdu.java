package edu.nps.moves.dis;

import java.util.*;
import java.io.*;

/**
 * Section 5.3.11.1: Information about environmental effects and processes. This requires manual cleanup. the environmental        record is variable, as is the padding. UNFINISHED
 *
 * Copyright (c) 2007, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class EnvironmentalProcessPdu extends SyntheticEnvironmentPduFamily
{
   /** Environmental process ID */
   protected EntityID  environementalProcessID = new EntityID(); 

   /** Environment type */
   protected EntityType  environmentType = new EntityType(); 

   /** model type */
   protected short  modelType;

   /** Environment status */
   protected short  environmentStatus;

   /** number of environment records  */
   protected short  numberOfEnvironmentRecords;

   /** PDU sequence number for the environmentla process if pdu sequencing required */
   protected int  sequenceNumber;

   /** environemt records */
   protected List environmentRecords = new ArrayList(); 

/** Constructor */
 public EnvironmentalProcessPdu()
 {
    setPduType( (short)41 );
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   marshalSize = marshalSize + environementalProcessID.getMarshalledSize();  // environementalProcessID
   marshalSize = marshalSize + environmentType.getMarshalledSize();  // environmentType
   marshalSize = marshalSize + 1;  // modelType
   marshalSize = marshalSize + 1;  // environmentStatus
   marshalSize = marshalSize + 1;  // numberOfEnvironmentRecords
   marshalSize = marshalSize + 2;  // sequenceNumber
   for(int idx=0; idx < environmentRecords.size(); idx++)
   {
        Environment listElement = (Environment)environmentRecords.get(idx);
        marshalSize = marshalSize + listElement.getMarshalledSize();
   }

   return marshalSize;
}


public void setEnvironementalProcessID(EntityID pEnvironementalProcessID)
{ environementalProcessID = pEnvironementalProcessID;
}

public EntityID getEnvironementalProcessID()
{ return environementalProcessID; }

public void setEnvironmentType(EntityType pEnvironmentType)
{ environmentType = pEnvironmentType;
}

public EntityType getEnvironmentType()
{ return environmentType; }

public void setModelType(short pModelType)
{ modelType = pModelType;
}

public short getModelType()
{ return modelType; 
}

public void setEnvironmentStatus(short pEnvironmentStatus)
{ environmentStatus = pEnvironmentStatus;
}

public short getEnvironmentStatus()
{ return environmentStatus; 
}

public short getNumberOfEnvironmentRecords()
{ return (short)environmentRecords.size();
}

public void setSequenceNumber(int pSequenceNumber)
{ sequenceNumber = pSequenceNumber;
}

public int getSequenceNumber()
{ return sequenceNumber; 
}

public void setEnvironmentRecords(List pEnvironmentRecords)
{ environmentRecords = pEnvironmentRecords;
}

public List getEnvironmentRecords()
{ return environmentRecords; }


public void marshal(DataOutputStream dos)
{
    super.marshal(dos);
    try 
    {
       environementalProcessID.marshal(dos);
       environmentType.marshal(dos);
       dos.writeByte( (byte)modelType);
       dos.writeByte( (byte)environmentStatus);
       dos.writeByte( (byte)environmentRecords.size());
       dos.writeShort( (short)sequenceNumber);

       for(int idx = 0; idx < environmentRecords.size(); idx++)
       {
            Environment aEnvironment = (Environment)environmentRecords.get(idx);
            aEnvironment.marshal(dos);
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
       environementalProcessID.unmarshal(dis);
       environmentType.unmarshal(dis);
       modelType = dis.readByte();
       environmentStatus = dis.readByte();
       numberOfEnvironmentRecords = dis.readByte();
       sequenceNumber = dis.readShort();
        for(int idx = 0; idx < numberOfEnvironmentRecords; idx++)
        {
           Environment anX = new Environment();
            anX.unmarshal(dis);
            environmentRecords.add(anX);
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
 public boolean equals(EnvironmentalProcessPdu rhs)
 {
     boolean ivarsEqual = true;

    if(rhs.getClass() != this.getClass())
        return false;

     if( ! (environementalProcessID.equals( rhs.environementalProcessID) )) ivarsEqual = false;
     if( ! (environmentType.equals( rhs.environmentType) )) ivarsEqual = false;
     if( ! (modelType == rhs.modelType)) ivarsEqual = false;
     if( ! (environmentStatus == rhs.environmentStatus)) ivarsEqual = false;
     if( ! (numberOfEnvironmentRecords == rhs.numberOfEnvironmentRecords)) ivarsEqual = false;
     if( ! (sequenceNumber == rhs.sequenceNumber)) ivarsEqual = false;

     for(int idx = 0; idx < environmentRecords.size(); idx++)
     {
        Environment x = (Environment)environmentRecords.get(idx);
        if( ! ( environmentRecords.get(idx).equals(rhs.environmentRecords.get(idx)))) ivarsEqual = false;
     }


    return ivarsEqual;
 }
} // end of class
