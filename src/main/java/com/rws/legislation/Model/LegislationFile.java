package com.rws.legislation.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class LegislationFile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long fileId;
    String fileContent;
    String fileAuthor;
    String fileDate;
    String fileTag;
    String fileText;
    boolean fileStatus;

    public LegislationFile() {
    }

    public LegislationFile(Long fileId, String fileContent, String fileAuthor, String fileDate, String fileTag, String fileText, boolean fileStatus) {
        this.fileId = fileId;
        this.fileContent = fileContent;
        this.fileAuthor = fileAuthor;
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

    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    public String getFileAuthor() {
        return fileAuthor;
    }

    public void setFileAuthor(String fileAuthor) {
        this.fileAuthor = fileAuthor;
    }

    public String getFileDate() {
        return fileDate;
    }

    public void setFileDate(String fileDate) {
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
                ", fileContent='" + fileContent + '\'' +
                ", fileAuthor='" + fileAuthor + '\'' +
                ", fileDate='" + fileDate + '\'' +
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
        return fileStatus == that.fileStatus && Objects.equals(fileId, that.fileId) && Objects.equals(fileContent, that.fileContent) && Objects.equals(fileAuthor, that.fileAuthor) && Objects.equals(fileDate, that.fileDate) && Objects.equals(fileTag, that.fileTag) && Objects.equals(fileText, that.fileText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId, fileContent, fileAuthor, fileDate, fileTag, fileText, fileStatus);
    }
}
