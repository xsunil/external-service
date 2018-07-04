package com.sunil.external.service.sanction;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.*;

//import com.wordnik.swagger.annotations.ApiOperation;

@RequestMapping("/sanction")
public class SanctionServiceControllerBase {

    @RequestMapping(value="/version",  produces = { MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.GET)
    @ApiOperation(value = "getGreeting", nickname = "getGreeting")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "name", value = "User's name", required = false, dataType = "string", paramType = "query", defaultValue="Niklas")
      })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = String.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")}) 
    public String getSanctionVersion(@RequestParam(value="name", defaultValue="World") String name) {
        return "This is Sanction Server Initial version 0.5 :: " + name;
    }


}
