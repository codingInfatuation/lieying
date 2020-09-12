package org.lieying.bean;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
@JsonIgnoreProperties(value = "handler")
@Table(name="job_hunter")
@Data

@Alias("JobHunter")
public class JobHunter {

	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="job_hunter_id")
	private int id;
	@Column(name="job_hunter_username",length=20,nullable=false,unique=true)
	private String username;
	@Column(name="job_hunter_password",length=18,nullable=false)
	private String password;
	@Column(name="job_hunter_email",length=320,unique=true)
	private String email;
	@Column(name="job_hunter_phone",length=11,nullable=false,unique=true)
	private String phone;

	@Column(name="job_hunter_name",length=15)
	private String name;

	@Column(name="job_hunter_sex",length=2)
	private String sex;
	@Column(name="job_hunter_birthday")
	private Date birthday;
	@Column(name="job_hunter_photo",length=1024)
	private String photo;
	@Column(name="job_hunter_education",length=6)
	private String education;
	@Column(name="job_hunter_interest",length=200)
	private String interest;
	@Column(name="job_hunter_address",length=40)
	private String address;
	@OneToMany(mappedBy="jobHunter")
	private Set<JobHunterReport> jobHunterReports;
	@OneToMany(mappedBy="jobHunter")
	private Set<PositionCollect> positionCollects;
	@OneToMany(mappedBy="jobHunter")
	private Set<ArticleComment> articleComments;
	@OneToMany(mappedBy="jobHunter")
	private Set<ArticleCollect> articleCollects;
	@OneToMany(mappedBy="jobHunter")
	private Set<ArticlePraise> articlePraises;
	@OneToMany(mappedBy="jobHunter")
	private Set<JobHunterOrder> jobHunterOrders;
	@OneToMany(mappedBy="jobHunter")
	private Set<Chat> chats;
	@OneToMany(mappedBy="jobHunter")
	private Set<Resume> resumes;
	@OneToMany(mappedBy = "jobHunter")
	private Set<Article> articles;
	@OneToMany(mappedBy = "jobHunter")
	private Set<ArticleCommentRely> articleCommentRelies;

	private  String token;





}
