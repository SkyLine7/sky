package com.panda.sky.http;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

/**
 * SpringMVC配置
 * @author pcongda
 * @version 1.0
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
    
	/**
     * 配置静态访问资源
     * @param registry
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
    	String[] classPathResourceLocations = {"classpath:/META-INF/resources/", 
									           "classpath:/resources/",
									           "classpath:/static/", 
									           "classpath:/public/"};
        registry.addResourceHandler("/**").addResourceLocations(classPathResourceLocations);
    }
    
    /**
     * 配置fastJson
     * @param converters
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        fastConverter.setFastJsonConfig(fastJsonConfig);
        converters.add(fastConverter);
        super.configureMessageConverters(converters);
    }
    
    /**
     * 
     * 跨域配置
     * @see 
     */
    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedHeaders("Access-Control-Allow-Origin", "*")
                .allowedMethods("Access-Control-Allow-Methods", "*")
                .allowedOrigins("*");
        super.addCorsMappings(registry);
    }
    
    /**
     * 直接访问http://localhost:8080 跳转到a.html页面
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //registry.addRedirectViewController("/", "/test/a.html");
        //简易的路由
        registry.addViewController("/").setViewName("/test/a");
        super.addViewControllers(registry);
    }
}
