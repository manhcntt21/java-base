package d;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * @author manhdt14
 * created in 9/29/2022 8:13 AM
 */
public class StringProcessor {
    private final StringReader stringReader;
    private final StringWriter stringWriter;

    public StringProcessor(StringReader stringReader, StringWriter stringWriter) {
        this.stringReader = stringReader;
        this.stringWriter = stringWriter;
    }

    public void printString() throws IOException {
        stringWriter.write(stringReader.read());
    }
}
