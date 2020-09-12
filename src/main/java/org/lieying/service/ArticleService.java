package org.lieying.service;

import org.lieying.bean.Article;

import java.util.List;

public interface ArticleService {
    public List<Article> queryArticlesByJobHunterId(int jobHunterId);
    public Article queryArticleById(int articleId);
}
