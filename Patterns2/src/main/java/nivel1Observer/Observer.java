package nivel1Observer;

public interface Observer {
    Subject subject = new Subject();

    void communicate();
}
