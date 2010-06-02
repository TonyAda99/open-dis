// SRM SDK Release 4.1.3 - December 7, 2009

// - SRM spec. 4.1

/*
 *                             NOTICE
 * 
 * This software is provided openly and freely for use in representing and
 * interchanging environmental data & databases.
 * 
 * This software was developed for use by the United States Government with
 * unlimited rights.  The software was developed under contract
 * DASG60-02-D-0006 TO-193 by Science Applications International Corporation.
 * The software is unclassified and is deemed as Distribution A, approved
 * for Public Release.
 * 
 * Use by others is permitted only upon the ACCEPTANCE OF THE TERMS AND
 * CONDITIONS, AS STIPULATED UNDER THE FOLLOWING PROVISIONS:
 * 
 *    1. Recipient may make unlimited copies of this software and give
 *       copies to other persons or entities as long as the copies contain
 *       this NOTICE, and as long as the same copyright notices that
 *       appear on, or in, this software remain.
 * 
 *    2. Trademarks. All trademarks belong to their respective trademark
 *       holders.  Third-Party applications/software/information are
 *       copyrighted by their respective owners.
 * 
 *    3. Recipient agrees to forfeit all intellectual property and
 *       ownership rights for any version created from the modification
 *       or adaptation of this software, including versions created from
 *       the translation and/or reverse engineering of the software design.
 * 
 *    4. Transfer.  Recipient may not sell, rent, lease, or sublicense
 *       this software.  Recipient may, however enable another person
 *       or entity the rights to use this software, provided that this
 *       AGREEMENT and NOTICE is furnished along with the software and
 *       /or software system utilizing this software.
 * 
 *       All revisions, modifications, created by the Recipient, to this
 *       software and/or related technical data shall be forwarded by the
 *       Recipient to the Government at the following address:
 * 
 *         SMDC
 *         Attention SEDRIS (TO193) TPOC
 *         P.O. Box 1500
 *         Huntsville, AL  35807-3801
 * 
 *         or via electronic mail to:  se-mgmt@sedris.org
 * 
 *    5. No Warranty. This software is being delivered to you AS IS
 *       and there is no warranty, EXPRESS or IMPLIED, as to its use
 *       or performance.
 * 
 *       The RECIPIENT ASSUMES ALL RISKS, KNOWN AND UNKNOWN, OF USING
 *       THIS SOFTWARE.  The DEVELOPER EXPRESSLY DISCLAIMS, and the
 *       RECIPIENT WAIVES, ANY and ALL PERFORMANCE OR RESULTS YOU MAY
 *       OBTAIN BY USING THIS SOFTWARE OR DOCUMENTATION.  THERE IS
 *       NO WARRANTY, EXPRESS OR, IMPLIED, AS TO NON-INFRINGEMENT OF
 *       THIRD PARTY RIGHTS, MERCHANTABILITY, OR FITNESS FOR ANY
 *       PARTICULAR PURPOSE.  IN NO EVENT WILL THE DEVELOPER, THE
 *       UNITED STATES GOVERNMENT OR ANYONE ELSE ASSOCIATED WITH THE
 *       DEVELOPMENT OF THIS SOFTWARE BE HELD LIABLE FOR ANY CONSEQUENTIAL,
 *       INCIDENTAL OR SPECIAL DAMAGES, INCLUDING ANY LOST PROFITS
 *       OR LOST SAVINGS WHATSOEVER.
 */

/*
 * COPYRIGHT 2009, SCIENCE APPLICATIONS INTERNATIONAL CORPORATION.
 *                 ALL RIGHTS RESERVED.
 * 
 */

/** @author David Shen
*/

package org.sedris;

/** SRF_SolarMagneticEcliptic class declaration.
@author David Shen
@see BaseSRF_3D
*/
public class SRF_SolarMagneticEcliptic extends BaseSRF_3D
{
    /// SRF_SolarMagneticEcliptic only constructor by ORM code and RT code
    public SRF_SolarMagneticEcliptic( SRM_ORM_Code orm,
                                 SRM_RT_Code rt ) throws SrmException
    {
        _mySrftCode = SRM_SRFT_Code.SRFT_SOLAR_MAGNETIC_ECLIPTIC;
        _myCsCode = SRM_CS_Code.CS_SPHERICAL;
        _orm = orm;
        _rt = rt;

        SrfCheck.forSolarMagneticEcliptic( _orm, _rt );
    }

    /// Create specific 3D coordinate for SRF_SolarMagneticEcliptic with [ Double.NaN, Double.NaN, Double.NaN ]
    public Coord3D createCoordinate3D( )
    {
        return new Coord3D_SolarMagneticEcliptic((SRF_SolarMagneticEcliptic)this,
                                                 Double.NaN, Double.NaN, Double.NaN);
    }

    /// Create specific 3D coordinate for SRF_SolarMagneticEcliptic with input values
    public Coord3D createCoordinate3D( double coord_comp1,
                                       double coord_comp2,
                                       double coord_comp3 )
    {
        return new Coord3D_SolarMagneticEcliptic((SRF_SolarMagneticEcliptic)this,
                                                 coord_comp1, coord_comp2, coord_comp3);
    }

    /* Returns TRUE if the SRF parameters are equal
    */
    public boolean isEqual( BaseSRF srf )
    {
        return ((srf != null) &&
                (srf instanceof SRF_SolarMagneticEcliptic) &&
                 this._orm == srf.getOrm() &&
                 this._rt == srf.getRt() );
    }

    /// Returns a String with the parameter values
    public String toString()
    {
       String retString = new String();

       retString = retString + super.toString();

       return retString;
    }
}
