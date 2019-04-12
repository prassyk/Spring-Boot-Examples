package com.logixal.lobs.tpp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logixal.lobs.tpp.model.TPPUserService;
import com.logixal.lobs.tpp.model.TPPUserServiceId;

@Repository
public interface TPPUserServiceRepository extends JpaRepository<TPPUserService, TPPUserServiceId>{

}
