package org.rnr.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("org.rnr.core")
@EnableTransactionManagement
public class RnrCoreConfig {

}
