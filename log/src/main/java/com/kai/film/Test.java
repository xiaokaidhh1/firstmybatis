package com.kai.film;

import com.kai.dao.FilmDao;
import com.kai2.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        FilmDao mapper = sqlSession.getMapper(FilmDao.class);
        List<Film> allFilms = mapper.getFilmList();
        for(Film f: allFilms){
            System.out.println(f);
    }
//        allFilms.forEach(Film-> System.out.println(Film));

    }
}
