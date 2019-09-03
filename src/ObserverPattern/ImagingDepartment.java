package ObserverPattern;

public class ImagingDepartment implements Observing{

    private String docname;
    private String request;
    private String patient;
    private Observable observable;

    public ImagingDepartment(Observable observable) {
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
        System.out.println("IMAGING DEPT\nDr. " + docname + " resquested for a: " + request + " for Patient: " + patient);
    }
}
