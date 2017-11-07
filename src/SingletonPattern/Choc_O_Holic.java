package SingletonPattern;

import MyGenerics.IInitialStep;

public class Choc_O_Holic implements IInitialStep
{
    public void Start() {
        ChocolateBoiler boiler = ChocolateBoiler.GetInstance();

        boiler.Fill();
        boiler.Boil();
        boiler.Drain();
    }
}
