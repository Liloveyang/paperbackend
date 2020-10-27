package cn.fan.paperbackend.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * +TODO
 *
 * @author : lirongfan@bytedance.com
 * @since : 2020/10/22
 */
@Data
@ConfigurationProperties("spring.user")
public class UserPorperties {
    private String name;
}
