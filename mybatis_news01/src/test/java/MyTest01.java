import com.kai.mapper.NewsMapper;
import com.kai.mapper.TypeMapper;
import com.kai.pojo.News1;
import com.kai.pojo.Type;
import com.kai.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MyTest01 {
//    @Test
//    public static void main(String[] args) {
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        NewsMapper newsMapper = sqlSession.getMapper(NewsMapper.class);
////        查询
//        News1 n1 = new News1(1,"环球时报");
//        newsMapper.search(n1);
//        //增加
//        News1 n2 = new News1("俄乌冲突", "环球包", "2022-3-6", "ssssssss", "C盘");
//        newsMapper.insertNews(n2);
//        //修改
//        News1 n3 = new News1();
//        n3.setId(2);
//        n3.setAuthor("央视新闻");
//        n3.setContent("啦啦啦啦啦啦啦啦啦啦");
//        newsMapper.updateNews(n3);
//        sqlSession.close();
//
//    }
    @Test
    public  void test02() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TypeMapper typeMapper = sqlSession.getMapper(TypeMapper.class);
        System.out.println(typeMapper.searchById(4));

    }
    @Test
    public  void test03() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        NewsMapper newsMapper = sqlSession.getMapper(NewsMapper.class);
        List<News1> list= newsMapper.searchNews();
        for (News1 news1 : list) {
            System.out.println(news1.getAuthor());
        }

    }
    @Test
    public  void test04() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TypeMapper typeMapper = sqlSession.getMapper(TypeMapper.class);
        System.out.println(typeMapper.searchAll(4).getNews1s());

    }
    @Test
    public  void serachBystepCollection() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TypeMapper typeMapper = sqlSession.getMapper(TypeMapper.class);
        System.out.println(typeMapper.searchBystepOne(4));

    }
}
