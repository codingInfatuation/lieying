package org.lieying.bean;
import lombok.Data;
import org.apache.ibatis.type.Alias;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "job_hunter_report")
@Data
@Alias("JobHunterReport")
public class JobHunterReport implements Serializable {

	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="job_hunter_report_id")
	private Integer id;
	
	@ManyToOne(targetEntity=JobHunter.class)
	@JoinColumn(name="job_hunter_id")
	private JobHunter jobHunter;
	@ManyToOne(targetEntity=Position.class)
	@JoinColumn(name="position_id")
	private Position position;
	@Column(name="job_hunter_report_reason")
	private String reason;
	
	@Column(name="job_hunter_report_footnote")
	private String footnote;
	
	@Column(name="job_hunter_report_evidence_screen_shot")
	private String evidenceScreenShot;
	
	@Column(name="job_hunter_report_created_time")
	private java.util.Date createDate;
	
}
