package com.cseeer.domain.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Article)表实体类
 *
 * @author makejava
 * @since 2023-05-07 14:59:31
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_article")
public class Article {
    @TableId
    //文章id
    private Integer id;
    //作者id
    private Integer userId;
    //分类id
    private Integer categoryId;
    //缩略图
    private String articleCover;
    //文章标题
    private String articleTitle;
    //文章内容
    private String articleContent;
    //类型 (1原创 2转载 3翻译)
    private Integer articleType;
    //是否置顶 (0否 1是）
    private Integer isTop;
    //是否删除 (0否 1是)
    private Integer isDelete;
    //是否推荐 (0否 1是)
    private Integer isRecommend;
    //状态 (1公开 2私密 3评论可见)
    private Integer status;
    //发表时间
    private Date createTime;
    //更新时间
    private Date updateTime;
    }

