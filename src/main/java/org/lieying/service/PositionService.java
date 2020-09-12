package org.lieying.service;

import com.github.pagehelper.PageInfo;
import org.lieying.bean.Position;


import java.util.List;

public interface PositionService {

    public Position queryPositionById(int id);

    public PageInfo<Position> queryPositionsByCriteria(String keyword,
                                             Integer cityId,
                                             Integer positionCategoryId,
                                             Integer industryId,
                                             String positionEducation,
                                             String positionSalary,
                                             String positionExperience,
                                             Integer financingStageId,
                                             String positionPublishTime,Integer page);

    public Boolean addPosition(Position position,Integer recruiterId);
    public List<Position> selectHotPositionsByCriteria(int cityId,int positionCategoryId);
}
