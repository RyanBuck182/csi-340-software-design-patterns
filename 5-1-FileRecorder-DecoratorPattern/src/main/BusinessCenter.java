// Taken from assignment
package main;

import main.recorders.Recorder;

public class BusinessCenter {

    public void perform(Recorder dataSource, String content) {
        // Write data to file
        dataSource.writeData(content);
    }
}
