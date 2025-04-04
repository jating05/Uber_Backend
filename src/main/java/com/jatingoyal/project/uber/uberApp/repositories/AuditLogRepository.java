package com.jatingoyal.project.uber.uberApp.repositories;

import com.jatingoyal.project.uber.uberApp.entities.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
}