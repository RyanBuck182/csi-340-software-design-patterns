// Written by Ryan Buck
package main.recorders.decorators;

import main.recorders.Recorder;

public abstract class RecorderDecorator implements Recorder {
    protected Recorder recorder;

    public RecorderDecorator(Recorder recorder) {
        this.recorder = recorder;
    }

    public abstract void writeData(String data);
    public abstract String readData();
}
