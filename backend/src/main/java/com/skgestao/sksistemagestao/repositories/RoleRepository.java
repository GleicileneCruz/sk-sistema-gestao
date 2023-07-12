package com.skgestao.sksistemagestao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skgestao.sksistemagestao.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}