package org.lieying.service.impl;

import org.lieying.bean.ArticleComment;
import org.lieying.dao.ArticleCommentMapper;
import org.lieying.service.ArticleCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("articleCommentService")
public class ArticleCommentServiceImpl  implements ArticleCommentService {
    @Autowired
    private ArticleCommentMapper articleCommentMapper;


    @Override
    public ArticleComment queryArticleCommentById(int articleCommentId) {
        return articleCommentMapper.selectArticleCommentById(articleCommentId);
    }

    @Override
    public List<ArticleComment> queryArticleCommentsByArticleId(int articleId) {
        return articleCommentMapper.selectArticleCommentsByArticleId(articleId);
    }
}
