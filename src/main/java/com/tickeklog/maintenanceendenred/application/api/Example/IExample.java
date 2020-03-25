package com.tickeklog.maintenanceendenred.application.api.Example;
import java.util.List;
import com.tickeklog.maintenanceendenred.application.model.userModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import io.swagger.annotations.ApiOperation;
/**
 * IExample
 */
public interface IExample {

    @GetMapping("api/user/getAll")
	@ApiOperation("Retorna lista de usuarios.")
	ResponseEntity<List<userModel>> getById();
}