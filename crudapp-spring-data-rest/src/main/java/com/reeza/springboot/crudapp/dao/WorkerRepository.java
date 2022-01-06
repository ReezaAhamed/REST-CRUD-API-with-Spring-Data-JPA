package com.reeza.springboot.crudapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.reeza.springboot.crudapp.entity.Worker;

// Automatically Spring rest creates the endpoint based on entity type, in our case (Worker) => So, 'wokers'
// If you want to change, @RepositoryRestResource(path="members")
//@RepositoryRestResource(path="members")
public interface WorkerRepository extends JpaRepository<Worker, Integer> { //Just specify the entity and primary key types => Worker & (int) Integer
	
	//that's all, no need to write any code for implementation. We get the crud methods for free :)
}
