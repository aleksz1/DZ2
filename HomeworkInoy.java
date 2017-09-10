import java.util.Scanner;

class Inoy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Имя:");
        String name=in.nextLine();
        System.out.println("Город:");
        String city = in.nextLine();
        System.out.println("Возраст:");
        String age = in.nextLine();
        System.out.println("Хобби:");
        String hobby = in.nextLine();
        System.out.println(name+"-Имя");
        System.out.println(city+"-Город");
        System.out.println(age+"-Возраст");
        System.out.println(hobby+"-Хобби");
    }
}
