package com.rws.legislation.Model;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Objects;

@Component
public class LegislationSearchRequest {

    long fileSearchNumber;
    String fileSearchContent;
    String fileSearchTag;
    Date fileSearchStartDate;
    Date fileSearchEndDate;

    public LegislationSearchRequest() {
    }

    public LegislationSearchRequest(long fileSearchNumber, String fileSearchContent, String fileSearchTag, Date fileSearchStartDate, Date fileSearchEndDate) {
        this.fileSearchNumber = fileSearchNumber;
        this.fileSearchContent = fileSearchContent;
        this.fileSearchTag = fileSearchTag;
        this.fileSearchStartDate = fileSearchStartDate;
        this.fileSearchEndDate = fileSearchEndDate;
    }

    public long getFileSearchNumber() {
        return fileSearchNumber;
    }

    public String getFileSearchContent() {
        return fileSearchContent;
    }

    public String getFileSearchTag() {
        return fileSearchTag;
    }

    public Date getFileSearchStartDate() {
        return fileSearchStartDate;
    }

    public Date getFileSearchEndDate() {
        return fileSearchEndDate;
    }

    @Override
    public String toString() {
        return "LegislationSearchRequest{" +
                "fileSearchNumber=" + fileSearchNumber +
                ", fileSearchContent='" + fileSearchContent + '\'' +
                ", fileSearchTag='" + fileSearchTag + '\'' +
                ", fileSearchStartDate=" + fileSearchStartDate +
                ", fileSearchEndDate=" + fileSearchEndDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LegislationSearchRequest that = (LegislationSearchRequest) o;
        return fileSearchNumber == that.fileSearchNumber && Objects.equals(fileSearchContent, that.fileSearchContent) && Objects.equals(fileSearchTag, that.fileSearchTag) && Objects.equals(fileSearchStartDate, that.fileSearchStartDate) && Objects.equals(fileSearchEndDate, that.fileSearchEndDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileSearchNumber, fileSearchContent, fileSearchTag, fileSearchStartDate, fileSearchEndDate);
    }
}
