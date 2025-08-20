package u1ab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void testMainMethodOutput() {
        
        BigEmoticon.main(new String[]{}); 

        String expected = 
        "converting 23.0C to F: 73.4\n" + 
        "converting 0.0C to F: 32.0\n" + 
        "converting 68.0F to C: 20.0\n" + 
        "converting 50.0F to C: 10.0\n" +
        "converting -40.0F to C: -40.0\n";

        assertEquals(expected, outputStreamCaptor.toString());
    }
}