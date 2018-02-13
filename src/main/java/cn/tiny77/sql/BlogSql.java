package cn.tiny77.sql;

import org.apache.ibatis.jdbc.SQL;

public class BlogSql {

    public String selectBlog2(final Integer id){
        return new SQL(){{
            SELECT("*");
            FROM("blog");
            WHERE("id=#{id}");
        }}.toString();
    }

}
