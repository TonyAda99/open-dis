package edu.nps.moves.dis7mobile;

import java.util.*;
import java.io.*;
import edu.nps.moves.disenum.*;



/**
 * The False Targets attribute record shall be used to communicate discrete values that are associated with false targets jamming that cannot be referenced to an emitter mode. The values provided in the False Targets attri- bute record shall be considered valid only for the victim radar beams listed in the jamming beam's Track/Jam Data records (provided in the associated Electromagnetic Emission PDU). Section 6.2.12.3
 *
 * Copyright (c) 2008-2010, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class FalseTargetsAttribute extends Object implements Serializable
{
   protected long  recordType = (long)3502;

   protected int  recordLength = (int)40;

   protected int  padding = (int)0;

   protected short  emitterNumber;

   protected short  beamNumber;

   protected short  stateIndicator;

   protected short  padding2 = (short)0;

   protected float  falseTargetCount;

   protected float  walkSpeed;

   protected float  walkAcceleration;

   protected float  maximumWalkDistance;

   protected float  keepTime;

   protected float  echoSpacing;

   protected long  padding3 = (long)0;


/** Constructor */
 public FalseTargetsAttribute()
 {
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = marshalSize + 4;  // recordType
   marshalSize = marshalSize + 2;  // recordLength
   marshalSize = marshalSize + 2;  // padding
   marshalSize = marshalSize + 1;  // emitterNumber
   marshalSize = marshalSize + 1;  // beamNumber
   marshalSize = marshalSize + 1;  // stateIndicator
   marshalSize = marshalSize + 1;  // padding2
   marshalSize = marshalSize + 4;  // falseTargetCount
   marshalSize = marshalSize + 4;  // walkSpeed
   marshalSize = marshalSize + 4;  // walkAcceleration
   marshalSize = marshalSize + 4;  // maximumWalkDistance
   marshalSize = marshalSize + 4;  // keepTime
   marshalSize = marshalSize + 4;  // echoSpacing
   marshalSize = marshalSize + 4;  // padding3

   return marshalSize;
}


public void setRecordType(long pRecordType)
{ recordType = pRecordType;
}

public long getRecordType()
{ return recordType; 
}

public void setRecordLength(int pRecordLength)
{ recordLength = pRecordLength;
}

public int getRecordLength()
{ return recordLength; 
}

public void setPadding(int pPadding)
{ padding = pPadding;
}

public int getPadding()
{ return padding; 
}

public void setEmitterNumber(short pEmitterNumber)
{ emitterNumber = pEmitterNumber;
}

public short getEmitterNumber()
{ return emitterNumber; 
}

public void setBeamNumber(short pBeamNumber)
{ beamNumber = pBeamNumber;
}

public short getBeamNumber()
{ return beamNumber; 
}

public void setStateIndicator(short pStateIndicator)
{ stateIndicator = pStateIndicator;
}

public short getStateIndicator()
{ return stateIndicator; 
}

public void setPadding2(short pPadding2)
{ padding2 = pPadding2;
}

public short getPadding2()
{ return padding2; 
}

public void setFalseTargetCount(float pFalseTargetCount)
{ falseTargetCount = pFalseTargetCount;
}

public float getFalseTargetCount()
{ return falseTargetCount; 
}

public void setWalkSpeed(float pWalkSpeed)
{ walkSpeed = pWalkSpeed;
}

public float getWalkSpeed()
{ return walkSpeed; 
}

public void setWalkAcceleration(float pWalkAcceleration)
{ walkAcceleration = pWalkAcceleration;
}

public float getWalkAcceleration()
{ return walkAcceleration; 
}

public void setMaximumWalkDistance(float pMaximumWalkDistance)
{ maximumWalkDistance = pMaximumWalkDistance;
}

public float getMaximumWalkDistance()
{ return maximumWalkDistance; 
}

public void setKeepTime(float pKeepTime)
{ keepTime = pKeepTime;
}

public float getKeepTime()
{ return keepTime; 
}

public void setEchoSpacing(float pEchoSpacing)
{ echoSpacing = pEchoSpacing;
}

public float getEchoSpacing()
{ return echoSpacing; 
}

public void setPadding3(long pPadding3)
{ padding3 = pPadding3;
}

public long getPadding3()
{ return padding3; 
}


public void marshal(DataOutputStream dos)
{
    try 
    {
       dos.writeInt( (int)recordType);
       dos.writeShort( (short)recordLength);
       dos.writeShort( (short)padding);
       dos.writeByte( (byte)emitterNumber);
       dos.writeByte( (byte)beamNumber);
       dos.writeByte( (byte)stateIndicator);
       dos.writeByte( (byte)padding2);
       dos.writeFloat( (float)falseTargetCount);
       dos.writeFloat( (float)walkSpeed);
       dos.writeFloat( (float)walkAcceleration);
       dos.writeFloat( (float)maximumWalkDistance);
       dos.writeFloat( (float)keepTime);
       dos.writeFloat( (float)echoSpacing);
       dos.writeInt( (int)padding3);
    } // end try 
    catch(Exception e)
    { 
      System.out.println(e);}
    } // end of marshal method

public void unmarshal(DataInputStream dis)
{
    try 
    {
       recordType = dis.readInt();
       recordLength = (int)dis.readUnsignedShort();
       padding = (int)dis.readUnsignedShort();
       emitterNumber = (short)dis.readUnsignedByte();
       beamNumber = (short)dis.readUnsignedByte();
       stateIndicator = (short)dis.readUnsignedByte();
       padding2 = (short)dis.readUnsignedByte();
       falseTargetCount = dis.readFloat();
       walkSpeed = dis.readFloat();
       walkAcceleration = dis.readFloat();
       maximumWalkDistance = dis.readFloat();
       keepTime = dis.readFloat();
       echoSpacing = dis.readFloat();
       padding3 = dis.readInt();
    } // end try 
   catch(Exception e)
    { 
      System.out.println(e); 
    }
 } // end of unmarshal method 


/**
 * Packs a Pdu into the ByteBuffer.
 * @throws java.nio.BufferOverflowException if buff is too small
 * @throws java.nio.ReadOnlyBufferException if buff is read only
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin writing
 * @since ??
 */
public void marshal(java.nio.ByteBuffer buff)
{
       buff.putInt( (int)recordType);
       buff.putShort( (short)recordLength);
       buff.putShort( (short)padding);
       buff.put( (byte)emitterNumber);
       buff.put( (byte)beamNumber);
       buff.put( (byte)stateIndicator);
       buff.put( (byte)padding2);
       buff.putFloat( (float)falseTargetCount);
       buff.putFloat( (float)walkSpeed);
       buff.putFloat( (float)walkAcceleration);
       buff.putFloat( (float)maximumWalkDistance);
       buff.putFloat( (float)keepTime);
       buff.putFloat( (float)echoSpacing);
       buff.putInt( (int)padding3);
    } // end of marshal method

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if buff is too small
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin reading
 * @since ??
 */
public void unmarshal(java.nio.ByteBuffer buff)
{
       recordType = buff.getInt();
       recordLength = (int)(buff.getShort() & 0xFFFF);
       padding = (int)(buff.getShort() & 0xFFFF);
       emitterNumber = (short)(buff.get() & 0xFF);
       beamNumber = (short)(buff.get() & 0xFF);
       stateIndicator = (short)(buff.get() & 0xFF);
       padding2 = (short)(buff.get() & 0xFF);
       falseTargetCount = buff.getFloat();
       walkSpeed = buff.getFloat();
       walkAcceleration = buff.getFloat();
       maximumWalkDistance = buff.getFloat();
       keepTime = buff.getFloat();
       echoSpacing = buff.getFloat();
       padding3 = buff.getInt();
 } // end of unmarshal method 


 /*
  * The equals method doesn't always work--mostly it works only on classes that consist only of primitives. Be careful.
  */
@Override
 public boolean equals(Object obj)
 {

    if(this == obj){
      return true;
    }

    if(obj == null){
       return false;
    }

    if(getClass() != obj.getClass())
        return false;

    return equalsImpl(obj);
 }

 /**
  * Compare all fields that contribute to the state, ignoring
 transient and static fields, for <code>this</code> and the supplied object
  * @param obj the object to compare to
  * @return true if the objects are equal, false otherwise.
  */
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

    if(!(obj instanceof FalseTargetsAttribute))
        return false;

     final FalseTargetsAttribute rhs = (FalseTargetsAttribute)obj;

     if( ! (recordType == rhs.recordType)) ivarsEqual = false;
     if( ! (recordLength == rhs.recordLength)) ivarsEqual = false;
     if( ! (padding == rhs.padding)) ivarsEqual = false;
     if( ! (emitterNumber == rhs.emitterNumber)) ivarsEqual = false;
     if( ! (beamNumber == rhs.beamNumber)) ivarsEqual = false;
     if( ! (stateIndicator == rhs.stateIndicator)) ivarsEqual = false;
     if( ! (padding2 == rhs.padding2)) ivarsEqual = false;
     if( ! (falseTargetCount == rhs.falseTargetCount)) ivarsEqual = false;
     if( ! (walkSpeed == rhs.walkSpeed)) ivarsEqual = false;
     if( ! (walkAcceleration == rhs.walkAcceleration)) ivarsEqual = false;
     if( ! (maximumWalkDistance == rhs.maximumWalkDistance)) ivarsEqual = false;
     if( ! (keepTime == rhs.keepTime)) ivarsEqual = false;
     if( ! (echoSpacing == rhs.echoSpacing)) ivarsEqual = false;
     if( ! (padding3 == rhs.padding3)) ivarsEqual = false;

    return ivarsEqual;
 }
} // end of class
