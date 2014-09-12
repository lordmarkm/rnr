package org.rnr.core.config;

import javax.annotation.PostConstruct;

import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RnrSupportConfig {

    @Bean
    public DozerBeanMapper mapper() {
        return new DozerBeanMapper();
    }

    @PostConstruct
    public void init() {
        mapper().addMapping(new BeanMappingBuilder() {
            @Override
            protected void configure() {
//                mapping(PplaSalesOrderInfo.class, PplaSalesOrder.class)
//                    .fields("orderItems", "items");
            }
        });
    }

}
