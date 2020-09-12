package org.lieying.service;

import org.lieying.bean.ArticleComment;

import java.util.List;

public interface ArticleCommentService {
    public ArticleComment queryArticleCommentById(int articleCommentId);
    public List<ArticleComment> queryArticleCommentsByArticleId(int articleId);

}
