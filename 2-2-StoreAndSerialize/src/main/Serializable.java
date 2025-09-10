package main;

import java.io.IOException;
import java.io.Writer;

public interface Serializable {
    void serializeToXML(Writer writer) throws IOException;
    void serializeToJSON(Writer writer) throws IOException;
}
