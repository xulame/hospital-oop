package com.egitim.egitim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MerhabaDunya extends SpringBootServletInitializer {
        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            return application.sources(MerhabaDunya.class);
        }

        public static void main(String[] args) throws Exception {
            SpringApplication.run(MerhabaDunya.class, args);
        }
}
