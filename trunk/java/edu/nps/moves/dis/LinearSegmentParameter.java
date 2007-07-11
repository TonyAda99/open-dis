package edu.nps.moves.dis;

import java.util.*;
import java.io.*;

/**
 * 5.2.48: Linear segment parameters
 *
 * Copyright (c) 2007, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class LinearSegmentParameter extends Object
{
   /** number of segments */
   protected short  segmentNumber;

   /** segment appearance */
   protected SixByteChunk  segmentAppearance = new SixByteChunk(); 

   /** location */
   protected Vector3Double  location = new Vector3Double(); 

   /** orientation */
   protected Orientation  orientation = new Orientation(); 

   /** segmentLength */
   protected int  segmentLength;

   /** segmentWidth */
   protected int  segmentWidth;

   /** segmentHeight */
   protected int  segmentHeight;

   /** segment Depth */
   protected int  segmentDepth;

   /** segment Depth */
   protected long  pad1;


/** Constructor */
 public LinearSegmentParameter()
 {
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = marshalSize + 1;  // segmentNumber
   marshalSize = marshalSize + segmentAppearance.getMarshalledSize();  // segmentAppearance
   marshalSize = marshalSize + location.getMarshalledSize();  // location
   marshalSize = marshalSize + orientation.getMarshalledSize();  // orientation
   marshalSize = marshalSize + 2;  // segmentLength
   marshalSize = marshalSize + 2;  // segmentWidth
   marshalSize = marshalSize + 2;  // segmentHeight
   marshalSize = marshalSize + 2;  // segmentDepth
   marshalSize = marshalSize + 4;  // pad1

   return marshalSize;
}


public void setSegmentNumber(short pSegmentNumber)
{ segmentNumber = pSegmentNumber;
}

public short getSegmentNumber()
{ return segmentNumber; 
}

public void setSegmentAppearance(SixByteChunk pSegmentAppearance)
{ segmentAppearance = pSegmentAppearance;
}

public SixByteChunk getSegmentAppearance()
{ return segmentAppearance; }

public void setLocation(Vector3Double pLocation)
{ location = pLocation;
}

public Vector3Double getLocation()
{ return location; }

public void setOrientation(Orientation pOrientation)
{ orientation = pOrientation;
}

public Orientation getOrientation()
{ return orientation; }

public void setSegmentLength(int pSegmentLength)
{ segmentLength = pSegmentLength;
}

public int getSegmentLength()
{ return segmentLength; 
}

public void setSegmentWidth(int pSegmentWidth)
{ segmentWidth = pSegmentWidth;
}

public int getSegmentWidth()
{ return segmentWidth; 
}

public void setSegmentHeight(int pSegmentHeight)
{ segmentHeight = pSegmentHeight;
}

public int getSegmentHeight()
{ return segmentHeight; 
}

public void setSegmentDepth(int pSegmentDepth)
{ segmentDepth = pSegmentDepth;
}

public int getSegmentDepth()
{ return segmentDepth; 
}

public void setPad1(long pPad1)
{ pad1 = pPad1;
}

public long getPad1()
{ return pad1; 
}


public void marshal(DataOutputStream dos)
{
    try 
    {
       dos.writeByte( (byte)segmentNumber);
       segmentAppearance.marshal(dos);
       location.marshal(dos);
       orientation.marshal(dos);
       dos.writeShort( (short)segmentLength);
       dos.writeShort( (short)segmentWidth);
       dos.writeShort( (short)segmentHeight);
       dos.writeShort( (short)segmentDepth);
       dos.writeInt( (int)pad1);
    } // end try 
    catch(Exception e)
    { 
      System.out.println(e);}
    } // end of marshal method

public void unmarshal(DataInputStream dis)
{
    try 
    {
       segmentNumber = dis.readByte();
       segmentAppearance.unmarshal(dis);
       location.unmarshal(dis);
       orientation.unmarshal(dis);
       segmentLength = dis.readShort();
       segmentWidth = dis.readShort();
       segmentHeight = dis.readShort();
       segmentDepth = dis.readShort();
       pad1 = dis.readInt();
    } // end try 
   catch(Exception e)
    { 
      System.out.println(e); 
    }
 } // end of unmarshal method 


 /**
  * The equals method doesn't always work--mostly on on classes that consist only of primitives. Be careful.
  */
 public boolean equals(LinearSegmentParameter rhs)
 {
     boolean ivarsEqual = true;

    if(rhs.getClass() != this.getClass())
        return false;

     if( ! (segmentNumber == rhs.segmentNumber)) ivarsEqual = false;
     if( ! (segmentAppearance.equals( rhs.segmentAppearance) )) ivarsEqual = false;
     if( ! (location.equals( rhs.location) )) ivarsEqual = false;
     if( ! (orientation.equals( rhs.orientation) )) ivarsEqual = false;
     if( ! (segmentLength == rhs.segmentLength)) ivarsEqual = false;
     if( ! (segmentWidth == rhs.segmentWidth)) ivarsEqual = false;
     if( ! (segmentHeight == rhs.segmentHeight)) ivarsEqual = false;
     if( ! (segmentDepth == rhs.segmentDepth)) ivarsEqual = false;
     if( ! (pad1 == rhs.pad1)) ivarsEqual = false;

    return ivarsEqual;
 }
} // end of class
