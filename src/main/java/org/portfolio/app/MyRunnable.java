package org.portfolio.app;

public class MyRunnable implements Runnable{

    private Files files;

    public MyRunnable(Files files){
        this.files = files;
    }


    @Override
    public void run() {
        for (int starting = 0; starting <= files.getFileSize(); starting++){
            System.out.println("'"+ files.getFileName() + "' is being downloaded! process: " + starting + " GB.");
        }
    }
}
