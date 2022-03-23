package com.kai2.mapper;

import com.kai2.pojo.DianYing;
import com.kai2.pojo.LeiXing;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DianYingDao {
    int addDianYing(DianYing dianYing);
    int deleteDianYing(String xxx);
    int modifyDianYing(int yyy);
    List<DianYing> SFIlm(int id);
    List<DianYing> searchDianYing();
    List<DianYing> searchDianYing2(Integer id,String ming);
    List<DianYing> searchDianYing3(@Param("id") Integer id, @Param("ming") String ming);

    void insertFilm(DianYing dianYing);

}
