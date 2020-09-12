package org.lieying.bean;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Table(name="chat")
@Data
@Alias("Chat")
public class Chat  implements Serializable {

	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="chat_id")
	private Integer id;
	
	@ManyToOne(targetEntity=JobHunter.class)
	@JoinColumn(name="job_hunter_id")
	private JobHunter jobHunter;
	
	@ManyToOne(targetEntity=Recruiter.class)
	@JoinColumn(name="recruiter_id")
	private Recruiter recruiter;
	
	@Column(name="chat_content",columnDefinition="text")
	private String content;
	
	@Column(name="chat_sent_date")
	private Date sentDate;
}
