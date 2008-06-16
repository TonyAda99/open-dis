package edu.nps.moves.dis;

import java.util.*;
import java.io.*;
import javax.xml.bind.annotation.*;

/**
 * Section 5.2.30. A supply, and the amount of that supply. Similar to an entity kind but with the addition of a quantity.
 *
 * Copyright (c) 2008, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class SupplyQuantity extends Object implements Serializable
{
   /** Type of supply */
   protected EntityID  supplyType = new EntityID(); 

   /** quantity to be supplied */
   protected short  quantity;


/** Constructor */
 public SupplyQuantity()
 {
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = marshalSize + supplyType.getMarshalledSize();  // supplyType
   marshalSize = marshalSize + 1;  // quantity

   return marshalSize;
}


public void setSupplyType(EntityID pSupplyType)
{ supplyType = pSupplyType;
}

@XmlElement
public EntityID getSupplyType()
{ return supplyType; 
}

public void setQuantity(short pQuantity)
{ quantity = pQuantity;
}

@XmlAttribute
public short getQuantity()
{ return quantity; 
}


public void marshal(DataOutputStream dos)
{
    try 
    {
       supplyType.marshal(dos);
       dos.writeByte( (byte)quantity);
    } // end try 
    catch(Exception e)
    { 
      System.out.println(e);}
    } // end of marshal method

public void unmarshal(DataInputStream dis)
{
    try 
    {
       supplyType.unmarshal(dis);
       quantity = (short)dis.readUnsignedByte();
    } // end try 
   catch(Exception e)
    { 
      System.out.println(e); 
    }
 } // end of unmarshal method 


 /**
  * The equals method doesn't always work--mostly on on classes that consist only of primitives. Be careful.
  */
 public boolean equals(SupplyQuantity rhs)
 {
     boolean ivarsEqual = true;

    if(rhs.getClass() != this.getClass())
        return false;

     if( ! (supplyType.equals( rhs.supplyType) )) ivarsEqual = false;
     if( ! (quantity == rhs.quantity)) ivarsEqual = false;

    return ivarsEqual;
 }
} // end of class
