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

/** SRF_LTSE_Params class declaration.
This class holds the specific parameters for SRF_LocalTangentSpaceEuclidean
@author David Shen
*/
public class SRF_LTSE_Params
{
    double geodetic_longitude;
    double geodetic_latitude;
    double azimuth;
    double x_false_origin;
    double y_false_origin;
    double height_offset;

    /** Returns TRUE is this object's member data are "equal" to the ones in
        input object.
    */
    public boolean isEqual( SRF_LTSE_Params params )
    {
        return (
                 this.geodetic_longitude== params.geodetic_longitude &&
                 this.geodetic_latitude== params.geodetic_latitude &&
                 this.azimuth== params.azimuth &&
                 this.x_false_origin== params.x_false_origin &&
                 this.y_false_origin== params.y_false_origin &&
                 this.height_offset== params.height_offset
                );
    }

    /** Returns a String with the parameter values
     */
    public String toString()
    {
       String retString = new String();

       retString = retString + "geodetic_longitude: " + geodetic_longitude+ "\n";
       retString = retString + "geodetic_latitude: " + geodetic_latitude+ "\n";
       retString = retString + "azimuth: " + azimuth+ "\n";
       retString = retString + "x_false_origin: " + x_false_origin+ "\n";
       retString = retString + "y_false_origin: " + y_false_origin+ "\n";
       retString = retString + "height_offset: " + height_offset;

       return retString;
    }
}
