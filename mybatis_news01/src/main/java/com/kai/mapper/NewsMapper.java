package com.kai.mapper;

import com.kai.pojo.News1;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface NewsMapper {
    List<News1> search(News1 news1);
    void insertNews(News1 news1);
    void updateNews(News1 news1);
    List<News1> searchNews();
    List<News1> serchBystepTwo(int tid);

}
