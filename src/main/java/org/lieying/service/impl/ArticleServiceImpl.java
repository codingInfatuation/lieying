package org.lieying.service.impl;

import org.lieying.bean.Article;
import org.lieying.dao.ArticleMapper;
import org.lieying.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "articleService")
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    @Cacheable(value = "cache1")
    @Transactional(readOnly = true)
    @Override
    public List<Article> queryArticlesByJobHunterId(int jobHunterId) {
        return articleMapper.selectArticlesByJobHunterId(jobHunterId);
    }
    @Cacheable(value = "cache1")
    @Transactional(readOnly = true)
    @Override
    public Article queryArticleById(int articleId) {
        return articleMapper.selectArticleById(articleId);
    }
}
