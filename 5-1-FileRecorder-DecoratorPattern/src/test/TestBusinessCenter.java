// Taken from assignment
// Edited by Ryan Buck
package test;

import main.BusinessCenter;
import main.recorders.FileRecorder;
import main.recorders.Recorder;
import main.recorders.decorators.CompressFile;
import main.recorders.decorators.EncryptFile;

public class TestBusinessCenter {

    public static void testDataRecorder() {

        String fileName = ".\\RecordingFile.txt";
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000\t";

        FileRecorder fileRecorder = new FileRecorder(fileName);
        fileRecorder.clearFileContent();

        BusinessCenter businessCenter = new BusinessCenter();
        businessCenter.perform(fileRecorder, salaryRecords);
        
        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Recorded --------------");
        System.out.println(fileRecorder.readData());
        
        System.out.println("*********************");

    }

    public static void testDataRecorderWithEncryption() {

        String fileName = ".\\RecordingFileEncrypt.txt";
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        FileRecorder fileRecorder = new FileRecorder(fileName);
        fileRecorder.clearFileContent();
        Recorder encryptRecorder = new EncryptFile(fileRecorder);

        BusinessCenter businessCenter = new BusinessCenter();
        businessCenter.perform(encryptRecorder, salaryRecords);

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(fileRecorder.readData()); // Print encoded content
        System.out.println("- Decoded --------------");
        System.out.println(encryptRecorder.readData()); // Print decoded content

        System.out.println("*********************");
    }

    public static void testDataRecorderWithEncryptionAndCompression() {

        String fileName = ".\\RecordingFileEncryptCompress.txt";
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        FileRecorder fileRecorder = new FileRecorder(fileName);
        fileRecorder.clearFileContent();
        Recorder encryptRecorder = new EncryptFile(fileRecorder);
        Recorder encryptCompressRecorder = new CompressFile(encryptRecorder);

        BusinessCenter businessCenter = new BusinessCenter();
        businessCenter.perform(encryptCompressRecorder, salaryRecords);

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded with Compression --------------");
        System.out.println(fileRecorder.readData()); // Print encoded content
        System.out.println("- Decoded --------------");
        System.out.println(encryptCompressRecorder.readData()); // Print decoded content

        System.out.println("*********************");
    }

    public static void main(String[] args) {
        testDataRecorder(); // Done for you 
        testDataRecorderWithEncryption();
        testDataRecorderWithEncryptionAndCompression();
    }
}
