public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
        //task 2
        System.out.println("task 2");
        System.out.println(fullName.toUpperCase());
        //task 3
        System.out.println("task3");
        fullName = "Иванов Семён Семёнович";
        String newFullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + newFullName);
    }
}