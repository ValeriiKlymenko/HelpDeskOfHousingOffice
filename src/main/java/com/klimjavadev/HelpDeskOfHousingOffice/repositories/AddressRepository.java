package com.klimjavadev.HelpDeskOfHousingOffice.repositories;

import com.klimjavadev.HelpDeskOfHousingOffice.models.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

    Address findByCountryAndCityAndOblastAndRegionAndStreetAndHouse(
            String country, String city, String oblast, String region, String street, int house);

    //повна адреса User
//    Address (long userId);
}
