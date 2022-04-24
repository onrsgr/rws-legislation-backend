package com.rws.legislation.Model;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Objects;

@Component
public class LegislationSearchResponse {


    long fileNumber;
    String fileContent;
    String fileHeader;
    String fileAuthor;
    Date fileAcceptDate;
    Date fileDate;
    String fileTag;

    public LegislationSearchResponse() {
    }

    public LegislationSearchResponse(long fileNumber, String fileContent, String fileHeader, String fileAuthor, Date fileAcceptDate, Date fileDate, String fileTag) {
        this.fileNumber = fileNumber;
        this.fileContent = fileContent;
        this.fileHeader = fileHeader;
        this.fileAuthor = fileAuthor;
        this.fileAcceptDate = fileAcceptDate;
        this.fileDate = fileDate;
        this.fileTag = fileTag;
    }

    public long getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(long fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    public String getFileHeader() {
        return fileHeader;
    }

    public void setFileHeader(String fileHeader) {
        this.fileHeader = fileHeader;
    }

    public String getFileAuthor() {
        return fileAuthor;
    }

    public void setFileAuthor(String fileAuthor) {
        this.fileAuthor = fileAuthor;
    }

    public Date getFileAcceptDate() {
        return fileAcceptDate;
    }

    public void setFileAcceptDate(Date fileAcceptDate) {
        this.fileAcceptDate = fileAcceptDate;
    }

    public Date getFileDate() {
        return fileDate;
    }

    public void setFileDate(Date fileDate) {
        this.fileDate = fileDate;
    }

    public String getFileTag() {
        return fileTag;
    }

    public void setFileTag(String fileTag) {
        this.fileTag = fileTag;
    }

    @Override
    public String toString() {
        return "LegislationSearchResult{" +
                "fileNumber=" + fileNumber +
                ", fileContent='" + fileContent + '\'' +
                ", fileHeader='" + fileHeader + '\'' +
                ", fileAuthor='" + fileAuthor + '\'' +
                ", fileAcceptDate=" + fileAcceptDate +
                ", fileDate=" + fileDate +
                ", fileTag='" + fileTag + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LegislationSearchResponse that = (LegislationSearchResponse) o;
        return fileNumber == that.fileNumber && Objects.equals(fileContent, that.fileContent) && Objects.equals(fileHeader, that.fileHeader) && Objects.equals(fileAuthor, that.fileAuthor) && Objects.equals(fileAcceptDate, that.fileAcceptDate) && Objects.equals(fileDate, that.fileDate) && Objects.equals(fileTag, that.fileTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileNumber, fileContent, fileHeader, fileAuthor, fileAcceptDate, fileDate, fileTag);
    }
}
