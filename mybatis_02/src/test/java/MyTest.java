
import com.kai.mapper.SysUsersMapper;
import com.kai.pojo.SysUsers;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import com.kai.pojo.utils.MybatisUtils;

import java.util.List;

public class MyTest {
    @Test
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SysUsersMapper mapper= sqlSession.getMapper(SysUsersMapper.class);
        List<SysUsers> list = mapper.queryAllUsers();
        for (SysUsers sysUsers : list) {
            System.out.println(sysUsers.getName());
        }


    }
}
