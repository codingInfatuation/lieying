package org.lieying.dao;

import org.lieying.bean.EducationExperience;

import java.util.List;

public interface EducationExperienceMapper {

    public List<EducationExperience> selectEducationExperiencesByResumeId(int resumeId);
}
