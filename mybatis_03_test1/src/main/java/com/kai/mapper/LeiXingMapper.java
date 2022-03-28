package com.kai.mapper;

import com.kai.pojo.LeiXing;

import java.util.List;

public interface LeiXingMapper {
    List<LeiXing> SelectByLeixingId(int id);
    List<LeiXing> selectByLeixingIdStepOne();

}
