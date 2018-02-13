package cn.tiny77.mapper;

import cn.tiny77.bean.Blog;
import cn.tiny77.sql.BlogSql;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

public interface BlogMapper {

    Blog selectBlog(@Param("id") Integer id);

}
