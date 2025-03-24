package design.patterns.singleton.pattern;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton x = Singleton.getSingletonRef();
        Singleton y = Singleton.getSingletonRef();
        Singleton z = Singleton.getSingletonRef();
        if(x==y && y==z)
            System.out.println("All instances are equal");
    }
}
