package com.houston.userauth.repository;

import com.houston.userauth.entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ContactRepository extends JpaRepository<ContactEntity, Long> {
}
