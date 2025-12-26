package com.tp.serviceclient.repositories;

import com.tp.serviceclient.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
