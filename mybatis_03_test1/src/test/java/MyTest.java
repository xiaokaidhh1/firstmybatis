import com.kai.mapper.DianYingMapper;
import com.kai.mapper.LeiXingMapper;
import com.kai.pojo.DianYing;
import com.kai.pojo.LeiXing;
import com.kai.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MyTest {
    //多对一查询
    @Test
    public void Test01() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DianYingMapper mapper = (DianYingMapper) sqlSession.getMapper(DianYingMapper.class);
        List<DianYing> dianYings = mapper.selectAll();
        for (DianYing dianYing : dianYings) {
            System.out.println(dianYing.getLeiXing() + dianYing.getMing());
        }
        sqlSession.close();

    }

    //一对多查询
    @Test
    public void Test02() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        LeiXingMapper mapper = (LeiXingMapper) sqlSession.getMapper(LeiXingMapper.class);
        for (LeiXing leiXing : mapper.selectByLeixingIdStepOne()) {
            System.out.println(leiXing.getId() + " " + leiXing.getLeixing() + leiXing.getDianYingList());
        }


        sqlSession.close();
    }

    //注解查询
    @Test
    public void Test03(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DianYingMapper mapper = (DianYingMapper) sqlSession.getMapper(DianYingMapper.class);
        System.out.println(mapper.selectByzhuJie(2));
    }

}
