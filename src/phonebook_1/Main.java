package phonebook_1;

public class Main {
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();
        int isHere; //Наличие контакта: индекс, отсутствие -1

        //Данные для добавления контактов
        Contact serge = new Contact("Serge", "+79167855320", "svb@ramt.com");
        Contact peter = new Contact("Peter", "+79207789765", "pet@yahh.com");
        Contact john = new Contact("Johnny", "+48800530417", "johhnn@gmail.com");
        Contact alfred = new Contact("Alfred", "+90089066320", "al100@vigvam.com");
        Contact nataly = new Contact("Nataly", "+17602680440", "nat@summer.com");

        //Данные для поиска существующего контакта
        Contact known = new Contact("Serge", "+79167855320", "svb@ramt.com");

        //Данные для поиска несуществующего контакта
        Contact unknown = new Contact("Alfred", "+79168989045", "fred@clone.com");

        //Данные для удаление контакта
        Contact kill = new Contact("Johnny", "+48800530417", "johhnn@gmail.com");

        //Добавление контактов
        phonebook.addContact(serge);
        phonebook.addContact(peter);
        phonebook.addContact(john);
        phonebook.addContact(alfred);
        phonebook.addContact(nataly);
        System.out.println("Добавление контактов ********************");
        phonebook.showPhoneBook();
        System.out.println();

        //Поиск существующего контакта
        System.out.println("Поиск существующего контакта serge ********************");
        if (phonebook.searchContact(known) >= 0)
        {
            System.out.println("Контакт найден:");
            known.showContact();
        } else {
            System.out.println("Контакт не найден:");
            known.showContact();
        }
        System.out.println();

        //Поиск несуществующего контакта
        System.out.println("Поиск несуществующего контакта: не совпадают phone, email ********************");
        if (phonebook.searchContact(unknown) >= 0)
        {
            System.out.println("Контакт найден:");
            unknown.showContact();
        } else {
            System.out.println("Контакт не найден:");
            unknown.showContact();
        }
        System.out.println();

        //Удаление контакта
        System.out.println("Удаление контакта johnny ********************");
        phonebook.deleteContact(kill);
        phonebook.showPhoneBook();
        System.out.println();

        //Изменение контакта
        System.out.println("Изменение контакта alfred ********************");
        phonebook.editContact(alfred, "Freddy", "+58892323487", "frd@boombox.for");
        phonebook.showPhoneBook();
    }
}
