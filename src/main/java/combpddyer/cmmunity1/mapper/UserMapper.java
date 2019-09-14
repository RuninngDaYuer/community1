package combpddyer.cmmunity1.mapper;

import combpddyer.cmmunity1.model.User;
import org.apache.ibatis.annotations.*;

/**
 * @Auther: 奔跑的玉哥儿
 * @Date: 2019/9/8
 * @Description: combpddyer.cmmunity1.mapper
 * @Version: 1.0
 */

@Mapper
public interface UserMapper {
    @Insert("insert into user(name,account_id,token,gmt_create,gmt_modified) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);

    @Select("select * from user where token=#{token}")
    User findByToken(@Param("token") String token);

}

