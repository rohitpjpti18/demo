package com.houston.userauth.repository;

import com.houston.userauth.entity.UserEntity;
import com.houston.userauth.entity.UserProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface UserProfileRepository extends JpaRepository<UserProfileEntity, Long> {
}
