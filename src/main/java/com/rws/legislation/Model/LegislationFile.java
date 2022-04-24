package com.rws.legislation.Model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "rws_legislation")
public class LegislationFile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "file_id")
    Long fileId;
    @Column(name = "file_number")
    long fileNumber;
    @Column(name = "file_content")
    String fileContent;
    @Column(name = "file_header")
    String fileHeader;
    @Column(name = "file_author")
    String fileAuthor;
    @Column(name = "file_accept_date")
    Date fileAcceptDate;
    @Column(name = "file_date")
    Date fileDate;
    @Column(name = "file_tag")
    String fileTag;
    @Column(name = "file_text")
    String fileText;
    @Column(name = "file_status")
    boolean fileStatus;

    public LegislationFile() {
    }

    public LegislationFile(Long fileId, long fileNumber, String fileContent, String fileHeader, String fileAuthor, Date fileAcceptDate, Date fileDate, String fileTag, String fileText, boolean fileStatus) {
        this.fileId = fileId;
        this.fileNumber = fileNumber;
        this.fileContent = fileContent;
        this.fileHeader = fileHeader;
        this.fileAuthor = fileAuthor;
        this.fileAcceptDate = fileAcceptDate;
        this.fileDate = fileDate;
        this.fileTag = fileTag;
        this.fileText = fileText;
        this.fileStatus = fileStatus;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
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

    public String getFileText() {
        return fileText;
    }

    public void setFileText(String fileText) {
        this.fileText = fileText;
    }

    public boolean isFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(boolean fileStatus) {
        this.fileStatus = fileStatus;
    }

    @Override
    public String toString() {
        return "LegislationFile{" +
                "fileId=" + fileId +
                ", fileNumber=" + fileNumber +
                ", fileContent='" + fileContent + '\'' +
                ", fileHeader='" + fileHeader + '\'' +
                ", fileAuthor='" + fileAuthor + '\'' +
                ", fileAcceptDate=" + fileAcceptDate +
                ", fileDate=" + fileDate +
                ", fileTag='" + fileTag + '\'' +
                ", fileText='" + fileText + '\'' +
                ", fileStatus=" + fileStatus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LegislationFile that = (LegislationFile) o;
        return fileNumber == that.fileNumber && fileStatus == that.fileStatus && Objects.equals(fileId, that.fileId) && Objects.equals(fileContent, that.fileContent) && Objects.equals(fileHeader, that.fileHeader) && Objects.equals(fileAuthor, that.fileAuthor) && Objects.equals(fileAcceptDate, that.fileAcceptDate) && Objects.equals(fileDate, that.fileDate) && Objects.equals(fileTag, that.fileTag) && Objects.equals(fileText, that.fileText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId, fileNumber, fileContent, fileHeader, fileAuthor, fileAcceptDate, fileDate, fileTag, fileText, fileStatus);
    }
}
