// Taken from assignment
// Edited by Ryan Buck
package main.recorders.decorators;

import main.recorders.Recorder;

import java.util.Base64;

public class EncryptFile extends RecorderDecorator {
    public EncryptFile(Recorder recorder) {
        super(recorder);
    }

    @Override
    public void writeData(String data) {
        recorder.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(recorder.readData());
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}
