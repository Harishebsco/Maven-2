import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AppTest {
   @Test
   void testMessage() {
       String message = "Hello World!";
       assertEquals("Hello World!", message);
   }
}
