package edu.nps.moves.dis;

import java.util.*;
import java.io.*;
import javax.xml.bind.annotation.*;

/**
 * Section 5.2.7. Specifies the type of muntion fired, the type of warhead, the         type of fuse, the number of rounds fired, and the rate at which the roudns are fired in         rounds per minute.
 *
 * Copyright (c) 2008, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class BurstDescriptor extends Object implements Serializable
{
   /** What munition was used in the burst */
   protected EntityType  munition = new EntityType(); 

   /** type of warhead */
   protected int  warhead;

   /** type of fuse used */
   protected int  fuse;

   /** how many of the munition were fired */
   protected int  quantity;

   /** rate at which the munition was fired */
   protected int  rate;


/** Constructor */
 public BurstDescriptor()
 {
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = marshalSize + munition.getMarshalledSize();  // munition
   marshalSize = marshalSize + 2;  // warhead
   marshalSize = marshalSize + 2;  // fuse
   marshalSize = marshalSize + 2;  // quantity
   marshalSize = marshalSize + 2;  // rate

   return marshalSize;
}


public void setMunition(EntityType pMunition)
{ munition = pMunition;
}

@XmlElement
public EntityType getMunition()
{ return munition; 
}

public void setWarhead(int pWarhead)
{ warhead = pWarhead;
}

@XmlAttribute
public int getWarhead()
{ return warhead; 
}

public void setFuse(int pFuse)
{ fuse = pFuse;
}

@XmlAttribute
public int getFuse()
{ return fuse; 
}

public void setQuantity(int pQuantity)
{ quantity = pQuantity;
}

@XmlAttribute
public int getQuantity()
{ return quantity; 
}

public void setRate(int pRate)
{ rate = pRate;
}

@XmlAttribute
public int getRate()
{ return rate; 
}


public void marshal(DataOutputStream dos)
{
    try 
    {
       munition.marshal(dos);
       dos.writeShort( (short)warhead);
       dos.writeShort( (short)fuse);
       dos.writeShort( (short)quantity);
       dos.writeShort( (short)rate);
    } // end try 
    catch(Exception e)
    { 
      System.out.println(e);}
    } // end of marshal method

public void unmarshal(DataInputStream dis)
{
    try 
    {
       munition.unmarshal(dis);
       warhead = (int)dis.readUnsignedShort();
       fuse = (int)dis.readUnsignedShort();
       quantity = (int)dis.readUnsignedShort();
       rate = (int)dis.readUnsignedShort();
    } // end try 
   catch(Exception e)
    { 
      System.out.println(e); 
    }
 } // end of unmarshal method 


 /**
  * The equals method doesn't always work--mostly on on classes that consist only of primitives. Be careful.
  */
 public boolean equals(BurstDescriptor rhs)
 {
     boolean ivarsEqual = true;

    if(rhs.getClass() != this.getClass())
        return false;

     if( ! (munition.equals( rhs.munition) )) ivarsEqual = false;
     if( ! (warhead == rhs.warhead)) ivarsEqual = false;
     if( ! (fuse == rhs.fuse)) ivarsEqual = false;
     if( ! (quantity == rhs.quantity)) ivarsEqual = false;
     if( ! (rate == rhs.rate)) ivarsEqual = false;

    return ivarsEqual;
 }
} // end of class
