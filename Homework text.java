import java.util.Scanner;

class Text {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Человек по имени:");
        String name=in.nextLine();
        System.out.println("Живет в городе:");
        String city = in.nextLine();
        System.out.println("Этому человеку:");
        String age = in.nextLine();
        System.out.println("Он любит заниматься:");
        String hobby = in.nextLine();
        System.out.println("Человек по имени:"+name+" Живет в городе:"+city);
        System.out.println("Этому человеку:"+age+"лет"+" Он любит заниматься:"+hobby);
    }
}