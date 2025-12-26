package com.tp.servicecar.repositories;

import com.tp.servicecar.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByClientId(Long clientId);
}
