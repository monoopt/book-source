package com.javaee.ticketsys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description swagger配置文件，用于生成api接口文档
 * @Author huaiwenhe
 * @Date 2020/10/10
 **/
@EnableSwagger2
@Configuration
public class SwaggerConfig {

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 设置页面标题
                .title("使用swagger2构建后端api接口文档")
                // 设置联系人
                .contact(new Contact("myname", "url", "email"))
                // 描述
                .description("欢迎访问后端接口文档，这里是描述信息")
                // 定义版本号
                .version("1.0").build();
    }

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                //指定要扫描生成api接口的包
                .apis(RequestHandlerSelectors.basePackage("com.javaee.ticketsys.controller"))
                .paths(PathSelectors.any()).build();
    }
}
