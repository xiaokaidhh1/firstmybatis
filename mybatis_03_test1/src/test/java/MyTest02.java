import com.kai.mapper.LoginDao;
import com.kai.mapper.UserDao;
import com.kai.pojo.SysUsers;
import com.kai.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

public class MyTest02 {
    @Test
    public void Test01() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        LoginDao mapper = sqlSession.getMapper(LoginDao.class);

       if(mapper.searchUser("zhangsan","123")!=null)
           System.out.println("登录成功！");
       else
           System.out.println("用户名或密码错误！请重新登录");

        SysUsers user2 = new SysUsers();
        user2.setUsersn("xiaokai");
        user2.setPassword("123");
        user2.setName("李四");
        user2.setAge(19);
        user2.setSex("男");

        if(mapper.insert(user2)==1){
            System.out.println("添加成功");
        }

        sqlSession.close();
    }
    //修改信息   //where节点动态查询
    @Test
    public void Test02(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        if(userDao.modify(3,"王五",10)==1){
            System.out.println("修改成功！");
        }
        SysUsers user = new SysUsers();
        user.setId(2);
        user.setName("张三");
        if(userDao.searchs(user)==1){
            System.out.println("查询成功!");
        }
    }


}
