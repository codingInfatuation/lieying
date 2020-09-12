package org.lieying.bean;


import lombok.Data;
import org.apache.ibatis.type.Alias;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "job_hunter_order")
@Data
@Alias("JobHunterOrder")
public class JobHunterOrder implements Serializable {
	
	
	
	@Id
//	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="job_hunter_order_id")
	private Integer id;
	
	@ManyToOne(targetEntity=JobHunter.class)
	@JoinColumn(name="job_hunter_id")
	private JobHunter jobHunter;
	@ManyToOne(targetEntity=Resource.class)
	@JoinColumn(name="resource_id")
	private Resource resource;
	
	@Column(name="job_hunter_order_state")
	private String state;
	
	@Column(name="job_hunter_order_created_date")
	private Date createdDate;
	
	@Column(name="job_hunter_order_pay_date")
	private Date payDate;

}
