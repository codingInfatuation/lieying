package org.lieying.service.impl;

import org.lieying.bean.Resume;
import org.lieying.dao.ResumeMapper;
import org.lieying.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("resumeService")
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeMapper resumeMapper;

    @Cacheable(value = "cache1")
    @Transactional(readOnly = true)
    @Override
    public List<Resume> queryAllResumesByJobHunterId(int jobHunterId) {
        return resumeMapper.selectAllResumesByJobHunterId(jobHunterId);
    }
    @Cacheable(value = "cache1")
    @Transactional(readOnly = true)
    @Override
    public Resume queryResumeById(int resumeId) {
        return resumeMapper.selectResumeById(resumeId);
    }
}
