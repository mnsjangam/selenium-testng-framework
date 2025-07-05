package org.seleniumJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class FileOperations {

    public static void main (String[] args) throws IOException {
        FileOperations f = new FileOperations();
//         f.createFile();
//        f.writeToFile();
//        f.renameFile();
//        f.setReadOnly();
        File file = new File("C:\\Users\\mnsja\\OneDrive\\Desktop");
        f.displayFiles(file.listFiles());
    }

    public void createFile(){
        String fileName, filePath;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the file name to create:");

        try {
            fileName = bufferedReader.readLine();
            System.out.println("Enter the file path to create the file:");
            filePath = bufferedReader.readLine();
            String fullPath = filePath +"\\"+ fileName;
            File file = new File(fullPath+".txt");
            if (file.createNewFile()){
                System.out.println("File created successfully at: " + fullPath);
            } else {
                System.out.println("File creation failed.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Java Program to Write into a File
    public void writeToFile() throws IOException {
        String welcome = "Hi Mansi you are getting the Full time Job with Capgemini";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the file path where you want to write the content:");
        String filePath = bufferedReader.readLine();
        Path path = Path.of(filePath);
        Files.writeString(path, welcome);
        System.out.println("File written successfully at: " + filePath);
    }

    //Java Program to Rename a File
    public void renameFile() throws IOException {
        File file1 = new File("C:\\Users\\mnsja\\OneDrive\\Desktop\\oldFile.txt");
        File file2 = new File("C:\\Users\\mnsja\\OneDrive\\Desktop\\newFile.txt");

        Path path = Path.of(file1.getPath());
        String content = "\"Hi Mansi you are getting the Full time Job with Capgemini\"";

        Files.writeString(path, content);

        if (file1.renameTo(file2)){
            System.out.println("File renamed successfully to: " + file2.getName());
        } else {
            System.out.println("File renaming failed.");
        }
    }

    // Java Program to Make a File Read-Only
    public void setReadOnly() {
        boolean flag;
        File file = new File("C:\\Users\\mnsja\\OneDrive\\Desktop\\newFile.txt");
        flag = file.setReadOnly();
        if (flag){
            System.out.println("File is set to read-only successfully.");
        } else {
            System.out.println("Failed to set file to read-only.");
        }
    }

    // Java Program to Traverse in a Directory
    public void displayFiles(File[] files) {
        for (File fileName : files){
            if (fileName.isDirectory()){
                long len = fileName.length();
                System.out.println("Directory Name: " + fileName.getName() + " | Size: " + len + " bytes");
                System.out.println("Files in this directory :"+ Arrays.toString(fileName.listFiles()));
            } else {
                System.out.println("File Name: " + fileName.getName());
            }
        }
    }
}
