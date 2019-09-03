package SingletonPattern;

public class SingletonDriver {

    public static void main(String[] args) {

        Singleton firstInstance = Singleton.getInstance();
        System.out.println(firstInstance.getInfo().hashCode());
        Singleton secondInstanc = Singleton.getInstance();
        System.out.println(secondInstanc.getInfo().hashCode());

    }
}
