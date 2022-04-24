package com.rws.legislation.Repository;

import com.rws.legislation.Model.LegislationFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LegislationRepository extends JpaRepository<Long, LegislationFile> {
}
