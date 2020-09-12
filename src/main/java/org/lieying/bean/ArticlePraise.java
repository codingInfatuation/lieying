package org.lieying.bean;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@JsonIgnoreProperties(value = "handler")
@Table(name = "article_praise")
@Data
@Alias("ArticlePraise")
public class ArticlePraise implements Serializable {
	@Id
//	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="article_praise_id")
	private Integer id;
	
	@ManyToOne(targetEntity=Article.class)
	@JoinColumn(name="article_id")
	private Article article;
	
	@ManyToOne(targetEntity=JobHunter.class)
	@JoinColumn(name="job_hunter_id")
	private JobHunter jobHunter;
	
	@Column(name="article_praise_created_time")
	private Date createdTime;
}
