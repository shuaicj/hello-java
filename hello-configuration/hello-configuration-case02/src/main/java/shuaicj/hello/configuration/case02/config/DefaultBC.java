package shuaicj.hello.configuration.case02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import shuaicj.hello.configuration.case02.bean.B;
import shuaicj.hello.configuration.case02.bean.C;

/**
 * Config default B, C.
 *
 * @author shuaicj 2019/10/12
 */
@Configuration
public class DefaultBC {

    @Bean
    public B b() {
        return new B("default-B");
    }

    @Bean
    public C c() {
        return new C("default-C");
    }
}
