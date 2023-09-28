package com.klimjavadev.HelpDeskOfHousingOffice.services;

import com.klimjavadev.HelpDeskOfHousingOffice.models.entities.Role;

import java.util.List;

public interface RoleService {

    Role create(Role role);
    Role readById(long id);
    Role update(Role role);
    void delete(long id);
    List<Role> getAll();
}
