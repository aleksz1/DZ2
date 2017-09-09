import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = in.nextLine();
        System.out.println("Введите город проживания:");
        String city = in.nextLine();
        System.out.println("Введите ваш возраст:");
        String age = in.nextLine();
        System.out.println("Введите ваше хобби:");
        String hobby = in.nextLine();
        System.out.println("Введите имя:"+name);
                System.out.println("Введите город проживание:"+city);
        System.out.println("Введите ваш возраст:"+age);
        System.out.println("Введите ваше хобби:"+hobby);
    }
}