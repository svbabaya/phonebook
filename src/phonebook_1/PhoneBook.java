package phonebook_1;

public class PhoneBook {
    private Contact[] contacts = new Contact[10];

    void addContact(Contact arg) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = arg;
                break;
            }
        }
    }

    //Метод возвращает индекс массива или -1 если объект не найден
    int searchContact(Contact arg) {
        int index = -1;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && arg != null && arg.getName() == contacts[i].getName() && arg.getPhone() == contacts[i].getPhone() && arg.getEmail() == contacts[i].getEmail()) {
                index = i;
                break;
            }
        }
        return index;
    }

    void deleteContact(Contact arg) {
        int index = searchContact(arg);
        if (index >= 0) {
            contacts[index] = null;
            System.out.println("Контакт удален:");
        } else System.out.println("Контакт не найден:");
    }

    void editContact(Contact arg, String name, String phone, String email) {
        if (searchContact(arg) >= 0) {
            arg.setName(name);
            arg.setPhone(phone);
            arg.setEmail(email);
            System.out.println("Контакт изменен:");
        } else System.out.println("Контакт не найден:");
    }

    void showPhoneBook() {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                System.out.printf("%d. ", i + 1);
                contacts[i].showContact();
            }
        }
    }
}
