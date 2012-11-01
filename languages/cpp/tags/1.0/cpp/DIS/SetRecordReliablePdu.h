#ifndef SETRECORDRELIABLEPDU_H
#define SETRECORDRELIABLEPDU_H

#include <DIS/RecordSet.h>
#include <vector>
#include <DIS/SimulationManagementWithReliabilityFamilyPdu.h>
#include <DIS/DataStream.h>
#include <DIS/msLibMacro.h>


namespace DIS
{
// Section 5.3.12.14: Initializing or changing internal parameter info. Needs manual intervention     to fix padding in recrod set PDUs. UNFINISHED

// Copyright (c) 2007-2012, MOVES Institute, Naval Postgraduate School. All rights reserved. 
// Licensed under the BSD open source license. See http://www.movesinstitute.org/licenses/bsd.html
//
// @author DMcG, jkg

#pragma warning(disable: 4251 ) // Disables warning for stl vector template DLL export in msvc

class EXPORT_MACRO SetRecordReliablePdu : public SimulationManagementWithReliabilityFamilyPdu
{
protected:
  /** request ID */
  unsigned int _requestID; 

  /** level of reliability service used for this transaction */
  unsigned char _requiredReliabilityService; 

  /** padding. The spec is unclear and contradictory here. */
  unsigned short _pad1; 

  /** padding */
  unsigned char _pad2; 

  /** Number of record sets in list */
  unsigned int _numberOfRecordSets; 

  /** record sets */
  std::vector<RecordSet> _recordSets; 


 public:
    SetRecordReliablePdu();
    virtual ~SetRecordReliablePdu();

    virtual void marshal(DataStream& dataStream) const;
    virtual void unmarshal(DataStream& dataStream);

    unsigned int getRequestID() const; 
    void setRequestID(unsigned int pX); 

    unsigned char getRequiredReliabilityService() const; 
    void setRequiredReliabilityService(unsigned char pX); 

    unsigned short getPad1() const; 
    void setPad1(unsigned short pX); 

    unsigned char getPad2() const; 
    void setPad2(unsigned char pX); 

    unsigned int getNumberOfRecordSets() const; 

    std::vector<RecordSet>& getRecordSets(); 
    const std::vector<RecordSet>& getRecordSets() const; 
    void setRecordSets(const std::vector<RecordSet>&    pX);


virtual int getMarshalledSize() const;

     bool operator  ==(const SetRecordReliablePdu& rhs) const;
};
}

#endif
// Copyright (c) 1995-2009 held by the author(s).  All rights reserved.
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions
//  are met:
// 
//  * Redistributions of source code must retain the above copyright
// notice, this list of conditions and the following disclaimer.
// * Redistributions in binary form must reproduce the above copyright
// notice, this list of conditions and the following disclaimer
// in the documentation and/or other materials provided with the
// distribution.
// * Neither the names of the Naval Postgraduate School (NPS)
//  Modeling Virtual Environments and Simulation (MOVES) Institute
// (http://www.nps.edu and http://www.MovesInstitute.org)
// nor the names of its contributors may be used to endorse or
//  promote products derived from this software without specific
// prior written permission.
// 
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
// AS IS AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
// LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
// FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
// COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
// INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
// BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
// LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
// CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
// LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
// ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
// POSSIBILITY OF SUCH DAMAGE.