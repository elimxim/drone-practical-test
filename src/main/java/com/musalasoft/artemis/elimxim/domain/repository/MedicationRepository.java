package com.musalasoft.artemis.elimxim.domain.repository;

import com.musalasoft.artemis.elimxim.domain.model.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicationRepository extends JpaRepository<Medication, Long> {
    @Query("SELECT count(m) = 0 from Medication m where m.code = :code")
    Boolean checkCode(@Param("code") String code);
}
