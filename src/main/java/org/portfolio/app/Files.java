package org.portfolio.app;

public class Files {

    private String fileName;
    private int fileSize;


    public Files (String fileName, int fileSize){
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    // getters and setters
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }
}
