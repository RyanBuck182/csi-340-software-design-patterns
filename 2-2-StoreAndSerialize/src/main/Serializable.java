package main;

import java.io.IOException;
import java.io.OutputStreamWriter;

public interface Serializable {
    void serializeToXML(OutputStreamWriter writer) throws IOException;
    void serializeToJSON(OutputStreamWriter writer) throws IOException;
}
