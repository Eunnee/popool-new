package kr.co.popool.infra.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
public class SwaggerConfig {

  private static final String API_NAME = "Career API";
  private static final String API_VERSION = "1.0";
  private static final String API_DESCRIPTION = "Career 서버 API 문서";

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.any())
        .paths(PathSelectors.any())
        .build();
  }
  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title(API_NAME)                // API 이름지정
        .version(API_VERSION)           // API 버전
        .description(API_DESCRIPTION)   // API 설명
        .build();
  }

}