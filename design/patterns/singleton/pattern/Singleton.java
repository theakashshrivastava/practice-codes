package design.patterns.singleton.pattern;

public class Singleton {

    private static Singleton ref = null;

    private Singleton() {}

    public static Singleton getSingletonRef(){
        if(ref == null)
            ref = new Singleton();
        return ref;
    }
}





