package com.rws.legislation.Repository;

import com.rws.legislation.Model.LegislationFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LegilationRepository extends JpaRepository<Long, LegislationFile> {
}
