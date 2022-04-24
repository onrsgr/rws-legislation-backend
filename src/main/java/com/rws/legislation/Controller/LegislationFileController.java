package com.rws.legislation.Controller;

import com.rws.legislation.Model.LegislationFile;
import com.rws.legislation.Model.LegislationSearchRequest;
import com.rws.legislation.Model.LegislationSearchResponse;
import com.rws.legislation.Service.LegislationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
    public List<LegislationSearchResponse> searchFileFromDatabase(LegislationSearchRequest legislationSearchRequest) {
        return legislationService.searchFilesFromDB(legislationSearchRequest);
    }

    @PostMapping(value = "/addnewfile")
    @ResponseBody public ResponseEntity<LegislationFile> addNewFile(@RequestBody LegislationFile legislationFile) {
        return legislationService.addNewFiletoDB(legislationFile);
    }

    @PostMapping(value = "/updatefile")
    public ResponseEntity<LegislationFile> updateFile(@RequestBody LegislationFile legislationFile) {
        return legislationService.updateFileInDB(legislationFile);
    }

    @DeleteMapping(value = "/deletefile")
    public ResponseEntity<LegislationFile> deleteFile(@RequestBody LegislationFile legislationFile) {
        return legislationService.deleteFileFromDB(legislationFile);
    }

}
