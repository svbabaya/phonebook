package phonebook_1;

public class Contact {
    private String name;
    private String phone;
    private String email;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    //Вывод контакта на экран
    void showContact() {
        System.out.printf("%s\t\t%s\t\t%s\n", name, phone, email);
    }

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public Contact(String name) {
        this.name = name;
    }
    public Contact() {
    }
}
