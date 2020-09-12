package org.lieying.dao;
import org.lieying.bean.ArticleCommentRely;
import java.util.List;
public interface ArticleCommentRelyMapper {
    public ArticleCommentRely selectArticleCommentRelyById(int articleCommentRelyId);
    public List<ArticleCommentRely> selectArticleCommentReliesByArticleCommentId(int articleCommentId);

}
