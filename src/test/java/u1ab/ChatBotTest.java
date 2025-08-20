package u1ab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class ChatBotTest {
        @Test
        void testMain_mrHsieh() {
            String simulatedInput = "Mr. Hsieh\n"; 
            InputStream originalSystemIn = System.in; 
            PrintStream originalSystemOut = System.out; 

            ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

            try {
                System.setIn(inputStream);
                System.setOut(new PrintStream(outputStream));

                ChatBot.main(new String[]{}); 

                assertEquals("Hi! What is your name?\nHello, Mr. Hsieh. I am a chatbot, but I don't have anything to say... Bye!\n", outputStream.toString());

            } finally {
                // Restore original System.out and System.in
                System.setOut(originalSystemOut); 
                System.setIn(originalSystemIn);
            }
        }

        @Test
        void testMain_AliceBob() {
            String simulatedInput = "AliceBob\n"; 
            InputStream originalSystemIn = System.in; 
            PrintStream originalSystemOut = System.out; 

            ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

            try {
                System.setIn(inputStream);
                System.setOut(new PrintStream(outputStream));

                ChatBot.main(new String[]{}); 

                assertEquals("Hi! What is your name?\nHello, AliceBob. I am a chatbot, but I don't have anything to say... Bye!\n", outputStream.toString());

            } finally {
                // Restore original System.out and System.in
                System.setOut(originalSystemOut); 
                System.setIn(originalSystemIn);
            }
        }
}
