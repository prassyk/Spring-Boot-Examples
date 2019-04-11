package com.logixal.lobs.tpp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logixal.lobs.tpp.model.TPPUser;

@Repository
public interface TPPUserRepository extends JpaRepository<TPPUser, String>{

}
