from _ast import List

import Contact


class PhoneBook:
    def __init__(self):
        self.contacts: List[Contact] = []

    def add_contact(self, contact: Contact):
        for contact in self.contacts:
            if self.is_phone_number_valid(contact):
                self.contacts.append(contact)
            else:
                print("Contact is not valid")

    def remove_contact(self, contact: Contact):
        for contact in self.contacts:
            if self.is_phone_number_valid(contact):
                self.contacts.remove(contact)
            else:
                print("Contact is not valid")


    def get_contacts(self):
        return self.contacts

    def find_contact_by_first_name(self, first_name: str):
        for contact in self.contacts:
            if first_name == contact.first_name:
                return contact
        return None

    def find_contact_by_last_name(self, last_name: str):
        for contact in self.contacts:
            if last_name == contact.last_name:
                return contact
        return None

    def find_contact_by_phone_number(self, phone_number: str):
        for contact in self.contacts:
            if phone_number == contact.phone_number:
                return contact
        return None

    def edit_contact(self, first_name: str, new_first_name:str, last_name: str, new_last_name:str,  new_phone_number: str, phone_number: str):
        for contact in self.contacts:
            if new_first_name == contact.first_name:
                contact.first_name = new_first_name
            if new_last_name == contact.last_name:
                contact.last_name = new_last_name
            if new_phone_number == contact.phone_number:
                contact.phone_number = new_phone_number
            updated_contact = contact
            return updated_contact
        return None

    @staticmethod
    def is_phone_number_valid(phone_number:str):
        global len
        if phone_number.startswith(("080", "081", "090", "091", "070")):
            return True
        elif phone_number.startswith("+243") and len(phone_number) == 13:
            return True
        elif 11== len(phone_number):
            return True
        else:
            return False

