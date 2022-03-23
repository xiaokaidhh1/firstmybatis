package com.kai.mapper;

import com.kai.pojo.TiaoJian;

//1.编写provider 提供动态拼接sql的方法
public class DianYingDynamicSql {
    public String chaXunSql(TiaoJian tj) {//提供动态拼接sql的方法
        String sql = "select * from dian_ying where 12=12 ";
        if (tj.getMing() != null && tj.getMing().length() > 0) {
            sql += " and ming like concat('%',#{ming},'%')";
        }
        if (tj.getYanYuan() != null && tj.getYanYuan().length() > 0) {
            sql += " and yanyuan like concat('%',#{yanYuan},'%')";
        }
        if (tj.getLeixingId() != null) {
            sql += " and leixing_id = #{leixingId}";
        }
        if (tj.getDiJia() != null) {
            sql += " and piaojia > #{diJia}";
        }
        return sql;
    }

}