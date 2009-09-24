// SRM SDK Release 4.1.1 - June 23, 2007

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
 *         Hunstville, AL  35807-3801
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
 * COPYRIGHT 2007, SCIENCE APPLICATIONS INTERNATIONAL CORPORATION.
 *                 ALL RIGHTS RESERVED.
 * 
 */

/** @author David Shen
*/

package org.sedris;

/** SRF_LocalSpaceRectangular3D class declaration.
@author David Shen
@see BaseSRF_3D
*/
public class SRF_LocalSpaceRectangular3D extends BaseSRF_3D
{

    /// SRF Parameter data using SRF_LSR_3D_Params
    private SRF_LSR_3D_Params _params = new SRF_LSR_3D_Params();

    /// Constructor by SRF parameter object
    public SRF_LocalSpaceRectangular3D( SRM_ORM_Code orm,
                                 SRM_RT_Code rt,
                                 SRF_LSR_3D_Params params ) throws SrmException
    {
       _mySrftCode = SRM_SRFT_Code.SRFT_LOCAL_SPACE_RECTANGULAR_3D;
       _orm = orm;
       _rt = rt;
       _params.forward_direction = params.forward_direction;
       _params.up_direction = params.up_direction;
 
       SrfCheck.forLocalSpaceRectangular3D( _orm, _rt, _params );
    }

    /// Constructor by individual SRF parameters
    public SRF_LocalSpaceRectangular3D( 
                                    SRM_ORM_Code orm,
                                    SRM_RT_Code rt,
                                    SRM_Axis_Direction forward_direction,
                                    SRM_Axis_Direction up_direction
                                ) throws SrmException
    {
       _mySrftCode = SRM_SRFT_Code.SRFT_LOCAL_SPACE_RECTANGULAR_3D;
       _orm = orm;
       _rt = rt;
       _params.forward_direction = forward_direction;
       _params.up_direction = up_direction;
 
       SrfCheck.forLocalSpaceRectangular3D( _orm, _rt, _params );
    }

    /// Create specific 3D coordinate for SRF_LocalSpaceRectangular3D with [ Double.NaN, Double.NaN, Double.NaN ]
    public Coord3D createCoordinate3D( )
    {
        return new Coord3D_LocalSpaceRectangular3D( (SRF_LocalSpaceRectangular3D)this,
                                             Double.NaN, Double.NaN, Double.NaN );
    }

    /// Create specific 3D coordinate for SRF_LocalSpaceRectangular3D with input values
    public Coord3D createCoordinate3D( double coord_comp1,
                                       double coord_comp2,
                                       double coord_comp3 )
    {
        return new Coord3D_LocalSpaceRectangular3D( (SRF_LocalSpaceRectangular3D)this,
                                             coord_comp1, coord_comp2, coord_comp3);
    }

    /// Returns the SRF parameter object
    public SRF_LSR_3D_Params getSRFParameters()
    {
       SRF_LSR_3D_Params retParams = new SRF_LSR_3D_Params();

       retParams.forward_direction = _params.forward_direction;
       retParams.up_direction = _params.up_direction;

       return retParams;
    }

    /// Returns the forward_direction SRF parameter value
    public SRM_Axis_Direction get_forward_direction()
    {
        return _params.forward_direction;
    }

    /// Returns the up_direction SRF parameter value
    public SRM_Axis_Direction get_up_direction()
    {
        return _params.up_direction;
    }

    /* Returns TRUE if the SRF parameters are equal
    */
    public boolean isEqual( BaseSRF srf )
    {
        return ( ( srf != null ) &&
                  ( srf instanceof SRF_LocalSpaceRectangular3D ) &&
                 this._orm == srf.get_orm() &&
                 this._rt == srf.get_rt() &&
                 this._params.isEqual( ((SRF_LocalSpaceRectangular3D)srf).getSRFParameters() ) );
    }

    /// Returns a String with the parameter values
    public String toString()
    {
       String retString = new String();

       retString = retString + "orm: " + _orm + "\n";
       retString = retString + "rt: " + _rt + "\n";
       retString = retString + "forward_direction: " + _params.forward_direction+ "\n";
       retString = retString + "up_direction: " + _params.up_direction;

       return retString;
    }

}


