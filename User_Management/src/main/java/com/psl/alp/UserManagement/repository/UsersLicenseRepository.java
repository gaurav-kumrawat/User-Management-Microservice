package com.psl.alp.UserManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psl.alp.UserManagement.Entity.User;
import com.psl.alp.UserManagement.Entity.UsersLicense;

@Repository
public interface UsersLicenseRepository extends JpaRepository<UsersLicense,String> {

}
