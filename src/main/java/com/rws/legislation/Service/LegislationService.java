package com.rws.legislation.Service;

import com.rws.legislation.Model.LegislationFile;
import com.rws.legislation.Repository.LegislationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@Service
@RequestScope
public class LegislationService {

    private LegislationRepository legislationRepository;

    public LegislationService() {
    }

    @Autowired
    public LegislationService(LegislationRepository legislationRepository) {
        this.legislationRepository = legislationRepository;
    }

    public final ResponseEntity<LegislationFile> addNewFiletoDB(LegislationFile legislationFile) {
        legislationRepository.save(legislationFile);
        return ResponseEntity.accepted().body(legislationFile);
    }

    public final ResponseEntity<LegislationFile> updateFileInDB(LegislationFile legislationFile) {
        legislationRepository.updateFileById(legislationFile.getFileId(), legislationFile.getFileNumber(), legislationFile.getFileContent(),
                legislationFile.getFileHeader(), legislationFile.getFileAuthor(), legislationFile.getFileAcceptDate(), legislationFile.getFileDate(),
                legislationFile.getFileTag(), legislationFile.getFileText(), legislationFile.isFileStatus());
        return ResponseEntity.accepted().body(legislationFile);
    }

    public final ResponseEntity<LegislationFile> deleteFileFromDB(LegislationFile legislationFile) {
        legislationRepository.deleteFileById(legislationFile.getFileId());
        return ResponseEntity.accepted().body(legislationFile);
    }

}
