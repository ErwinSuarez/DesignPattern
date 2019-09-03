package ObserverPattern;

import java.util.ArrayList;

public class Doctor implements Observable{

    private String docname;
    private String request;
    private String patient;
    private ArrayList<Observing> observables;

    public Doctor() {
        observables = new ArrayList<>();
    }

    @Override
    public void registerObservers(Observing observing) {
        observables.add(observing);
    }

    @Override
    public void removeObservers(Observing observing) {
        int i = observables.indexOf(observing);
        if(i >= 0){
            observables.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observing observ: observables) {
            observ.update(docname,request,patient);
        }
    }

    private void requestSent() {
        notifyObservers();
    }

    public void setRequest(String docname, String request, String patient) {
        this.docname = docname;
        this.request = request;
        this.patient = patient;
        requestSent();
    }
}
