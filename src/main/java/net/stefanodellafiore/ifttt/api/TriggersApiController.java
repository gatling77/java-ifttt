package net.stefanodellafiore.ifttt.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import net.stefanodellafiore.ifttt.model.CrdsvcInlineResponse200;
import net.stefanodellafiore.ifttt.model.CrdsvcInlineResponse2001;
import net.stefanodellafiore.ifttt.service.CardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-13T19:12:43.742+02:00")

@Controller
public class TriggersApiController implements TriggersApi {

    private static final Logger log = LoggerFactory.getLogger(TriggersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final CardService cardService;

    @org.springframework.beans.factory.annotation.Autowired
    public TriggersApiController(ObjectMapper objectMapper, HttpServletRequest request, CardService cardService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.cardService=cardService;
    }

    public ResponseEntity<CrdsvcInlineResponse2001> triggersAuthorizationRequestPerformedFieldsCardOptionsPost(@ApiParam(value = "" , allowableValues="application/json") @RequestHeader(value="Accept", required=false) String accept,@ApiParam(value = "" , allowableValues="utf-8") @RequestHeader(value="Accept-Charset", required=false) String acceptCharset,@ApiParam(value = "" , allowableValues="gzip, deflate") @RequestHeader(value="Accept-Encoding", required=false) List<String> acceptEncoding,@ApiParam(value = "" ) @RequestHeader(value="X-Request-ID", required=false) String xRequestID) {
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CrdsvcInlineResponse2001>(objectMapper.readValue("{  \"data\" : [ {    \"values\" : [ {      \"label\" : \"label\",      \"value\" : \"value\"    }, {      \"label\" : \"label\",      \"value\" : \"value\"    } ],    \"label\" : \"label\",    \"value\" : \"value\"  }, {    \"values\" : [ {      \"label\" : \"label\",      \"value\" : \"value\"    }, {      \"label\" : \"label\",      \"value\" : \"value\"    } ],    \"label\" : \"label\",    \"value\" : \"value\"  } ]}", CrdsvcInlineResponse2001.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CrdsvcInlineResponse2001>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CrdsvcInlineResponse2001>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CrdsvcInlineResponse200> triggersAuthorizationRequestPerformedPost(@ApiParam(value = "Trigger request for authorization_request_performed." ,required=true )  @Valid @RequestBody Object body,@ApiParam(value = "" , allowableValues="application/json") @RequestHeader(value="Accept", required=false) String accept,@ApiParam(value = "" , allowableValues="utf-8") @RequestHeader(value="Accept-Charset", required=false) String acceptCharset,@ApiParam(value = "" , allowableValues="gzip, deflate") @RequestHeader(value="Accept-Encoding", required=false) List<String> acceptEncoding,@ApiParam(value = "" ) @RequestHeader(value="X-Request-ID", required=false) String xRequestID) {
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CrdsvcInlineResponse200>(objectMapper.readValue("{  \"data\" : [ {    \"meta\" : {      \"id\" : \"id\",      \"timestamp\" : 0    },    \"created_at\" : { },    \"card\" : { }  }, {    \"meta\" : {      \"id\" : \"id\",      \"timestamp\" : 0    },    \"created_at\" : { },    \"card\" : { }  } ]}", CrdsvcInlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CrdsvcInlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CrdsvcInlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

}
