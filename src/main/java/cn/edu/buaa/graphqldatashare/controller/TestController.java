package cn.edu.buaa.graphqldatashare.controller;

import cn.edu.buaa.graphqldatashare.domain.TestUser;
import cn.edu.buaa.graphqldatashare.mapper.TestMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private TestMapper mapper;

    @GetMapping("/testusers")
    public List<TestUser> getTestUser(@RequestParam String sex) {
        return mapper.findBySex(sex);
    }
}
