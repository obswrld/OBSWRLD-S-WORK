import PhoneBookApp.Contact;
import PhoneBookApp.PhoneBook;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    @Test
    public void testPhoneBookAddValidContact(){
        PhoneBook pb = new PhoneBook();
        pb.addContact("Oba", "Republic", "09069672905");
        List<Contact> contacts = pb.getContacts();
        assertEquals(1,  contacts.size());
        assertEquals("Oba", contacts.get(0).getLastName());
        assertEquals("Republic", contacts.get(0).getFirstName());
        assertEquals("09069672905", contacts.get(0).getPhoneNumber());
    }
}