package com.kai.mapper;

import com.kai.pojo.DianYing;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DianYingMapper {
    List<DianYing> selectAll();
    List<DianYing> selectAllByLeixingId();

    @Results(id = "rs" ,value= {
            @Result(property = "leixingId", column = "leixing_id")
    })

    @ResultMap("rs")
    @Select("select * from dian_ying where id=#{id}")
    DianYing selectByzhuJie(Integer id);


}
