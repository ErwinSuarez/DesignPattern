package ObserverPattern;

public class Admissions implements Observing {

    private String docname;
    private String request;
    private String patient;
    private Observable observable;

    public Admissions(Observable observable) {
        this.observable = observable;
        observable.registerObservers(this);
    }

    @Override
    public void update(String docname, String request, String patient) {
        this.docname = docname;
        this.request = request;
        this.patient = patient;
        showList();
    }

    private void showList() {
        System.out.println("ADMISSION\nPatient: " + patient + " is being requested to have: " + request + " by Dr. " + docname);
    }
}
