import com.kai2.mapper.DianYingDao;
import com.kai2.pojo.DianYing;
import com.kai2.utils.MybatisUtils;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.util.List;

public class FirstTest {
//    public static void main(String[] args) {
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        DianYingDao dianYingDao = sqlSession.getMapper(DianYingDao.class);
//        DianYing dianYing1=new DianYing(9, "狙击手", "不知道","sd",330.3,null);
////        int result=dianYingDao.addDianYing(dianYing1);
////        int result2 = dianYingDao.deleteDianYing("2,3,4,5");
////        int result3 = dianYingDao.modifyDianYing(3);
////        DianYing dianYing2 = new DianYing(9, 9, "狙击手", "不知道");
//        List<DianYing> dianYingList = dianYingDao.SFIlm(10);
//////        List<DianYing> dianYingList2 = dianYingDao.searchDianYing();
////        List<DianYing> dianYingList = dianYingDao.searchDianYing3(4,"魔童降世2");
////        dianYingList.forEach(dianYing -> System.out.println(dianYing));
//////        System.out.println("result:"+result+"result2:"+result2+"result3:"+result3);
//        dianYingList.forEach(dianYing -> System.out.println(dianYing));
//
////        dianYingDao.insertFilm(dianYing1);
////        System.out.println(dianYing1.getId());
//
//
//                sqlSession.close();
//    }
@Test
    public void insert(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DianYingDao dianYingDao = sqlSession.getMapper(DianYingDao.class);
        List<DianYing> dianYingList = dianYingDao.searchDianYing3(4,"魔童降世2");
    for (DianYing dianYing : dianYingList) {
        System.out.println(dianYing);
    }


}
}

