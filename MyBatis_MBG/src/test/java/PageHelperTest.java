import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kai.mybatis.mapper.NewsMapper;
import com.kai.mybatis.pojo.News;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PageHelperTest {
    @Test
    public void PageHelper() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        NewsMapper mapper = sqlSession.getMapper(NewsMapper.class);
//        开启分页
        PageHelper.startPage(2, 4);

        List<News> list = mapper.selectByExample(null);
//        list.forEach(news -> System.out.println(news));
        PageInfo<News> page = new PageInfo<>(list, 5);//展示5个导航分页
        System.out.println(page.getStartRow());
    }
}
