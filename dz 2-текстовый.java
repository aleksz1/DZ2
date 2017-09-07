import java.util.Scanner;

public class DZ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Человек по имени:");
        String name=in.nextLine();
        System.out.println("Живет в городе:");
        String city = in.nextLine();
        System.out.println("Этому человеку:");
        String age = in.nextLine();
        System.out.println("И он любит заниматься:");
        String hobby = in.nextLine();
        System.out.println("Человек по имени:"+name+" Живет в городе:"+city);
        System.out.println("Этому человеку:"+age+"лет"+" И он любит заниматься:"+hobby);
    }
}