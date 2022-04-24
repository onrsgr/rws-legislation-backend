package com.rws.legislation.Repository;

import com.rws.legislation.Model.LegislationFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;

import javax.transaction.Transactional;
import java.util.Date;

@Repository
public interface LegislationRepository extends JpaRepository<LegislationFile, Long> {

    @Modifying
    @Transactional
    @Query(value = "delete from rws_legislation where rws_legislation.file_id = ?1", nativeQuery = true)
    void deleteFileById(long fileId);


    @Modifying
    @Transactional
    @Query(value = "update rws_legislation set rws_legislation.file_id = ?1, rws_legislation.file_number = ?2, rws_legislation.file_content = ?3, " +
            "rws_legislation.file_header = ?4, rws_legislation.file_author = ?5, rws_legislation.file_accept_date = ?6, " +
            "rws_legislation.file_date = ?7, rws_legislation.file_tag = ?8, rws_legislation.file_text = ?9, " +
            "rws_legislation.file_status = ?10 where rws_legislation.file_id = ?1", nativeQuery = true)
    void updateFileById(Long fileId, long fileNumber, String fileContent, String fileHeader, String fileAuthor, Date fileAcceptDate, Date fileDate, String fileTag, String fileText, boolean fileStatus);
}
