from contact import Contact
from phone_book import PhoneBook


def main():
    phone_book = PhoneBook()

    while True:
        print('================')
        print('\n Phone Book Menu:')
        print('================')
        print('\n1. Add Contact: ')
        print('\n2. Delete Contact: ')
        print('\n3. Edit Contact: ')
        print('\n4. Find Contact By First Name: ')
        print('\n5. Find Contact By Last Name: ')
        print('\n6. Find Contact By Phone Number: ')
        print('\n7. Display Contacts: ')
        print('\n8. Exit. . . . . . . . . . . ')


        choice = input('\nEnter your choice: ')

        if choice == '1':
            first_name = input('\nEnter First Name: ')
            last_name = input('\nEnter Last Name: ')
            while True:
                phone_number = input('\nEnter Phone Number: ')
                try:
                    phone_book.add_contact(Contact(first_name, last_name, phone_number))
                    print('Contact Added')
                    break
                except ValueError as e:
                    print(e)
                    print('Contact Not Added Please the Valid Phone Number')

        elif choice == '2':
            first_name = input('\nEnter First Name of the Contact to Delete: ')
            try:
                contact_to_delete = phone_book.find_contact_by_last_name(first_name)
                phone_book.remove_contact(contact_to_delete)
                print(f"Contact Deleted: {contact_to_delete}")
            except ValueError as e:
                print(e)

        elif choice == '3':
            first_name = input('\nEnter First Name of the Contact to Edit: ')
            new_first_name = input('\nEnter New Name: ')
            new_last_name = input('\nEnter New Last Name: ')
            new_phone_number = input('\nEnter New Phone Number: ')
            update_contact = phone_book.edit_contact(first_name, new_first_name, new_last_name, new_phone_number)
            if update_contact:
                print(f'Contact Updated: {update_contact}')
            else:
                print('Contact Not Updated')

        elif choice == '4':
            first_name = input('\nEnter First Name: ')
            try:
                find_contact_by_first_name = phone_book.find_contact_by_first_name(first_name)
                print(f'Contact Found: {find_contact_by_first_name}')
            except ValueError as e:
                print(e)

        elif choice == '5':
            last_name = input('\nEnter Last Name: ')
            try:
                find_contact_by_last_name = phone_book.find_contact_by_last_name(last_name)
                print(f'Contact Found: {find_contact_by_last_name}')
            except ValueError as e:
                print(e)

        elif choice == '6':
            phone_number = input('\nEnter Phone Number: ')
            try:
                find_contact_by_phone_number = phone_book.find_contact_by_phone_number(phone_number)
                print(f'Contact Found: {find_contact_by_phone_number}')
            except ValueError as e:
                print(e)

        elif choice == '7':
            print("=============================")
            print("\n All Contacts")
            print("=============================")
            for contact in phone_book.get_contacts():
                print(contact)

        elif choice == '8':
            print("Exiting. . . . . . . . . .")
            break
        else:
            print("Invalid choice Pick the right option")


if __name__ == '__main__':
    main()


