package org.lieying.web.controller;

import org.lieying.bean.Article;
import org.lieying.service.ArticleCommentService;
import org.lieying.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private ArticleCommentService articleCommentService;

    //文章详情
    @RequestMapping("/{articleId}")
    public Article articleDetail(@PathVariable int articleId){
        return articleService.queryArticleById(articleId);
    }

//    @RequestMapping("/{articleId}/comments")
//    public List<ArticleComment> articleComments(@PathVariable int articleId){
//        return articleCommentService.queryArticleCommentsByArticleId(articleId);
//    }
    /*
    *
    *  求职者发布的所有文章
    *  @param  jobHunterId  求职者id
    *
    */
    @RequestMapping("/list/{jobHunterId}")
    public List<Article> getArticlesByJobHunterId(@PathVariable int jobHunterId){
        return articleService.queryArticlesByJobHunterId(jobHunterId);
    }




}
