package com.yupi.yupao.config;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * 自定义 Swagger 接口文档的配置
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@Configuration
@EnableSwagger2WebMvc
@Profile({"dev", "test"})
public class SwaggerConfig {

    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 这里一定要标注你控制器的位置
                .apis(RequestHandlerSelectors.basePackage("com.yupi.yupao.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    // [加入编程导航](https://t.zsxq.com/0emozsIJh) 深耕编程提升【两年半】、国内净值【最高】的编程社群、用心服务【20000+】求学者、帮你自学编程【不走弯路】

    /**
     * api 信息
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("鱼皮用户中心")
                .description("鱼皮用户中心接口文档")
                .termsOfServiceUrl("https://github.com/liyupi")
                .contact(new Contact("yupi","https://github.com/liyupi","xxx@qq.com"))
                .version("1.0")
                .build();
    }
}
