package SingletonPattern;

class ChocolateBoiler
{
    private static ChocolateBoiler uniqueBiler;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler GetInstance() {
        if (uniqueBiler == null)
            uniqueBiler = new ChocolateBoiler();

        return uniqueBiler;
    }

    public void Fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;

            System.out.println("Filling Boiler with Mixture");
        }
    }

    public void Boil() {
        if (!isEmpty() && !isBoiled())
        {
            boiled = true;

            System.out.println("Boiling Mixture in Boiler");
        }
    }

    public void Drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            boiled = false;

            System.out.println("Draining Boiler's Mixture");
        }
    }

    private boolean isEmpty() {return empty;}
    private boolean isBoiled() {return boiled;}
}