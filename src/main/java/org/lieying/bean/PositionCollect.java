package org.lieying.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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

@JsonIgnoreProperties(value = "handler")
@Table(name = "position_collect")
@Data
@Alias("PositionCollect")
public class PositionCollect implements Serializable {

    @Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "position_collect_id")
    private Integer id;

    @ManyToOne(targetEntity = JobHunter.class)
    @JoinColumn(name = "job_hunter_id")
    private JobHunter jobHunter;
    @ManyToOne(targetEntity = Position.class)
    @JoinColumn(name = "position_id")
    private Position position;
    @Column(name = "position_collect_created_time")

    private java.util.Date createDate;

}
