package PhoneBookApp;
import java.util.ArrayList;
import java.util.List;


public class PhoneBook{
    private List<Contact> contacts;

    public PhoneBook(){
        this.contacts = new ArrayList<Contact>();
    }
    public void addContact(String firstName, String lastName, String phoneNumber){
        if (isValidPhoneNumber(phoneNumber)) {
            this.contacts.add(new Contact(firstName, lastName, phoneNumber));
        } else {
            System.out.println("Invalid phone number");
        }
    }
    public void removeContact(String firstName, String lastName, String phoneNumber){
        for(Contact contact : this.contacts){
            if(contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)
                    && (contact.getPhoneNumber().equals(phoneNumber))){
                this.contacts.remove(contact);
            }
        }
    }
    public List<Contact> getContacts(){
        return this.contacts;
    }
    public Contact findContactByFirstName(String firstName){
        for (Contact contact : this.contacts){
            if (contact.getFirstName().equals(firstName)){
                return contact;
            }
        }
        return null;
    }
    public Contact findContactByLastName(String lastName){
        for (Contact contact : this.contacts){
            if (contact.getLastName().equals(lastName)){
                return contact;
            }
        }
        return null;
    }
    public Contact findContactByNumber(String number){
        for (Contact contact : this.contacts){
            if (contact.getPhoneNumber().equals(number)){
                return contact;
            }
        }
        return null;
    }
    public String editContact(String newFirstName, String newLastName, String number){
        for (Contact contacts : this.contacts){
            if (contacts.getPhoneNumber().equals(number)){
                    contacts.setFirstName(newFirstName);
                    contacts.setLastName(newLastName);
            }
        }
        return null;
    }
    public boolean isValidPhoneNumber(String phoneNumber){
        return (phoneNumber.startsWith("080") ||
                phoneNumber.startsWith("081") ||
                phoneNumber.startsWith("090") ||
                phoneNumber.startsWith("091") ||
                phoneNumber.startsWith("070") ||
                phoneNumber.startsWith("+234") && phoneNumber.length() == 13) &&
                phoneNumber.length() == 11;
    }
}
