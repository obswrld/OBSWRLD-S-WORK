import PhoneBookApp.Contact;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactTest {

    @Test
    public void testContactIsCreated(){
        Contact contact = new Contact("Oba", "Republic", "09069672905");
        assertEquals("Oba", contact.getFirstName());
        assertEquals("Republic", contact.getLastName());
        assertEquals("09069672905", contact.getPhoneNumber());
    }

    @Test
    public void testContactFirstName(){
        Contact contact = new Contact("Oba", "Republic", "09069672905");
        contact.setFirstName("Jake");
        assertEquals("Jake", contact.getFirstName());
    }

    @Test
    public void testContactLastName(){
        Contact contact = new Contact("Oba", "Republic", "09069672905");
        contact.setLastName("Jake");
        assertEquals("Jake", contact.getLastName());
    }

}
