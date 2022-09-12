import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static  Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {


        ArrayList<Person> people = new ArrayList<>();
        String s="";
        while (!s.equals("x")){
            people.add(new Person(writeLogin(), writeparol()));
            System.out.println("Программаны токтоткунунз келсе анда x тамгасын басыныз: ");
            s= scanner.nextLine();
        }
        int a=1;
        for (Person i:people) {

            System.out.println(a+",login: "+i.getLogin());
            System.out.println(a+",parol: "+i.getParol());
            a+=1;
        }
    }
    public static String writeLogin() {
        String login = "";

        while (true) {
            try {
                System.out.println("Login enter: ");
                login = scanner.nextLine();
                if (login.contains("@") && login.length() >= 2 && login.length() < 30) {
                    return login;
                } else {
                    throw new RuntimeException();
                }
            } catch (RuntimeException e) {
                System.out.println("login kata ");
            }
        }

    }
    public static String writeparol() {
        String parol = "";

        while (true) {
            try {
                System.out.println("parol enter: ");
                parol = scanner.nextLine();
                if (parol.length() >= 6 && parol.length() < 15) {
                    return parol;
                } else {
                    throw new RuntimeException();
                }
            } catch (RuntimeException e) {
                System.out.println("parol kata ");
            }
        }
    }
    }




