package java8.functional.interfac;

public interface NormalInterface {
    void printMessage();
    void printText();

    //Lambda expression can't be used for Normal interface as they might have 'Multiple over-riding methods'
}
