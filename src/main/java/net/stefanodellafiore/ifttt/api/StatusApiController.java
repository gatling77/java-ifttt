package net.stefanodellafiore.ifttt.api;

import net.stefanodellafiore.ifttt.model.CrdsvcErrors;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-13T20:36:06.995+02:00")

@Controller
public class StatusApiController implements StatusApi {

    private static final Logger log = LoggerFactory.getLogger(StatusApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public StatusApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> statusGet(@ApiParam(value = "" , allowableValues="application/json") @RequestHeader(value="Accept", required=false) String accept,@ApiParam(value = "" , allowableValues="utf-8") @RequestHeader(value="Accept-Charset", required=false) String acceptCharset,@ApiParam(value = "" , allowableValues="gzip, deflate") @RequestHeader(value="Accept-Encoding", required=false) List<String> acceptEncoding,@ApiParam(value = "" ) @RequestHeader(value="X-Request-ID", required=false) String xRequestID) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
