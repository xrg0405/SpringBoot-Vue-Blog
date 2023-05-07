package com.cseeer.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cseeer.domain.entity.Article;
import com.cseeer.mapper.ArticleMapper;
import com.cseeer.service.ArticleService;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
}
