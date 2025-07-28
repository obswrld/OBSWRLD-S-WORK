# import List

from PHONEBOOK.src.contact import Contact


class PhoneBook:
    def __init__(self):
        self.contacts = []

    def add_contact(self, contact):
        if not self.is_phone_number_valid(contact.phone_number):
            raise ValueError("Invalid phone number")

        self.contacts.append(contact)
        return self.contacts


    def remove_contact(self, contact: Contact):
        for contact in self.contacts:
            self.contacts.remove(contact)

    def get_contacts(self):
        return self.contacts

    def find_contact_by_first_name(self,  first_name):
        for contact in self.contacts:
            if contact.first_name == first_name:
                return contact
        raise ValueError("Contact not found")

    def find_contact_by_last_name(self, second_name):
        for contact in self.contacts:
            if second_name == contact.last_name:
                return contact
        raise ValueError("Invalid phone number")

    def find_contact_by_phone_number(self, number):
        for contact in self.contacts:
            if number == contact.phone_number:
                return contact
        return None

    def edit_contact(self, first_name: str, new_first_name:str, last_name: str, new_last_name:str, phone_number: str):
        contact = self.find_contact_by_first_name(first_name)
        if contact:
            contact.first_name = new_first_name
            contact.last_name = new_last_name
            contact.phone_number = phone_number
            return contact
        return None

    @staticmethod
    def is_phone_number_valid(phone_number:str):
        global len
        if phone_number.startswith(("080", "081", "090", "091", "070")) and len(phone_number) == 11:
            return True
        elif phone_number.startswith("+243") and len(phone_number) == 13:
            return True
        else:
            return False

phone_book = PhoneBook()
phone_book.add_contact(Contact("Oba", "Joy", "08011111111"))

print(phone_book.get_contacts()[0].first_name)
