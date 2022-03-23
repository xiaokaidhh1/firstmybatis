import com.kai.mybatis.mapper.NewsMapper;
import com.kai.mybatis.pojo.News;
import com.kai.mybatis.pojo.NewsExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class MyTest {
    @Test
    public void test01() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        NewsMapper mapper = sqlSession.getMapper(NewsMapper.class);
//        //查询所有数据
//        List<News> list = mapper.selectByExample(null);
//        list.forEach(news -> System.out.println(news));

//        根据条件查询
//        NewsExample example = new NewsExample();
//        example.createCriteria().andAuthorEqualTo("环球时报");
//        List<News> list2 = mapper.selectByExample(example);
//        list2.forEach(news -> System.out.println(news));

//        修改
        mapper.updateByPrimaryKey(new News(4,"2","d","sss","s","s",4 ));
    }
}
