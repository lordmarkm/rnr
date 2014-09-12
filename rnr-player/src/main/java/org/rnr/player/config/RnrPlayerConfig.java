package org.rnr.player.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("org.rnr.player")
@EnableTransactionManagement
public class RnrPlayerConfig {

}
