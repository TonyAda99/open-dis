using System;
using System.Collections.Generic;
using System.Text;
using System.Diagnostics;
using System.Xml.Serialization;
using DISnet.DataStreamUtilities;

namespace DIS1998net
{

/**
 * Section 5.2.22. Contains electromagnetic emmision regineratin parameters that are        variable throughout a scenario dependent on the actions of the participants in the simulation. Also provides basic parametric data that may be used to support low-fidelity simulations.
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
public class FundamentalParameterData : Object
{
   /** center frequency of the emission in hertz. */
   protected float  _frequency;

   /** Bandwidth of the frequencies corresponding to the fequency field. */
   protected float  _frequencyRange;

   /** Effective radiated power for the emission in DdBm. For a      radar noise jammer, indicates the peak of the transmitted power. */
   protected float  _effectiveRadiatedPower;

   /** Average repetition frequency of the emission in hertz. */
   protected float  _pulseRepetitionFrequency;

   /** Average pulse width  of the emission in microseconds. */
   protected float  _pulseWidth;

   /** Specifies the beam azimuth an elevation centers and corresponding half-angles     to describe the scan volume */
   protected float  _beamAzimuthCenter;

   /** Specifies the beam azimuth sweep to determine scan volume */
   protected float  _beamAzimuthSweep;

   /** Specifies the beam elevation center to determine scan volume */
   protected float  _beamElevationCenter;

   /** Specifies the beam elevation sweep to determine scan volume */
   protected float  _beamElevationSweep;

   /** allows receiver to synchronize its regenerated scan pattern to     that of the emmitter. Specifies the percentage of time a scan is through its pattern from its origion. */
   protected float  _beamSweepSync;


/** Constructor */
 public FundamentalParameterData()
 {
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = marshalSize + 4;  // _frequency
   marshalSize = marshalSize + 4;  // _frequencyRange
   marshalSize = marshalSize + 4;  // _effectiveRadiatedPower
   marshalSize = marshalSize + 4;  // _pulseRepetitionFrequency
   marshalSize = marshalSize + 4;  // _pulseWidth
   marshalSize = marshalSize + 4;  // _beamAzimuthCenter
   marshalSize = marshalSize + 4;  // _beamAzimuthSweep
   marshalSize = marshalSize + 4;  // _beamElevationCenter
   marshalSize = marshalSize + 4;  // _beamElevationSweep
   marshalSize = marshalSize + 4;  // _beamSweepSync

   return marshalSize;
}


public void setFrequency(float pFrequency)
{ _frequency = pFrequency;
}

[XmlElement(Type= typeof(float), ElementName="frequency")]
public float Frequency
{
     get
{
          return _frequency;
}
     set
{
          _frequency = value;
}
}

public void setFrequencyRange(float pFrequencyRange)
{ _frequencyRange = pFrequencyRange;
}

[XmlElement(Type= typeof(float), ElementName="frequencyRange")]
public float FrequencyRange
{
     get
{
          return _frequencyRange;
}
     set
{
          _frequencyRange = value;
}
}

public void setEffectiveRadiatedPower(float pEffectiveRadiatedPower)
{ _effectiveRadiatedPower = pEffectiveRadiatedPower;
}

[XmlElement(Type= typeof(float), ElementName="effectiveRadiatedPower")]
public float EffectiveRadiatedPower
{
     get
{
          return _effectiveRadiatedPower;
}
     set
{
          _effectiveRadiatedPower = value;
}
}

public void setPulseRepetitionFrequency(float pPulseRepetitionFrequency)
{ _pulseRepetitionFrequency = pPulseRepetitionFrequency;
}

[XmlElement(Type= typeof(float), ElementName="pulseRepetitionFrequency")]
public float PulseRepetitionFrequency
{
     get
{
          return _pulseRepetitionFrequency;
}
     set
{
          _pulseRepetitionFrequency = value;
}
}

public void setPulseWidth(float pPulseWidth)
{ _pulseWidth = pPulseWidth;
}

[XmlElement(Type= typeof(float), ElementName="pulseWidth")]
public float PulseWidth
{
     get
{
          return _pulseWidth;
}
     set
{
          _pulseWidth = value;
}
}

public void setBeamAzimuthCenter(float pBeamAzimuthCenter)
{ _beamAzimuthCenter = pBeamAzimuthCenter;
}

[XmlElement(Type= typeof(float), ElementName="beamAzimuthCenter")]
public float BeamAzimuthCenter
{
     get
{
          return _beamAzimuthCenter;
}
     set
{
          _beamAzimuthCenter = value;
}
}

public void setBeamAzimuthSweep(float pBeamAzimuthSweep)
{ _beamAzimuthSweep = pBeamAzimuthSweep;
}

[XmlElement(Type= typeof(float), ElementName="beamAzimuthSweep")]
public float BeamAzimuthSweep
{
     get
{
          return _beamAzimuthSweep;
}
     set
{
          _beamAzimuthSweep = value;
}
}

public void setBeamElevationCenter(float pBeamElevationCenter)
{ _beamElevationCenter = pBeamElevationCenter;
}

[XmlElement(Type= typeof(float), ElementName="beamElevationCenter")]
public float BeamElevationCenter
{
     get
{
          return _beamElevationCenter;
}
     set
{
          _beamElevationCenter = value;
}
}

public void setBeamElevationSweep(float pBeamElevationSweep)
{ _beamElevationSweep = pBeamElevationSweep;
}

[XmlElement(Type= typeof(float), ElementName="beamElevationSweep")]
public float BeamElevationSweep
{
     get
{
          return _beamElevationSweep;
}
     set
{
          _beamElevationSweep = value;
}
}

public void setBeamSweepSync(float pBeamSweepSync)
{ _beamSweepSync = pBeamSweepSync;
}

[XmlElement(Type= typeof(float), ElementName="beamSweepSync")]
public float BeamSweepSync
{
     get
{
          return _beamSweepSync;
}
     set
{
          _beamSweepSync = value;
}
}


public void marshal(DataOutputStream dos)
{
    try 
    {
       dos.writeFloat( (float)_frequency);
       dos.writeFloat( (float)_frequencyRange);
       dos.writeFloat( (float)_effectiveRadiatedPower);
       dos.writeFloat( (float)_pulseRepetitionFrequency);
       dos.writeFloat( (float)_pulseWidth);
       dos.writeFloat( (float)_beamAzimuthCenter);
       dos.writeFloat( (float)_beamAzimuthSweep);
       dos.writeFloat( (float)_beamElevationCenter);
       dos.writeFloat( (float)_beamElevationSweep);
       dos.writeFloat( (float)_beamSweepSync);
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
       _frequency = dis.readFloat();
       _frequencyRange = dis.readFloat();
       _effectiveRadiatedPower = dis.readFloat();
       _pulseRepetitionFrequency = dis.readFloat();
       _pulseWidth = dis.readFloat();
       _beamAzimuthCenter = dis.readFloat();
       _beamAzimuthSweep = dis.readFloat();
       _beamElevationCenter = dis.readFloat();
       _beamElevationSweep = dis.readFloat();
       _beamSweepSync = dis.readFloat();
    } // end try 
   catch(Exception e)
    { 
      Trace.WriteLine(e); 
      Trace.Flush();
    }
 } // end of unmarshal method 


public void reflection(StringBuilder sb)
{
    sb.Append("----- FundamentalParameterData-----"  + System.Environment.NewLine);
    try 
    {
           sb.Append("float\t _frequency\t " + _frequency.ToString() + System.Environment.NewLine);
           sb.Append("float\t _frequencyRange\t " + _frequencyRange.ToString() + System.Environment.NewLine);
           sb.Append("float\t _effectiveRadiatedPower\t " + _effectiveRadiatedPower.ToString() + System.Environment.NewLine);
           sb.Append("float\t _pulseRepetitionFrequency\t " + _pulseRepetitionFrequency.ToString() + System.Environment.NewLine);
           sb.Append("float\t _pulseWidth\t " + _pulseWidth.ToString() + System.Environment.NewLine);
           sb.Append("float\t _beamAzimuthCenter\t " + _beamAzimuthCenter.ToString() + System.Environment.NewLine);
           sb.Append("float\t _beamAzimuthSweep\t " + _beamAzimuthSweep.ToString() + System.Environment.NewLine);
           sb.Append("float\t _beamElevationCenter\t " + _beamElevationCenter.ToString() + System.Environment.NewLine);
           sb.Append("float\t _beamElevationSweep\t " + _beamElevationSweep.ToString() + System.Environment.NewLine);
           sb.Append("float\t _beamSweepSync\t " + _beamSweepSync.ToString() + System.Environment.NewLine);
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
 public bool equals(FundamentalParameterData rhs)
 {
     bool ivarsEqual = true;

    if(rhs.GetType() != this.GetType())
        return false;

     if( ! (_frequency == rhs._frequency)) ivarsEqual = false;
     if( ! (_frequencyRange == rhs._frequencyRange)) ivarsEqual = false;
     if( ! (_effectiveRadiatedPower == rhs._effectiveRadiatedPower)) ivarsEqual = false;
     if( ! (_pulseRepetitionFrequency == rhs._pulseRepetitionFrequency)) ivarsEqual = false;
     if( ! (_pulseWidth == rhs._pulseWidth)) ivarsEqual = false;
     if( ! (_beamAzimuthCenter == rhs._beamAzimuthCenter)) ivarsEqual = false;
     if( ! (_beamAzimuthSweep == rhs._beamAzimuthSweep)) ivarsEqual = false;
     if( ! (_beamElevationCenter == rhs._beamElevationCenter)) ivarsEqual = false;
     if( ! (_beamElevationSweep == rhs._beamElevationSweep)) ivarsEqual = false;
     if( ! (_beamSweepSync == rhs._beamSweepSync)) ivarsEqual = false;

    return ivarsEqual;
 }
} // end of class
} // end of namespace