package edu.nps.moves.dis;

import java.util.*;
import java.io.*;
import javax.xml.bind.annotation.*;

/**
 * Section 5.2.38. Identifies the type of aggregate including kind of entity, domain (surface, subsurface, air, etc) country, category, etc.
 *
 * Copyright (c) 2008, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class AggregateType extends Object implements Serializable
{
   /** Kind of entity */
   protected short  aggregateKind;

   /** Domain of entity (air, surface, subsurface, space, etc) */
   protected short  domain;

   /** country to which the design of the entity is attributed */
   protected int  country;

   /** category of entity */
   protected short  category;

   /** subcategory of entity */
   protected short  subcategory;

   /** specific info based on subcategory field */
   protected short  specific;

   protected short  extra;


/** Constructor */
 public AggregateType()
 {
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = marshalSize + 1;  // aggregateKind
   marshalSize = marshalSize + 1;  // domain
   marshalSize = marshalSize + 2;  // country
   marshalSize = marshalSize + 1;  // category
   marshalSize = marshalSize + 1;  // subcategory
   marshalSize = marshalSize + 1;  // specific
   marshalSize = marshalSize + 1;  // extra

   return marshalSize;
}


public void setAggregateKind(short pAggregateKind)
{ aggregateKind = pAggregateKind;
}

@XmlAttribute
public short getAggregateKind()
{ return aggregateKind; 
}

public void setDomain(short pDomain)
{ domain = pDomain;
}

@XmlAttribute
public short getDomain()
{ return domain; 
}

public void setCountry(int pCountry)
{ country = pCountry;
}

@XmlAttribute
public int getCountry()
{ return country; 
}

public void setCategory(short pCategory)
{ category = pCategory;
}

@XmlAttribute
public short getCategory()
{ return category; 
}

public void setSubcategory(short pSubcategory)
{ subcategory = pSubcategory;
}

@XmlAttribute
public short getSubcategory()
{ return subcategory; 
}

public void setSpecific(short pSpecific)
{ specific = pSpecific;
}

@XmlAttribute
public short getSpecific()
{ return specific; 
}

public void setExtra(short pExtra)
{ extra = pExtra;
}

@XmlAttribute
public short getExtra()
{ return extra; 
}


public void marshal(DataOutputStream dos)
{
    try 
    {
       dos.writeByte( (byte)aggregateKind);
       dos.writeByte( (byte)domain);
       dos.writeShort( (short)country);
       dos.writeByte( (byte)category);
       dos.writeByte( (byte)subcategory);
       dos.writeByte( (byte)specific);
       dos.writeByte( (byte)extra);
    } // end try 
    catch(Exception e)
    { 
      System.out.println(e);}
    } // end of marshal method

public void unmarshal(DataInputStream dis)
{
    try 
    {
       aggregateKind = (short)dis.readUnsignedByte();
       domain = (short)dis.readUnsignedByte();
       country = (int)dis.readUnsignedShort();
       category = (short)dis.readUnsignedByte();
       subcategory = (short)dis.readUnsignedByte();
       specific = (short)dis.readUnsignedByte();
       extra = (short)dis.readUnsignedByte();
    } // end try 
   catch(Exception e)
    { 
      System.out.println(e); 
    }
 } // end of unmarshal method 


 /**
  * The equals method doesn't always work--mostly on on classes that consist only of primitives. Be careful.
  */
 public boolean equals(AggregateType rhs)
 {
     boolean ivarsEqual = true;

    if(rhs.getClass() != this.getClass())
        return false;

     if( ! (aggregateKind == rhs.aggregateKind)) ivarsEqual = false;
     if( ! (domain == rhs.domain)) ivarsEqual = false;
     if( ! (country == rhs.country)) ivarsEqual = false;
     if( ! (category == rhs.category)) ivarsEqual = false;
     if( ! (subcategory == rhs.subcategory)) ivarsEqual = false;
     if( ! (specific == rhs.specific)) ivarsEqual = false;
     if( ! (extra == rhs.extra)) ivarsEqual = false;

    return ivarsEqual;
 }
} // end of class
