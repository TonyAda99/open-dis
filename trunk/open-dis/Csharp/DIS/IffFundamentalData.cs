using System;
using System.Collections.Generic;
using System.Text;
using System.Diagnostics;
using System.Xml.Serialization;
using DISnet.DataStreamUtilities;

namespace DIS1998net
{

/**
 * 5.2.42. Basic operational data ofr IFF ATC NAVAIDS
 *
 * Copyright (c) 2008, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 * Modified for use with C#:
 * Peter Smith (Naval Air Warfare Center - Training Systems Division)
 */
[Serializable]
[XmlRoot]
public class IffFundamentalData : Object
{
   /** system status */
   protected byte  _systemStatus;

   /** Alternate parameter 4 */
   protected byte  _alternateParameter4;

   /** eight boolean fields */
   protected byte  _informationLayers;

   /** enumeration */
   protected byte  _modifier;

   /** parameter, enumeration */
   protected ushort  _parameter1;

   /** parameter, enumeration */
   protected ushort  _parameter2;

   /** parameter, enumeration */
   protected ushort  _parameter3;

   /** parameter, enumeration */
   protected ushort  _parameter4;

   /** parameter, enumeration */
   protected ushort  _parameter5;

   /** parameter, enumeration */
   protected ushort  _parameter6;


/** Constructor */
 public IffFundamentalData()
 {
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = marshalSize + 1;  // _systemStatus
   marshalSize = marshalSize + 1;  // _alternateParameter4
   marshalSize = marshalSize + 1;  // _informationLayers
   marshalSize = marshalSize + 1;  // _modifier
   marshalSize = marshalSize + 2;  // _parameter1
   marshalSize = marshalSize + 2;  // _parameter2
   marshalSize = marshalSize + 2;  // _parameter3
   marshalSize = marshalSize + 2;  // _parameter4
   marshalSize = marshalSize + 2;  // _parameter5
   marshalSize = marshalSize + 2;  // _parameter6

   return marshalSize;
}


public void setSystemStatus(byte pSystemStatus)
{ _systemStatus = pSystemStatus;
}

[XmlElement(Type= typeof(byte), ElementName="systemStatus")]
public byte SystemStatus
{
     get
{
          return _systemStatus;
}
     set
{
          _systemStatus = value;
}
}

public void setAlternateParameter4(byte pAlternateParameter4)
{ _alternateParameter4 = pAlternateParameter4;
}

[XmlElement(Type= typeof(byte), ElementName="alternateParameter4")]
public byte AlternateParameter4
{
     get
{
          return _alternateParameter4;
}
     set
{
          _alternateParameter4 = value;
}
}

public void setInformationLayers(byte pInformationLayers)
{ _informationLayers = pInformationLayers;
}

[XmlElement(Type= typeof(byte), ElementName="informationLayers")]
public byte InformationLayers
{
     get
{
          return _informationLayers;
}
     set
{
          _informationLayers = value;
}
}

public void setModifier(byte pModifier)
{ _modifier = pModifier;
}

[XmlElement(Type= typeof(byte), ElementName="modifier")]
public byte Modifier
{
     get
{
          return _modifier;
}
     set
{
          _modifier = value;
}
}

public void setParameter1(ushort pParameter1)
{ _parameter1 = pParameter1;
}

[XmlElement(Type= typeof(ushort), ElementName="parameter1")]
public ushort Parameter1
{
     get
{
          return _parameter1;
}
     set
{
          _parameter1 = value;
}
}

public void setParameter2(ushort pParameter2)
{ _parameter2 = pParameter2;
}

[XmlElement(Type= typeof(ushort), ElementName="parameter2")]
public ushort Parameter2
{
     get
{
          return _parameter2;
}
     set
{
          _parameter2 = value;
}
}

public void setParameter3(ushort pParameter3)
{ _parameter3 = pParameter3;
}

[XmlElement(Type= typeof(ushort), ElementName="parameter3")]
public ushort Parameter3
{
     get
{
          return _parameter3;
}
     set
{
          _parameter3 = value;
}
}

public void setParameter4(ushort pParameter4)
{ _parameter4 = pParameter4;
}

[XmlElement(Type= typeof(ushort), ElementName="parameter4")]
public ushort Parameter4
{
     get
{
          return _parameter4;
}
     set
{
          _parameter4 = value;
}
}

public void setParameter5(ushort pParameter5)
{ _parameter5 = pParameter5;
}

[XmlElement(Type= typeof(ushort), ElementName="parameter5")]
public ushort Parameter5
{
     get
{
          return _parameter5;
}
     set
{
          _parameter5 = value;
}
}

public void setParameter6(ushort pParameter6)
{ _parameter6 = pParameter6;
}

[XmlElement(Type= typeof(ushort), ElementName="parameter6")]
public ushort Parameter6
{
     get
{
          return _parameter6;
}
     set
{
          _parameter6 = value;
}
}


public void marshal(DataOutputStream dos)
{
    try 
    {
       dos.writeByte( (byte)_systemStatus);
       dos.writeByte( (byte)_alternateParameter4);
       dos.writeByte( (byte)_informationLayers);
       dos.writeByte( (byte)_modifier);
       dos.writeUshort( (ushort)_parameter1);
       dos.writeUshort( (ushort)_parameter2);
       dos.writeUshort( (ushort)_parameter3);
       dos.writeUshort( (ushort)_parameter4);
       dos.writeUshort( (ushort)_parameter5);
       dos.writeUshort( (ushort)_parameter6);
    } // end try 
    catch(Exception e)
    { 
      Trace.WriteLine(e);
      Trace.Flush();
    }
} // end of marshal method

public void unmarshal(DataInputStream dis)
{
    try 
    {
       _systemStatus = dis.readByte();
       _alternateParameter4 = dis.readByte();
       _informationLayers = dis.readByte();
       _modifier = dis.readByte();
       _parameter1 = dis.readUshort();
       _parameter2 = dis.readUshort();
       _parameter3 = dis.readUshort();
       _parameter4 = dis.readUshort();
       _parameter5 = dis.readUshort();
       _parameter6 = dis.readUshort();
    } // end try 
   catch(Exception e)
    { 
      Trace.WriteLine(e); 
      Trace.Flush();
    }
 } // end of unmarshal method 


public void reflection(StringBuilder sb)
{
    sb.Append("----- IffFundamentalData-----"  + System.Environment.NewLine);
    try 
    {
           sb.Append("byte\t _systemStatus\t " + _systemStatus.ToString() + System.Environment.NewLine);
           sb.Append("byte\t _alternateParameter4\t " + _alternateParameter4.ToString() + System.Environment.NewLine);
           sb.Append("byte\t _informationLayers\t " + _informationLayers.ToString() + System.Environment.NewLine);
           sb.Append("byte\t _modifier\t " + _modifier.ToString() + System.Environment.NewLine);
           sb.Append("ushort\t _parameter1\t " + _parameter1.ToString() + System.Environment.NewLine);
           sb.Append("ushort\t _parameter2\t " + _parameter2.ToString() + System.Environment.NewLine);
           sb.Append("ushort\t _parameter3\t " + _parameter3.ToString() + System.Environment.NewLine);
           sb.Append("ushort\t _parameter4\t " + _parameter4.ToString() + System.Environment.NewLine);
           sb.Append("ushort\t _parameter5\t " + _parameter5.ToString() + System.Environment.NewLine);
           sb.Append("ushort\t _parameter6\t " + _parameter6.ToString() + System.Environment.NewLine);
    } // end try 
    catch(Exception e)
    { 
      Trace.WriteLine(e);
      Trace.Flush();
}
    } // end of marshal method

 /**
  * The equals method doesn't always work--mostly it works only on on classes that consist only of primitives. Be careful.
  */
 public bool equals(IffFundamentalData rhs)
 {
     bool ivarsEqual = true;

    if(rhs.GetType() != this.GetType())
        return false;

     if( ! (_systemStatus == rhs._systemStatus)) ivarsEqual = false;
     if( ! (_alternateParameter4 == rhs._alternateParameter4)) ivarsEqual = false;
     if( ! (_informationLayers == rhs._informationLayers)) ivarsEqual = false;
     if( ! (_modifier == rhs._modifier)) ivarsEqual = false;
     if( ! (_parameter1 == rhs._parameter1)) ivarsEqual = false;
     if( ! (_parameter2 == rhs._parameter2)) ivarsEqual = false;
     if( ! (_parameter3 == rhs._parameter3)) ivarsEqual = false;
     if( ! (_parameter4 == rhs._parameter4)) ivarsEqual = false;
     if( ! (_parameter5 == rhs._parameter5)) ivarsEqual = false;
     if( ! (_parameter6 == rhs._parameter6)) ivarsEqual = false;

    return ivarsEqual;
 }
} // end of class
} // end of namespace