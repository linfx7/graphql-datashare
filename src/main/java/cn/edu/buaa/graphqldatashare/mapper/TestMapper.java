package cn.edu.buaa.graphqldatashare.mapper;

import cn.edu.buaa.graphqldatashare.domain.TestUser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper
public interface TestMapper {

    @Select("SELECT id, name, sex, age FROM t_test WHERE id = #{id}")
    TestUser findById(int id);

    @Select("SELECT id, name, sex, age FROM t_test WHERE sex = #{sex}")
    List<TestUser> findBySex(String sex);
}
