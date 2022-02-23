package nivel1Observer;

public class AgenciaBolsa implements Observer {

    private String agencyName;

    public AgenciaBolsa(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public void communicate() {
        System.out.println("La agencia "+agencyName+ " ya està notificada.");
    }
}