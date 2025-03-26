package org.springframework.anno;

import org.springframework.context.annotation.Bean;

/**
 * @author weibb
 * @date 2023-07-17
 */
//@Configuration
public class ConfigBean {

    @Bean
    public User user1() {
        return new User();
    }

    @Bean("user2Bean")
    public User user2() {
        return new User();
    }

    //bean名称为：user3Bean，2个别名：[user3BeanAlias1,user3BeanAlias2]
    @Bean({"user3Bean", "user3BeanAlias1", "user3BeanAlias2"})
    public User user3() {
        return new User();
    }
}
