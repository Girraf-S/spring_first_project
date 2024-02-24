package com.example.spring_first_project.repos;

import com.example.spring_first_project.models.AdvertModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertRepository extends CrudRepository<AdvertModel, Long> {

}
