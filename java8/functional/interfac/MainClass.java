package java8.functional.interfac;

public class MainClass {
    public static void main(String[] args) {

        //Lambda Expression
        MyInterFace ref = () -> {
            System.out.println("Hi");
        };

        ref.print();

        ref.message();

        MyInterFace.display();
        /** Method Reference **/
        MyInterFace staticRef = ImplementationClass::staticMethod;
        staticRef.print();
        //Constructor ref
        MyInterFace constRef = ImplementationClass::new;
        constRef.print();
        //Non-static ref
        ImplementationClass obj = new ImplementationClass();
        MyInterFace nonStaticRef = obj::nonStaticMethod;
        nonStaticRef.print();
    }
}
