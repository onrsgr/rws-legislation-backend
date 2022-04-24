package com.rws.legislation.Controller;

import com.rws.legislation.Model.LegislationFile;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LegislationFileController {

    @GetMapping(value = "/search")
    public String searchFileFromDatabase(){
        return "test";
    }

    @PostMapping(value = "/addnewfile")
    public String addNewFile(LegislationFile legislationFile){
        return "test";
    }

    @PostMapping(value = "/updatefile")
    public String updateFile(LegislationFile legislationFile){
        return "test";
    }

    @DeleteMapping(value = "/deletefile")
    public String deleteFile(LegislationFile legislationFile){
        return "test";
    }

}
