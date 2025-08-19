package u1ab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigEmoticonTest {

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
        "       *       *\n" + 
        "       *       *\n" + 
        "       *       *\n" + 
        "       *       *\n" + 
        "*                     *\n" + 
        "*                     *\n" + 
        " *                   *\n" + 
        "  **               **\n" + 
        "    ***         ***\n" + 
        "       *********\n";

        assertEquals(expected, outputStreamCaptor.toString());
    }
}