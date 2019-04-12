package com.logixal.lobs.masters.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logixal.lobs.masters.model.LobsMessages;

@Repository
public interface LobsMessageRepository extends JpaRepository<LobsMessages, String>{

}
