package com.logixal.lobs.masters.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logixal.lobs.masters.model.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, String>{

}
