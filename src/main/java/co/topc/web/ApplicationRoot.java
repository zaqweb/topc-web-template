package co.topc.web;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zaqweb
 * @date 2019-06-30 21:39
 */
@SpringBootApplication
@EnableAutoConfiguration
//@MapperScan("co.topc.web.**.mapper")
public class ApplicationRoot {
  public static void main(String[] args) {
    SpringApplication.run(ApplicationRoot.class, args);
  }
}
