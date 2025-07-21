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
        assertEquals("Oba", contacts.get(0).getFirstName());
        assertEquals("Republic", contacts.get(0).getLastName());
        assertEquals("09069672905", contacts.get(0).getPhoneNumber());
    }

    @Test
    public void testPhoneBookCannotAddInvalidContact(){
        PhoneBook pb = new PhoneBook();
        pb.addContact("Oba", "Republic", "12345egst");
        List<Contact> contacts = pb.getContacts();
        assertEquals(0,  contacts.size());
    }

    @Test
    public void testPhoneBookCanRemoveValidContact(){
        PhoneBook pb = new PhoneBook();
        pb.addContact("Oba", "Republic", "09069672905");
        pb.addContact("Oje", "Republic", "07085892905");
        List<Contact> contacts = pb.getContacts();
        assertEquals(2,  contacts.size());
        pb.removeContact("Oba", "Republic", "09069672905");
        assertEquals(1,  contacts.size());
    }

    @Test
    public void testRemoveNonExistingContact(){
        PhoneBook pb = new PhoneBook();
        pb.addContact("Oba", "Republic", "09069672905");
        List<Contact> contacts = pb.getContacts();
        pb.removeContact("Oje", "Republic", "08069672905");
        assertEquals(1,  contacts.size());
    }

    @Test
    public void testFindContactByPhoneNumber(){
        PhoneBook pb = new PhoneBook();
        pb.addContact("Oba", "Republic", "09069672905");
        pb.addContact("Oje", "Republic", "07085892905");
        List<Contact> contacts = pb.getContacts();
        assertEquals(2,  contacts.size());
        pb.findContactByNumber("09069672905");
        assertEquals("Oba", contacts.get(0).getFirstName());
    }

    @Test
    public void testFindContactByFirstName(){
        PhoneBook pb = new PhoneBook();
        pb.addContact("Oje", "Kelechi", "07085892905");
        List<Contact> contacts = pb.getContacts();
        assertEquals(1,  contacts.size());
        pb.addContact("Oba", "Republic", "09069672905");
        contacts = pb.getContacts();
        assertEquals(2,  contacts.size());
        pb.findContactByFirstName("Oba");
        assertEquals("09069672905", contacts.get(1).getPhoneNumber());
    }

    @Test
    public void testFindContactByLastName(){
        PhoneBook pb = new PhoneBook();
        pb.addContact("Oba", "Republic", "09069672905");
        pb.addContact("Oje", "James", "07085892905");
        List<Contact> contacts = pb.getContacts();
        assertEquals(2,  contacts.size());
        pb.findContactByLastName("Republic");
        assertEquals("09069672905", contacts.get(0).getPhoneNumber());
    }

    @Test
    public void testPhoneBookEditContact(){
        PhoneBook pb = new PhoneBook();
        pb.addContact("Oba", "Republic", "09069672905");
        pb.addContact("Oje", "Republic", "07085892905");
        List<Contact> contacts = pb.getContacts();
        assertEquals(2,  contacts.size());
        pb.editContact("Obswrld", "Republic", "09069672905");
        contacts = pb.getContacts();
        assertEquals("Obswrld", contacts.get(0).getFirstName());
    }
}