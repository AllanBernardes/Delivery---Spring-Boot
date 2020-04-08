package com.tickeklog.maintenanceendenred.application.configuration;

import java.util.Collections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;
import springfox.documentation.builders.PathSelectors;
/**
 * SwaggerConfig
  * Create by Allan Bernardes Flores
 * Data: 04/2020 
 */

@Configuration
@EnableSwagger2WebMvc
@Import(SpringDataRestConfiguration.class)
public class SwaggerConfig {

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
              .apiInfo(apiInfo())
              .select()
              .apis(RequestHandlerSelectors.any())
              .paths(PathSelectors.any())
              .build();
  }

  private ApiInfo apiInfo() {
    return new ApiInfo("Ticket Log API Document","API Document for Developers", String.format("0.0.1-SNAPSHOT"),
            "Terms of service", null, "License of API", "API license URL", Collections.emptyList());
  }
  
}
