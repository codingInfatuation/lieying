package org.lieying.dao;

import org.lieying.bean.Credential;

import java.util.List;

public interface CredentialMapper {

    public List<Credential> selectCredentialsByResumeId(int resumeId);
}
