package org.lieying.bean;


import lombok.Data;
import org.apache.ibatis.type.Alias;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Table(name = "resource")
@Data
@Alias("Resource")
public class Resource implements Serializable {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "resource_id")
	private Integer id;
	@Column(name="resource_name",length=15)
	private String name;
	@Column(name="resource_type",length=20)
	private String type;
	@Column(name="resource_path",length=1024)
	private String path;
	@Column(name="resource_cover",length=256)
	private String cover;
	
	
	@ManyToOne(targetEntity=Administrator.class)
	@JoinColumn(name="administrator_id")
	private Administrator administrator;
	
	@OneToMany(mappedBy="resource")
	private Set<JobHunterOrder> jobHunterOrders;
}
