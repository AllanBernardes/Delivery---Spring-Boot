package com.tickeklog.maintenanceendenred.api.controllersexample;

import javax.validation.Valid;

import com.tickeklog.maintenanceendenred.application.model.UserModel;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.annotations.ApiOperation;
/**
 * IExample
 */

public interface IUserController {

  @GetMapping("api/user/create")
  @ApiOperation("Insert user.")    
  ResponseEntity<?> addUser(@Valid @RequestBody final UserModel usermodel);
}