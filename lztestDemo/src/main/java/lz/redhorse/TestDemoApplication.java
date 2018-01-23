package lz.redhorse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by lvyanxin on 2018/1/23.
 */
@SpringBootApplication
//@ImportResource("classpath:spring/*.xml")
public class TestDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestDemoApplication.class,args);
    }
}
