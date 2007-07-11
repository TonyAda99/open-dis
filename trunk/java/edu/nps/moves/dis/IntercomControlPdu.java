package edu.nps.moves.dis;

import java.util.*;
import java.io.*;

/**
 * Section 5.3.8.5. Detailed inofrmation about the state of an intercom device and the actions it is requestion         of another intercom device, or the response to a requested action. Required manual intervention to fix the intercom parameters,        which can be of varialbe length. UNFINSISHED
 *
 * Copyright (c) 2007, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class IntercomControlPdu extends RadioCommunicationsPdu
{
   /** control type */
   protected short  controlType;

   /** control type */
   protected short  communicationsChannelType;

   /** Source entity ID */
   protected EntityID  sourceEntityID = new EntityID(); 

   /** The specific intercom device being simulated within an entity. */
   protected short  sourceCommunicationsDeviceID;

   /** Line number to which the intercom control refers */
   protected short  sourceLineID;

   /** priority of this message relative to transmissons from other intercom devices */
   protected short  transmitPriority;

   /** current transmit state of the line */
   protected short  transmitLineState;

   /** detailed type requested. */
   protected short  command;

   /** eid of the entity that has created this intercom channel. */
   protected EntityID  masterEntityID = new EntityID(); 

   /** specific intercom device that has created this intercom channel */
   protected int  masterCommunicationsDeviceID;

   /** number of intercom parameters */
   protected long  intercomParametersLength;

   /** @@@This is wrong--the length of the data field is variable. Using a long for now. */
   protected List intercomParameters = new ArrayList(); 

/** Constructor */
 public IntercomControlPdu()
 {
    setPduType( (short)32 );
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   marshalSize = marshalSize + 1;  // controlType
   marshalSize = marshalSize + 1;  // communicationsChannelType
   marshalSize = marshalSize + sourceEntityID.getMarshalledSize();  // sourceEntityID
   marshalSize = marshalSize + 1;  // sourceCommunicationsDeviceID
   marshalSize = marshalSize + 1;  // sourceLineID
   marshalSize = marshalSize + 1;  // transmitPriority
   marshalSize = marshalSize + 1;  // transmitLineState
   marshalSize = marshalSize + 1;  // command
   marshalSize = marshalSize + masterEntityID.getMarshalledSize();  // masterEntityID
   marshalSize = marshalSize + 2;  // masterCommunicationsDeviceID
   marshalSize = marshalSize + 4;  // intercomParametersLength
   for(int idx=0; idx < intercomParameters.size(); idx++)
   {
        IntercomCommunicationsParameters listElement = (IntercomCommunicationsParameters)intercomParameters.get(idx);
        marshalSize = marshalSize + listElement.getMarshalledSize();
   }

   return marshalSize;
}


public void setControlType(short pControlType)
{ controlType = pControlType;
}

public short getControlType()
{ return controlType; 
}

public void setCommunicationsChannelType(short pCommunicationsChannelType)
{ communicationsChannelType = pCommunicationsChannelType;
}

public short getCommunicationsChannelType()
{ return communicationsChannelType; 
}

public void setSourceEntityID(EntityID pSourceEntityID)
{ sourceEntityID = pSourceEntityID;
}

public EntityID getSourceEntityID()
{ return sourceEntityID; }

public void setSourceCommunicationsDeviceID(short pSourceCommunicationsDeviceID)
{ sourceCommunicationsDeviceID = pSourceCommunicationsDeviceID;
}

public short getSourceCommunicationsDeviceID()
{ return sourceCommunicationsDeviceID; 
}

public void setSourceLineID(short pSourceLineID)
{ sourceLineID = pSourceLineID;
}

public short getSourceLineID()
{ return sourceLineID; 
}

public void setTransmitPriority(short pTransmitPriority)
{ transmitPriority = pTransmitPriority;
}

public short getTransmitPriority()
{ return transmitPriority; 
}

public void setTransmitLineState(short pTransmitLineState)
{ transmitLineState = pTransmitLineState;
}

public short getTransmitLineState()
{ return transmitLineState; 
}

public void setCommand(short pCommand)
{ command = pCommand;
}

public short getCommand()
{ return command; 
}

public void setMasterEntityID(EntityID pMasterEntityID)
{ masterEntityID = pMasterEntityID;
}

public EntityID getMasterEntityID()
{ return masterEntityID; }

public void setMasterCommunicationsDeviceID(int pMasterCommunicationsDeviceID)
{ masterCommunicationsDeviceID = pMasterCommunicationsDeviceID;
}

public int getMasterCommunicationsDeviceID()
{ return masterCommunicationsDeviceID; 
}

public long getIntercomParametersLength()
{ return (long)intercomParameters.size();
}

public void setIntercomParameters(List pIntercomParameters)
{ intercomParameters = pIntercomParameters;
}

public List getIntercomParameters()
{ return intercomParameters; }


public void marshal(DataOutputStream dos)
{
    super.marshal(dos);
    try 
    {
       dos.writeByte( (byte)controlType);
       dos.writeByte( (byte)communicationsChannelType);
       sourceEntityID.marshal(dos);
       dos.writeByte( (byte)sourceCommunicationsDeviceID);
       dos.writeByte( (byte)sourceLineID);
       dos.writeByte( (byte)transmitPriority);
       dos.writeByte( (byte)transmitLineState);
       dos.writeByte( (byte)command);
       masterEntityID.marshal(dos);
       dos.writeShort( (short)masterCommunicationsDeviceID);
       dos.writeInt( (int)intercomParameters.size());

       for(int idx = 0; idx < intercomParameters.size(); idx++)
       {
            IntercomCommunicationsParameters aIntercomCommunicationsParameters = (IntercomCommunicationsParameters)intercomParameters.get(idx);
            aIntercomCommunicationsParameters.marshal(dos);
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
       controlType = dis.readByte();
       communicationsChannelType = dis.readByte();
       sourceEntityID.unmarshal(dis);
       sourceCommunicationsDeviceID = dis.readByte();
       sourceLineID = dis.readByte();
       transmitPriority = dis.readByte();
       transmitLineState = dis.readByte();
       command = dis.readByte();
       masterEntityID.unmarshal(dis);
       masterCommunicationsDeviceID = dis.readShort();
       intercomParametersLength = dis.readInt();
        for(int idx = 0; idx < intercomParametersLength; idx++)
        {
           IntercomCommunicationsParameters anX = new IntercomCommunicationsParameters();
            anX.unmarshal(dis);
            intercomParameters.add(anX);
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
 public boolean equals(IntercomControlPdu rhs)
 {
     boolean ivarsEqual = true;

    if(rhs.getClass() != this.getClass())
        return false;

     if( ! (controlType == rhs.controlType)) ivarsEqual = false;
     if( ! (communicationsChannelType == rhs.communicationsChannelType)) ivarsEqual = false;
     if( ! (sourceEntityID.equals( rhs.sourceEntityID) )) ivarsEqual = false;
     if( ! (sourceCommunicationsDeviceID == rhs.sourceCommunicationsDeviceID)) ivarsEqual = false;
     if( ! (sourceLineID == rhs.sourceLineID)) ivarsEqual = false;
     if( ! (transmitPriority == rhs.transmitPriority)) ivarsEqual = false;
     if( ! (transmitLineState == rhs.transmitLineState)) ivarsEqual = false;
     if( ! (command == rhs.command)) ivarsEqual = false;
     if( ! (masterEntityID.equals( rhs.masterEntityID) )) ivarsEqual = false;
     if( ! (masterCommunicationsDeviceID == rhs.masterCommunicationsDeviceID)) ivarsEqual = false;
     if( ! (intercomParametersLength == rhs.intercomParametersLength)) ivarsEqual = false;

     for(int idx = 0; idx < intercomParameters.size(); idx++)
     {
        IntercomCommunicationsParameters x = (IntercomCommunicationsParameters)intercomParameters.get(idx);
        if( ! ( intercomParameters.get(idx).equals(rhs.intercomParameters.get(idx)))) ivarsEqual = false;
     }


    return ivarsEqual;
 }
} // end of class
