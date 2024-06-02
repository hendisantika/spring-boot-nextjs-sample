package id.my.hendisantika.nextjssample.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-nextjs-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/06/24
 * Time: 07.28
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI(@Value("${application-description}") String appDescription, @Value("${application" +
            "-version}") String appVersion) {
        OpenAPI openAPI = new OpenAPI();
        openAPI.info(new io.swagger.v3.oas.models.info.Info()
                .title("AnaOnline API Service")
                .description(appDescription)
                .version(appVersion)
                .contact(new io.swagger.v3.oas.models.info.Contact()
                        .name("KOMINFO PP PEMUDA PERSIS")
                        .url("https://s.id/pppemudapersis")
                        .email("pp.pemuda@persis.or.id"))
                .termsOfService("TOC")
                .license(new io.swagger.v3.oas.models.info.License().name("License").url("https://s" +
                        ".id/hendisantika")));
        return openAPI;
    }

}
