package net.cfrost.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;

@Configuration
@ImportResource("classpath*:beans.xml")
@Import({SecurityConfiguration.class})
@ComponentScan(
        basePackages = "net.cfrost.web",
        excludeFilters = @ComponentScan.Filter(Controller.class)
)

public class RootContextConfiguration
{
}
