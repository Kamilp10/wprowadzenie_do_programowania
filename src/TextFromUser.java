import java.util.Scanner;

public class TextFromUser {
    public static void main(String[] args){
        System.out.println("Podaj imię:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("podaj naziwsko:");
        String surname = scanner.nextLine();
        System.out.println("podaj wiek:");
        String age = scanner.nextLine();
        System.out.println("Witaj "+name+" "+surname+" "+age);
    }
}
