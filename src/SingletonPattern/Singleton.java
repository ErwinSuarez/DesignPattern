package SingletonPattern;

public class Singleton {

    private static Singleton ourInstance;
    public static Singleton getInstance() {

        if(ourInstance == null) {
            ourInstance = new Singleton();
        }
        return ourInstance;
    }

    public Singleton getInfo(){
        return ourInstance;
    }
}
