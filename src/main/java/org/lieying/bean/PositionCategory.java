package org.lieying.bean;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
@JsonIgnoreProperties(value = "handler")
@Table(name = "position_category")
@Data
@Alias("PositionCategory")
public class PositionCategory implements Serializable {
    @Id
    @Column(name = "position_category_id")
    private Integer id;
    @Column(name = "position_category_name", length = 15)
    private String name;
    @ManyToOne(targetEntity = PositionCategory.class)
    @JoinColumn(name = "father_position_category_id")
    private PositionCategory fatherPositionCategory;

    @OneToMany(mappedBy="fatherPositionCategory")
    private Set<PositionCategory> sonPositionCategories;

    @OneToMany(mappedBy="positionCategory")
    private List<Position> positions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PositionCategory getFatherPositionCategory() {
        return fatherPositionCategory;
    }

    public void setFatherPositionCategory(PositionCategory fatherPositionCategory) {
        this.fatherPositionCategory = fatherPositionCategory;
    }

    public Set<PositionCategory> getSonPositionCategories() {
        return sonPositionCategories;
    }

    public void setSonPositionCategories(Set<PositionCategory> sonPositionCategories) {
        this.sonPositionCategories = sonPositionCategories;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
//        System.out.println("setPositions:"+positions);
        this.positions = positions;
    }
    public PositionCategory(){

    }
    @Override
    public String toString() {
        return "PositionCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fatherPositionCategory=" + fatherPositionCategory +
                ", sonPositionCategories=" + sonPositionCategories +
                ", positions=" + positions +
                '}';
    }
    public  void  doLazyLoadingNow(){
        System.out.println("doLazyLoadingNow is running....");
    }
    //
}
