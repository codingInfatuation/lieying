package org.lieying.dao;

import cn.pomit.jpamapper.core.mapper.CrudMapper;
import org.apache.ibatis.annotations.Param;
import org.lieying.bean.Position;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface PositionMapper{
    public Position selectPositionById(int id);
    public List<Position> selectPositionsByCriteria(@Param("keyword") String keyword,
                                                    @Param("city_id")Integer cityId,
                                                    @Param("position_category_id")Integer positionCategoryId,
                                                    @Param("industry_id") Integer industryId,
                                                    @Param("position_education")String positionEducation,
                                                    @Param("position_salary")String positionSalary,
                                                    @Param("position_experience") String positionExperience,
                                                    @Param("financing_stage_id") Integer financingStageId,
                                                    @Param("position_publish_time") String positionPublishTime);
    public int insertPosition(@Param("position") Position position,@Param("recruiterId") int recruiterId);

    public List<Position> selectHotPositionsByCriteria(@Param("city_id")int cityId,@Param("position_category_id")int positionCategoryId);
}
