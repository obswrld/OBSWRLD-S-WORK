package PhoneBookApp;

import java.util.ArrayList;

public class PhoneBook {
    private static ArrayList<PhoneBook[]> contacts = new ArrayList<>();

    public static void addContact(PhoneBook name, PhoneBook lastName, PhoneBook phoneNumber){
        contacts.add(new PhoneBook[]{name, lastName, phoneNumber});
        System.out.println("Contact " + name + " " + lastName + " " + phoneNumber);
    }

    public static void removeContact(PhoneBook phoneNumber){
        boolean found = false;
        for (int i = 0; i < contacts.size(); i++){
            if (contacts.get(i)[0] == phoneNumber){
                contacts.remove(i);
                System.out.println("Contact " + phoneNumber + " " + contacts.get(i)[1] + "removed");
                found = true;

                break;
            }
        }
        if (!found){
            System.out.println("Contact " + phoneNumber + " not found");
        }
    }

    public static void findContactByPhoneNumber(PhoneBook phoneNumber){
        for(PhoneBook[] contact : contacts){
            if(contact[2] == phoneNumber){
                System.out.println("Contact found " + contact[0] + " " + contact[1] + " " + "phoneNumber: " + contact[2]);
                return;
            }
        }
    }

    public static void findContactByFirstName(PhoneBook name){
        boolean found = false;
        for(PhoneBook[] contact : contacts){
            if(contact[0] == name){
                System.out.println("Contact found " + contact[1] + " " + contact[2] + " " + "firstName: " + contact[0]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Contact " + name + " not found");
        }
    }

    public static void findContactByLastName(PhoneBook lastName){
        boolean found = false;
        for(PhoneBook[] contact : contacts){
            if(contact[1] == lastName){
                System.out.println("Contact found " + contact[0] + " " + contact[2] + " " + "lastName: " + contact[1]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Contact " + lastName + " not found");
        }
    }


}
