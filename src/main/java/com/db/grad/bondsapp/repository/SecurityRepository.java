package com.db.grad.bondsapp.repository;

import com.db.grad.bondsapp.model.Security;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityRepository extends JpaRepository<Security, Long>{

}