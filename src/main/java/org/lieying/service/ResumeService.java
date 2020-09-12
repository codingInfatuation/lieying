package org.lieying.service;

import org.lieying.bean.Resume;

import java.util.List;

public interface ResumeService {
    public List<Resume> queryAllResumesByJobHunterId(int jobHunterId);
    public Resume queryResumeById(int resumeId);
}
