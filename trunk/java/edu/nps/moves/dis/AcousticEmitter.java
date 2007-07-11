package edu.nps.moves.dis;

import java.util.*;
import java.io.*;

/**
 * Section 5.2.35. information about a specific UA emmtter
 *
 * Copyright (c) 2007, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class AcousticEmitter extends Object
{
   /** the system for a particular UA emitter, and an enumeration */
   protected int  acousticName;

   /** The function of the acoustic system */
   protected short  function;

   /** The UA emitter identification number relative to a specific system */
   protected short  acousticIdNumber;


/** Constructor */
 public AcousticEmitter()
 {
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = marshalSize + 2;  // acousticName
   marshalSize = marshalSize + 1;  // function
   marshalSize = marshalSize + 1;  // acousticIdNumber

   return marshalSize;
}


public void setAcousticName(int pAcousticName)
{ acousticName = pAcousticName;
}

public int getAcousticName()
{ return acousticName; 
}

public void setFunction(short pFunction)
{ function = pFunction;
}

public short getFunction()
{ return function; 
}

public void setAcousticIdNumber(short pAcousticIdNumber)
{ acousticIdNumber = pAcousticIdNumber;
}

public short getAcousticIdNumber()
{ return acousticIdNumber; 
}


public void marshal(DataOutputStream dos)
{
    try 
    {
       dos.writeShort( (short)acousticName);
       dos.writeByte( (byte)function);
       dos.writeByte( (byte)acousticIdNumber);
    } // end try 
    catch(Exception e)
    { 
      System.out.println(e);}
    } // end of marshal method

public void unmarshal(DataInputStream dis)
{
    try 
    {
       acousticName = dis.readShort();
       function = dis.readByte();
       acousticIdNumber = dis.readByte();
    } // end try 
   catch(Exception e)
    { 
      System.out.println(e); 
    }
 } // end of unmarshal method 


 /**
  * The equals method doesn't always work--mostly on on classes that consist only of primitives. Be careful.
  */
 public boolean equals(AcousticEmitter rhs)
 {
     boolean ivarsEqual = true;

    if(rhs.getClass() != this.getClass())
        return false;

     if( ! (acousticName == rhs.acousticName)) ivarsEqual = false;
     if( ! (function == rhs.function)) ivarsEqual = false;
     if( ! (acousticIdNumber == rhs.acousticIdNumber)) ivarsEqual = false;

    return ivarsEqual;
 }
} // end of class
