package PatternsPractice;
import MyGenerics.IInitialStep;
import SingletonPattern.Choc_O_Holic;


public class Main {

    enum Patterns { Singleton }

    public static void main(String[] args) {
        Patterns toPractice = Patterns.Singleton;

        switch (toPractice) {
            case Singleton:  start( new Choc_O_Holic() );  break;
        }
    }

    private static void start(IInitialStep pattern){pattern.Start();}

}
