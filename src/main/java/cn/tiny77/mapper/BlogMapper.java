package cn.tiny77.mapper;

import cn.tiny77.bean.Blog;
import org.apache.ibatis.annotations.Param;

public interface BlogMapper {

    Blog selectBlog(@Param("id") Integer id);

}
