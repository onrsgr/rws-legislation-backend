package com.rws.legislation.Controller;

import com.rws.legislation.Model.LegislationFile;
import com.rws.legislation.Model.LegislationSearchRequest;
import com.rws.legislation.Model.LegislationSearchResult;
import com.rws.legislation.Service.LegislationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@RestController
@RequestScope
public class LegislationFileController {

    private LegislationService legislationService;

    public LegislationFileController() {
    }

    @Autowired
    public LegislationFileController(LegislationService legislationService) {
        this.legislationService = legislationService;
    }

    @GetMapping(value = "/searchfile")
    public List<LegislationSearchResult> searchFileFromDatabase(LegislationSearchRequest legislationSearchRequest) {

        return null;
    }

    @PostMapping(value = "/addnewfile")
    public ResponseEntity<LegislationFile> addNewFile(LegislationFile legislationFile) {
        return legislationService.addNewFiletoDB(legislationFile);
    }

    @PostMapping(value = "/updatefile")
    public ResponseEntity<LegislationFile> updateFile(LegislationFile legislationFile) {
        return legislationService.updateFileInDB(legislationFile);
    }

    @DeleteMapping(value = "/deletefile")
    public ResponseEntity<LegislationFile> deleteFile(LegislationFile legislationFile) {
        return legislationService.deleteFileFromDB(legislationFile);
    }

}
