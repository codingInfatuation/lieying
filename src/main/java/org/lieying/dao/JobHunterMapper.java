package org.lieying.dao;

import cn.pomit.jpamapper.core.mapper.CrudMapper;
import org.apache.ibatis.annotations.Mapper;
import org.lieying.bean.JobHunter;

import java.util.List;
//@Mapper
public interface JobHunterMapper extends CrudMapper<JobHunter,Integer> {

    //@Select("select * from job_hunter")
    public List<JobHunter> selectAllJobHunter();
}
