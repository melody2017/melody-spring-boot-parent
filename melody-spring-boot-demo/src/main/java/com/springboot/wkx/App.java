package com.springboot.wkx;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@SpringBootApplication
public class App extends WebMvcConfigurerAdapter{
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		//定义一个转换消息的对象
		FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
		
		FastJsonConfig config = new FastJsonConfig();
		
		config.setSerializerFeatures(SerializerFeature.PrettyFormat);
		
		//在转换器中添加配置信息
		fastJsonHttpMessageConverter.setFastJsonConfig(config);
		
		//将转换器添加到converters
		converters.add(fastJsonHttpMessageConverter);
	}
}
