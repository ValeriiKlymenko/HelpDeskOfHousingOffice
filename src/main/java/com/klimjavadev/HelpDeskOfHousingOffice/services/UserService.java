package com.klimjavadev.HelpDeskOfHousingOffice.services;

import com.klimjavadev.HelpDeskOfHousingOffice.models.entities.User;

import java.util.List;

public interface UserService {

    User create(User user);
    User readById(long id);
    User update(User user);
    void delete(long id);
    List<User> getAll();
}
