package org.lieying.service;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.lieying.bean.Resume;

import java.util.List;

public interface ResumeService {
    public List<Resume> queryAllResumesByJobHunterId(int jobHunterId);
    public Resume queryResumeById(int resumeId);
}
