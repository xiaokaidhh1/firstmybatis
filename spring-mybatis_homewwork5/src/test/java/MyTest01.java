import com.kai.dao.UserDao;
import com.kai.pojo.SysUsers;
import com.kai.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestExecutionListeners;

import java.util.List;

public class MyTest01 {
    @Test
    public  void Test1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = context.getBean(UserService.class);
        //实验1登录
        if(service.login("xiaokai","123")!=0){
            System.out.println("登录成功！");
        }
        else {
            System.out.println("登录失败");
        }

        //实验1注册
        SysUsers user2 = new SysUsers();
        user2.setUsersn("xiaokai");
        user2.setPassword("123");
        user2.setName("李四");
        user2.setAge(19);
        user2.setSex("男");
        if(service.reg(user2)!=0){
            System.out.println("用户"+user2+"注册成功");
        }

    }

    @Test
    public void Test02(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = context.getBean(UserService.class);
        if(service.modify(3,"王五",10)!=0){
            System.out.println("修改成功！");
        }
        SysUsers user = new SysUsers();
        user.setId(2);
        user.setName("张三");
        if(service.searchs(user)!=0){
            System.out.println("查询成功!");
        }
    }
    @Test
    public void test03() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = context.getBean(UserService.class);
        List<SysUsers> list = service.queryAllUsers();
        for (SysUsers sysUsers : list) {
            System.out.println(sysUsers);
        }
    }

}
