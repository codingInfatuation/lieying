package org.lieying.service.impl;
import org.lieying.bean.JobHunter;
import org.lieying.dao.JobHunterMapper;
import org.lieying.service.JobHunterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("jobHunterService")
public class JobHunterServiceImpl  implements JobHunterService {
    @Autowired
    private JobHunterMapper jobHunterDao;

    @Cacheable(value = "cache1")
    @Transactional(readOnly = true)
    @Override
    public List<JobHunter> queryAllJobHunter() {
       return (List<JobHunter>) jobHunterDao.findAll();
        //return jobHunterDao.selectAllJobHunter();
    }



}
