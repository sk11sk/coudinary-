package com.UF.config;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;


@Configuration
public class CloudinaryConfig {

    @Bean
    public Cloudinary projectConfig() {
        Cloudinary cloudinary = null;
        Map config = new HashMap();
        config.put("cloud_name", "dlui3s2u5");
        config.put("api_key", "291618791116669");
        config.put("api_secret", "X8RZj9v8psOs78pxF3Sd3VASIK8");
        cloudinary = new Cloudinary(config);
        return cloudinary;
    }

}
