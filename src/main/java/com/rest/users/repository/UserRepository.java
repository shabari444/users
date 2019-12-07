package com.rest.users.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rest.users.VO.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}