package com.klimjavadev.HelpDeskOfHousingOffice.repositories;

import com.klimjavadev.HelpDeskOfHousingOffice.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
    @Query("from User where room.id = :roomId")
    List<User> getByRoomId(long roomId);

    //список людей що живуть у будівлі
//    List<User> (long buildingId);
}
