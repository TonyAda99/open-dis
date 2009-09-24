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

/** SRF_LocalTangentSpaceCylindrical class declaration.
@author David Shen
@see BaseSRF_WithTangentPlaneSurface
*/
public class SRF_LocalTangentSpaceCylindrical extends BaseSRF_WithTangentPlaneSurface
{

    /// SRF Parameter data using SRF_LT_Params
    private SRF_LT_Params _params = new SRF_LT_Params();

    /// Constructor by SRF parameter object
    public SRF_LocalTangentSpaceCylindrical( SRM_ORM_Code orm,
                                 SRM_RT_Code rt,
                                 SRF_LT_Params params ) throws SrmException
    {
       _mySrftCode = SRM_SRFT_Code.SRFT_LOCAL_TANGENT_SPACE_CYLINDRICAL;
       _orm = orm;
       _rt = rt;
       _params.geodetic_longitude = params.geodetic_longitude;
       _params.geodetic_latitude = params.geodetic_latitude;
       _params.azimuth = params.azimuth;
       _params.height_offset = params.height_offset;
 
       SrfCheck.forLocalTangentSpaceCylindrical( _orm, _rt, _params );
    }

    /// Constructor by individual SRF parameters
    public SRF_LocalTangentSpaceCylindrical( 
                                    SRM_ORM_Code orm,
                                    SRM_RT_Code rt,
                                    double geodetic_longitude,
                                    double geodetic_latitude,
                                    double azimuth,
                                    double height_offset
                                ) throws SrmException
    {
       _mySrftCode = SRM_SRFT_Code.SRFT_LOCAL_TANGENT_SPACE_CYLINDRICAL;
       _orm = orm;
       _rt = rt;
       _params.geodetic_longitude = geodetic_longitude;
       _params.geodetic_latitude = geodetic_latitude;
       _params.azimuth = azimuth;
       _params.height_offset = height_offset;
 
       SrfCheck.forLocalTangentSpaceCylindrical( _orm, _rt, _params );
    }

    /// Create specific 3D coordinate for SRF_LocalTangentSpaceCylindrical with [ Double.NaN, Double.NaN, Double.NaN ]
    public Coord3D createCoordinate3D( )
    {
        return new Coord3D_LocalTangentSpaceCylindrical( (SRF_LocalTangentSpaceCylindrical)this,
                                             Double.NaN, Double.NaN, Double.NaN );
    }

    /// Create specific 3D coordinate for SRF_LocalTangentSpaceCylindrical with input values
    public Coord3D createCoordinate3D( double coord_comp1,
                                       double coord_comp2,
                                       double coord_comp3 )
    {
        return new Coord3D_LocalTangentSpaceCylindrical( (SRF_LocalTangentSpaceCylindrical)this,
                                             coord_comp1, coord_comp2, coord_comp3);
    }

    /// Create specific Surface coordinate for SRF_LocalTangentSpaceCylindrical with [ Double.NaN, Double.NaN ]
    public CoordSurf createSurfaceCoordinate( )
    {
        return new CoordSurf_LocalTangentSpaceCylindrical( (SRF_LocalTangentSpaceCylindrical)this,
                                             Double.NaN, Double.NaN );
    }

    /// Create specific Surface coordinate for SRF_LocalTangentSpaceCylindrical with input values
    public CoordSurf createSurfaceCoordinate( double coord_comp1,
                                              double coord_comp2 )
    {
        return new CoordSurf_LocalTangentSpaceCylindrical( (SRF_LocalTangentSpaceCylindrical)this,
                                             coord_comp1, coord_comp2);
    }

    /// Returns the SRF parameter object
    public SRF_LT_Params getSRFParameters()
    {
       SRF_LT_Params retParams = new SRF_LT_Params();

       retParams.geodetic_longitude = _params.geodetic_longitude;
       retParams.geodetic_latitude = _params.geodetic_latitude;
       retParams.azimuth = _params.azimuth;
       retParams.height_offset = _params.height_offset;

       return retParams;
    }

    /// Returns the geodetic_longitude SRF parameter value
    public double get_geodetic_longitude()
    {
        return _params.geodetic_longitude;
    }

    /// Returns the geodetic_latitude SRF parameter value
    public double get_geodetic_latitude()
    {
        return _params.geodetic_latitude;
    }

    /// Returns the azimuth SRF parameter value
    public double get_azimuth()
    {
        return _params.azimuth;
    }

    /// Returns the height_offset SRF parameter value
    public double get_height_offset()
    {
        return _params.height_offset;
    }

    /// Returns a surface coordinate associated with a 3D coordinate for SRF_LocalTangentSpaceCylindrical
    public CoordSurf getAssociatedSurfaceCoordinate( Coord3D coord ) throws SrmException
    {
       if (coord.getSRF() != this)      
            throw new SrmException( SrmException._INVALID_SOURCE_COORDINATE,
                                    new String("getAssociatedSurfaceCoordinate: Coordinate associated with different SRF"));
             
        return new CoordSurf_LocalTangentSpaceCylindrical((SRF_LocalTangentSpaceCylindrical)this,
                                               coord.getValues()[0],
                                               coord.getValues()[1]);
    }

    /// Returns a 3D coordinate representing the same location as
    /// specified by a surface coordinate for SRF_LocalTangentSpaceCylindrical
    public Coord3D getPromotedSurfaceCoordinate( CoordSurf surf_coord ) throws SrmException
    {
       if (surf_coord.getSRF() != this)      
            throw new SrmException( SrmException._INVALID_SOURCE_COORDINATE,
                                    new String("getPromotedSurfaceCoordinate: Coordinate associated with different SRF"));
             
        return new Coord3D_LocalTangentSpaceCylindrical((SRF_LocalTangentSpaceCylindrical)this,
                                               surf_coord.getValues()[0],
                                               surf_coord.getValues()[1],
                                               0.0);
    }

    /* Returns TRUE if the SRF parameters are equal
    */
    public boolean isEqual( BaseSRF srf )
    {
        return ( ( srf != null ) &&
                  ( srf instanceof SRF_LocalTangentSpaceCylindrical ) &&
                 this._orm == srf.get_orm() &&
                 this._rt == srf.get_rt() &&
                 this._params.isEqual( ((SRF_LocalTangentSpaceCylindrical)srf).getSRFParameters() ) );
    }

    /// Returns a String with the parameter values
    public String toString()
    {
       String retString = new String();

       retString = retString + "orm: " + _orm + "\n";
       retString = retString + "rt: " + _rt + "\n";
       retString = retString + "geodetic_longitude: " + _params.geodetic_longitude+ "\n";
       retString = retString + "geodetic_latitude: " + _params.geodetic_latitude+ "\n";
       retString = retString + "azimuth: " + _params.azimuth+ "\n";
       retString = retString + "height_offset: " + _params.height_offset;

       return retString;
    }

}


