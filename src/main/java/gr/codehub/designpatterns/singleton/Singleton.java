package gr.codehub.designpatterns.singleton;

public class Singleton {
    private static Singleton singleton;
    private Singleton(){
        System.out.println("This is the creation of the singleton object");
    }

    public static Singleton getSingleton(){
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public String getInfo(){
        return "I am a singleton";
    }
}
