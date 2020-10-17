package org.lieying.dao;
import cn.pomit.jpamapper.core.mapper.CrudMapper;
import org.apache.ibatis.annotations.Param;
import org.lieying.bean.JobHunter;
import java.util.List;
//@Mapper
public interface JobHunterMapper extends CrudMapper<JobHunter,Integer> {

    //@Select("select * from job_hunter")
     List<JobHunter> selectAllJobHunter();

     JobHunter selectDetailJobHunterById(int jobHunterId);

     JobHunter selectJobHunterByUsernameAndPassword(
            @Param("job_hunter_username") String username, @Param("job_hunter_password") String password);
}
