package com.kai.mapper;

import com.kai.pojo.DianYing;
import com.kai.pojo.TiaoJian;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface DianYingMapper {
    List<DianYing> selectAll();
//    List<DianYing> selectAllByLeixingId();

//    @Results(id = "rs" ,value= {
//            @Result(property = "leixingId", column = "leixing_id")
//    })
//    @ResultMap("rs")
    @Select("select * from dian_ying where id=#{id}")
    DianYing selectByzhuJie(Integer id);



    //2.Mapper接口中（dao）使用注解 调用provider类的方法返回的动态sql
    @SelectProvider(type = DianYingDynamicSql.class,method = "chaXunSql")
    List<DianYing> chaDianYingHeiHei(TiaoJian tj);

}

