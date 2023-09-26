package com.klimjavadev.HelpDeskOfHousingOffice.repositories;

import com.klimjavadev.HelpDeskOfHousingOffice.models.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
