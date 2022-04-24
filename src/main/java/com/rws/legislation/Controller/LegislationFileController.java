package com.rws.legislation.Controller;

import com.rws.legislation.Model.LegislationFile;
import com.rws.legislation.Model.LegislationSearchRequest;
import com.rws.legislation.Model.LegislationSearchResult;
import com.rws.legislation.Service.LegislationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LegislationFileController {

    private LegislationService legislationService;

    public LegislationFileController() {
    }

    @Autowired
    public LegislationFileController(LegislationService legislationService) {
        this.legislationService = legislationService;
    }

    @GetMapping(value = "/searchfromsystem")
    public List<LegislationSearchResult> searchFileFromDatabase(LegislationSearchRequest legislationSearchRequest){

        return null;
    }

    @PostMapping(value = "/addnewfile")
    public String addNewFile(LegislationFile legislationFile){
        legislationService.addNewFiletoDB(legislationFile);
        return "test";
    }

    @PostMapping(value = "/updatefile")
    public String updateFile(LegislationFile legislationFile){
        legislationService.updateFileInDB(legislationFile);
        return "test";
    }

    @DeleteMapping(value = "/deletefile")
    public String deleteFile(LegislationFile legislationFile){
        legislationService.deleteFileFromDB(legislationFile);
        return "test";
    }

}
