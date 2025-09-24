// Taken from assignment
package main.recorders;

import java.io.*;

public class FileRecorder implements Recorder {
    private String fileName;

    public FileRecorder(String fileName) {
        this.fileName = fileName;
    }

    public void clearFileContent() {
        try {
            PrintWriter writer = new PrintWriter(fileName);
            writer.print("");
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Appends the given data into a file
    @Override
    public void writeData(String data) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append(data);
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Reads entire content of a file
    @Override
    public String readData() {
        String fileContent = "";
        String currentLine = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            currentLine = reader.readLine();
            while (currentLine != null) {
                fileContent += currentLine;
                currentLine = reader.readLine();
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return fileContent;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

}
