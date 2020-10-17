package org.lieying.dao;

import org.apache.ibatis.annotations.Param;
import org.lieying.bean.Resume;

import java.util.List;

public interface ResumeMapper {


    public List<Resume> selectAllResumesByJobHunterId(int jobHunterId);
    public Resume selectResumeById(int resumeId);
}
