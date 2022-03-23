package com.kai.mapper;

import com.kai.pojo.News1;
import com.kai.pojo.Type;

import java.util.List;

public interface TypeMapper {
    List<Type> searchById(int id);
    Type searchAll(int id);
    Type searchBystepOne(int cancelById);
}
