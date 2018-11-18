package cn.edu.buaa.graphqldatashare;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.edu.buaa.graphqldatashare.mapper")
public class GraphqlDatashareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlDatashareApplication.class, args);
    }

}
