package com.czxy.confilg;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author
 * @infos 你要做什么
 * @date 2019/7/8
 */
@Configuration
public class SpringMvc  implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
     registry.addResourceHandler("/updata/**").addResourceLocations("file:z:\\img\\");
    }
}
