package org.lieying.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import javax.persistence.*;
import java.util.Set;
@JsonIgnoreProperties(value = "handler")
@Table(name = "district")
@Data
@Alias("District")
public class District {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="district_id")
    private int id;
    @Column(name="district_name")
    private String name;
    @ManyToOne(targetEntity = City.class)
    @JoinColumn(name ="city_id")
    private City city;

    @OneToMany(mappedBy = "district")
    private Set<Position> positions;


}
