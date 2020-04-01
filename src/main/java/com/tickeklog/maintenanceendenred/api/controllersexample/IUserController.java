package com.tickeklog.maintenanceendenred.api.controllersexample;

import javax.validation.Valid;

import com.tickeklog.maintenanceendenred.application.model.UserModel;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.annotations.ApiOperation;
/**
 * IExample
 */

public interface IUserController {

  @PostMapping("api/user/create")
  @ApiOperation("Insert user.")    
  ResponseEntity<?> addUser(@Valid @RequestBody final UserModel usermodel);
}