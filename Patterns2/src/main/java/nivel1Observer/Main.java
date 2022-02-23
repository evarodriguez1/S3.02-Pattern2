package nivel1Observer;

public class Main {
    public static void main(String[]args) {

        Subject subject = new Subject();

        subject.add(new AgenciaBolsa("La Caixa"));
        subject.add(new AgenciaBolsa("BBVA"));
        subject.add(new AgenciaBolsa("Santander"));

        subject.notifyAgencies();
    }
}
