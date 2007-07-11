package edu.nps.moves.dis;

import java.util.*;
import java.io.*;

/**
 * Section 5.3.6.11. Reports occurance of a significant event to the simulation manager. COMPLETE
 *
 * Copyright (c) 2007, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class EventReportPdu extends SimulationManagementPdu
{
   /** Type of event */
   protected long  eventType;

   /** padding */
   protected long  padding1 = 0;

   /** Number of fixed datum records */
   protected long  numberOfFixedDatumRecords;

   /** Number of variable datum records */
   protected long  numberOfVariableDatumRecords;

   /** variable length list of fixed datums */
   protected List fixedDatums = new ArrayList(); 
   /** variable length list of variable length datums */
   protected List variableDatums = new ArrayList(); 

/** Constructor */
 public EventReportPdu()
 {
    setPduType( (short)21 );
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   marshalSize = marshalSize + 4;  // eventType
   marshalSize = marshalSize + 4;  // padding1
   marshalSize = marshalSize + 4;  // numberOfFixedDatumRecords
   marshalSize = marshalSize + 4;  // numberOfVariableDatumRecords
   for(int idx=0; idx < fixedDatums.size(); idx++)
   {
        FixedDatum listElement = (FixedDatum)fixedDatums.get(idx);
        marshalSize = marshalSize + listElement.getMarshalledSize();
   }
   for(int idx=0; idx < variableDatums.size(); idx++)
   {
        VariableDatum listElement = (VariableDatum)variableDatums.get(idx);
        marshalSize = marshalSize + listElement.getMarshalledSize();
   }

   return marshalSize;
}


public void setEventType(long pEventType)
{ eventType = pEventType;
}

public long getEventType()
{ return eventType; 
}

public void setPadding1(long pPadding1)
{ padding1 = pPadding1;
}

public long getPadding1()
{ return padding1; 
}

public long getNumberOfFixedDatumRecords()
{ return (long)fixedDatums.size();
}

public long getNumberOfVariableDatumRecords()
{ return (long)variableDatums.size();
}

public void setFixedDatums(List pFixedDatums)
{ fixedDatums = pFixedDatums;
}

public List getFixedDatums()
{ return fixedDatums; }

public void setVariableDatums(List pVariableDatums)
{ variableDatums = pVariableDatums;
}

public List getVariableDatums()
{ return variableDatums; }


public void marshal(DataOutputStream dos)
{
    super.marshal(dos);
    try 
    {
       dos.writeInt( (int)eventType);
       dos.writeInt( (int)padding1);
       dos.writeInt( (int)fixedDatums.size());
       dos.writeInt( (int)variableDatums.size());

       for(int idx = 0; idx < fixedDatums.size(); idx++)
       {
            FixedDatum aFixedDatum = (FixedDatum)fixedDatums.get(idx);
            aFixedDatum.marshal(dos);
       } // end of list marshalling


       for(int idx = 0; idx < variableDatums.size(); idx++)
       {
            VariableDatum aVariableDatum = (VariableDatum)variableDatums.get(idx);
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
       eventType = dis.readInt();
       padding1 = dis.readInt();
       numberOfFixedDatumRecords = dis.readInt();
       numberOfVariableDatumRecords = dis.readInt();
        for(int idx = 0; idx < numberOfFixedDatumRecords; idx++)
        {
           FixedDatum anX = new FixedDatum();
            anX.unmarshal(dis);
            fixedDatums.add(anX);
        };

        for(int idx = 0; idx < numberOfVariableDatumRecords; idx++)
        {
           VariableDatum anX = new VariableDatum();
            anX.unmarshal(dis);
            variableDatums.add(anX);
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
 public boolean equals(EventReportPdu rhs)
 {
     boolean ivarsEqual = true;

    if(rhs.getClass() != this.getClass())
        return false;

     if( ! (eventType == rhs.eventType)) ivarsEqual = false;
     if( ! (padding1 == rhs.padding1)) ivarsEqual = false;
     if( ! (numberOfFixedDatumRecords == rhs.numberOfFixedDatumRecords)) ivarsEqual = false;
     if( ! (numberOfVariableDatumRecords == rhs.numberOfVariableDatumRecords)) ivarsEqual = false;

     for(int idx = 0; idx < fixedDatums.size(); idx++)
     {
        FixedDatum x = (FixedDatum)fixedDatums.get(idx);
        if( ! ( fixedDatums.get(idx).equals(rhs.fixedDatums.get(idx)))) ivarsEqual = false;
     }


     for(int idx = 0; idx < variableDatums.size(); idx++)
     {
        VariableDatum x = (VariableDatum)variableDatums.get(idx);
        if( ! ( variableDatums.get(idx).equals(rhs.variableDatums.get(idx)))) ivarsEqual = false;
     }


    return ivarsEqual;
 }
} // end of class
