package org.lieying.service;

import org.lieying.bean.Administrator;

public interface AdministratorService {
    public Administrator queryAdministratorByUsernameAndPassword(String username, String password);
}
