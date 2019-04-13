/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.4).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package net.stefanodellafiore.ifttt.api;

import io.swagger.annotations.*;
import net.stefanodellafiore.ifttt.model.CrdsvcErrors;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-13T19:12:43.742+02:00")

@Api(value = "status", description = "the status API")
public interface StatusApi {

    @ApiOperation(value = "", nickname = "statusGet", notes = "", authorizations = {
        @Authorization(value = "ifttt_service_key")
    }, tags={ "Service", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 503, message = "Your service is not available at the moment, but IFTTT should try again later.", response = CrdsvcErrors.class) })
    @RequestMapping(value = "/status",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> statusGet(@ApiParam(value = "" , allowableValues="application/json") @RequestHeader(value="Accept", required=false) String accept,@ApiParam(value = "" , allowableValues="utf-8") @RequestHeader(value="Accept-Charset", required=false) String acceptCharset,@ApiParam(value = "" , allowableValues="gzip, deflate") @RequestHeader(value="Accept-Encoding", required=false) List<String> acceptEncoding,@ApiParam(value = "" ) @RequestHeader(value="X-Request-ID", required=false) String xRequestID);

}
