
import com.kai.mapper.SysRolesMapper;
import com.kai.mapper.SysUsersMapper;
import com.kai.pojo.SysUsers;
import com.kai.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MyTest {

    //注解查询
    @Test
    public void Test03(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
       SysUsersMapper mapper= sqlSession.getMapper(SysUsersMapper.class);
        SysUsers users = new SysUsers();
        users.setUsersn("xai");
        users.setPassword("12334");
        users.setName("赵六");
        users.setAge(11);
        users.setSex("女");
       mapper.insertAll(users);
        mapper.del(7);
    }
}
