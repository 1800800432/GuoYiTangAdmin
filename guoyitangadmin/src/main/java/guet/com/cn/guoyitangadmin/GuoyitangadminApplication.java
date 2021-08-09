package guet.com.cn.guoyitangadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("guet.com.cn.guoyitang.mapper")
@EnableTransactionManagement  //开启事务
public class GuoyitangadminApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuoyitangadminApplication.class, args);
    }

}
