package edu.nps.moves.dis;

import java.util.*;
import java.io.*;
import javax.xml.bind.annotation.*;

/**
 * Section 5.2.6.3. Start or resume an exercise. COMPLETE
 *
 * Copyright (c) 2008, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class StartResumePdu extends SimulationManagementFamilyPdu implements Serializable
{
   /** UTC time at which the simulation shall start or resume */
   protected ClockTime  realWorldTime = new ClockTime(); 

   /** Simulation clock time at which the simulation shall start or resume */
   protected ClockTime  simulationTime = new ClockTime(); 

   /** Identifier for the request */
   protected long  requestID;


/** Constructor */
 public StartResumePdu()
 {
    setPduType( (short)13 );
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   marshalSize = marshalSize + realWorldTime.getMarshalledSize();  // realWorldTime
   marshalSize = marshalSize + simulationTime.getMarshalledSize();  // simulationTime
   marshalSize = marshalSize + 4;  // requestID

   return marshalSize;
}


public void setRealWorldTime(ClockTime pRealWorldTime)
{ realWorldTime = pRealWorldTime;
}

@XmlElement
public ClockTime getRealWorldTime()
{ return realWorldTime; 
}

public void setSimulationTime(ClockTime pSimulationTime)
{ simulationTime = pSimulationTime;
}

@XmlElement
public ClockTime getSimulationTime()
{ return simulationTime; 
}

public void setRequestID(long pRequestID)
{ requestID = pRequestID;
}

@XmlAttribute
public long getRequestID()
{ return requestID; 
}


public void marshal(DataOutputStream dos)
{
    super.marshal(dos);
    try 
    {
       realWorldTime.marshal(dos);
       simulationTime.marshal(dos);
       dos.writeInt( (int)requestID);
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
       realWorldTime.unmarshal(dis);
       simulationTime.unmarshal(dis);
       requestID = dis.readInt();
    } // end try 
   catch(Exception e)
    { 
      System.out.println(e); 
    }
 } // end of unmarshal method 


 /**
  * The equals method doesn't always work--mostly on on classes that consist only of primitives. Be careful.
  */
 public boolean equals(StartResumePdu rhs)
 {
     boolean ivarsEqual = true;

    if(rhs.getClass() != this.getClass())
        return false;

     if( ! (realWorldTime.equals( rhs.realWorldTime) )) ivarsEqual = false;
     if( ! (simulationTime.equals( rhs.simulationTime) )) ivarsEqual = false;
     if( ! (requestID == rhs.requestID)) ivarsEqual = false;

    return ivarsEqual;
 }
} // end of class
