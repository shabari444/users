package com.rest.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.users.VO.Authorities;

public interface AuthorityRepository extends JpaRepository<Authorities,Long>{

}
