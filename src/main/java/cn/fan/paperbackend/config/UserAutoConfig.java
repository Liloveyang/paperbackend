package cn.fan.paperbackend.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * +TODO
 *
 * @author : lirongfan@bytedance.com
 * @since : 2020/10/22
 */
@Configuration
@EnableConfigurationProperties(UserPorperties.class)
public class UserAutoConfig {

    @Bean
    @ConditionalOnProperty(prefix = "spring.user",value = "enabled",havingValue = "true")
    public UserClient userClient(UserPorperties userPorperties){
        return new UserClient(userPorperties);
    }
}
