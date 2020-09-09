package ru.v_makletsov.lecture_7.contact;

public class ContactMain {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Иван", "Иванов", "226718");
        Contact contact2 = new Contact("Петр", "Петров", "226815");
        Contact contact3 = new Contact("Денис", "Денисов", "226127");
        Contact contact4 = new Contact("Михаил", "Боярский", "266754");

        System.out.printf("1. %s %s %s%n", contact1.getName(), contact1.getSurname(), contact1.getPhone());
        System.out.printf("2. %s %s %s%n", contact2.getName(), contact2.getSurname(), contact2.getPhone());
        System.out.printf("3. %s %s %s%n", contact3.getName(), contact3.getSurname(), contact3.getPhone());
        System.out.printf("4. %s %s %s%n", contact4.getName(), contact4.getSurname(), contact4.getPhone());

        contact1.setName("Александр");
        contact1.setSurname("Александров");
        contact1.setPhone("2664267");

        System.out.printf("1. %s %s %s%n", contact1.getName(), contact1.getSurname(), contact1.getPhone());
    }
}
