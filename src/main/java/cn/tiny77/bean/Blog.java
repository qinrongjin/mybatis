package cn.tiny77.bean;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("blog")
public class Blog {

    private Integer id;

    private String title;

    private String content;

}
