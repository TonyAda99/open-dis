package edu.nps.moves.dis;

import java.util.*;
import java.io.*;
import javax.xml.bind.annotation.*;

/**
 * Section 5.2.25. Identifies the type of radio
 *
 * Copyright (c) 2008, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class RadioEntityType extends Object implements Serializable
{
   /** Kind of entity */
   protected short  entityKind;

   /** Domain of entity (air, surface, subsurface, space, etc) */
   protected short  domain;

   /** country to which the design of the entity is attributed */
   protected int  country;

   /** category of entity */
   protected short  category;

   /** subcategory of entity */
   protected short  subcategory;

   /** specific info based on subcategory field */
   protected short  nomenclatureVersion;

   protected int  nomenclature;


/** Constructor */
 public RadioEntityType()
 {
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = marshalSize + 1;  // entityKind
   marshalSize = marshalSize + 1;  // domain
   marshalSize = marshalSize + 2;  // country
   marshalSize = marshalSize + 1;  // category
   marshalSize = marshalSize + 1;  // subcategory
   marshalSize = marshalSize + 1;  // nomenclatureVersion
   marshalSize = marshalSize + 2;  // nomenclature

   return marshalSize;
}


public void setEntityKind(short pEntityKind)
{ entityKind = pEntityKind;
}

@XmlAttribute
public short getEntityKind()
{ return entityKind; 
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

public void setNomenclatureVersion(short pNomenclatureVersion)
{ nomenclatureVersion = pNomenclatureVersion;
}

@XmlAttribute
public short getNomenclatureVersion()
{ return nomenclatureVersion; 
}

public void setNomenclature(int pNomenclature)
{ nomenclature = pNomenclature;
}

@XmlAttribute
public int getNomenclature()
{ return nomenclature; 
}


public void marshal(DataOutputStream dos)
{
    try 
    {
       dos.writeByte( (byte)entityKind);
       dos.writeByte( (byte)domain);
       dos.writeShort( (short)country);
       dos.writeByte( (byte)category);
       dos.writeByte( (byte)subcategory);
       dos.writeByte( (byte)nomenclatureVersion);
       dos.writeShort( (short)nomenclature);
    } // end try 
    catch(Exception e)
    { 
      System.out.println(e);}
    } // end of marshal method

public void unmarshal(DataInputStream dis)
{
    try 
    {
       entityKind = (short)dis.readUnsignedByte();
       domain = (short)dis.readUnsignedByte();
       country = (int)dis.readUnsignedShort();
       category = (short)dis.readUnsignedByte();
       subcategory = (short)dis.readUnsignedByte();
       nomenclatureVersion = (short)dis.readUnsignedByte();
       nomenclature = (int)dis.readUnsignedShort();
    } // end try 
   catch(Exception e)
    { 
      System.out.println(e); 
    }
 } // end of unmarshal method 


 /**
  * The equals method doesn't always work--mostly on on classes that consist only of primitives. Be careful.
  */
 public boolean equals(RadioEntityType rhs)
 {
     boolean ivarsEqual = true;

    if(rhs.getClass() != this.getClass())
        return false;

     if( ! (entityKind == rhs.entityKind)) ivarsEqual = false;
     if( ! (domain == rhs.domain)) ivarsEqual = false;
     if( ! (country == rhs.country)) ivarsEqual = false;
     if( ! (category == rhs.category)) ivarsEqual = false;
     if( ! (subcategory == rhs.subcategory)) ivarsEqual = false;
     if( ! (nomenclatureVersion == rhs.nomenclatureVersion)) ivarsEqual = false;
     if( ! (nomenclature == rhs.nomenclature)) ivarsEqual = false;

    return ivarsEqual;
 }
} // end of class
