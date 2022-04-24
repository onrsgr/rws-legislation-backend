package com.rws.legislation.Service;

import com.rws.legislation.Model.LegislationFile;
import com.rws.legislation.Repository.LegislationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LegislationService {

    private LegislationRepository legislationRepository;

    public LegislationService() {
    }

    @Autowired
    public LegislationService(LegislationRepository legislationRepository) {
        this.legislationRepository = legislationRepository;
    }

    public final void addNewFiletoDB(LegislationFile legislationFile) {
        legislationRepository.save(legislationFile);
    }

    public final void updateFileInDB(LegislationFile legislationFile) {
        legislationRepository.updateFileById(legislationFile.getFileId(), legislationFile.getFileNumber(), legislationFile.getFileContent(),
                legislationFile.getFileHeader(), legislationFile.getFileAuthor(), legislationFile.getFileAcceptDate(), legislationFile.getFileDate(),
                legislationFile.getFileTag(), legislationFile.getFileText(), legislationFile.isFileStatus());

    }

    public final void deleteFileFromDB(LegislationFile legislationFile) {
        legislationRepository.deleteFileById(legislationFile.getFileId());
    }

}
