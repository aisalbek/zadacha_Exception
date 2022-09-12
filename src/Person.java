import java.util.Scanner;

public class Person {
    String login;
    String parol;

    public String getLogin() {
        return login;
    }

    public String getParol() {
        return parol;
    }

    public Person(String login, String parol) {
        this.login = login;
        this.parol = parol;

    }

    @Override
    public String toString() {
        return "Person{" +
                "clogin" + login +
                " parol "+ parol;
    }
}
