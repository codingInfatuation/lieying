package org.lieying.dao;

import org.lieying.bean.ArticleComment;

import java.util.List;

public interface ArticleCommentMapper {
    public ArticleComment selectArticleCommentById(int articleCommentId);
    public List<ArticleComment> selectArticleCommentsByArticleId(int articleId);

}
