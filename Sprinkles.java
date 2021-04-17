public class Sprinkles extends Decorator
{
    Sprinkles(Icecream icecream )
    {
        this.icecream =icecream;
    }
    
    int getPrice()
    {
        return icecream.getPrice()+15;
    }
    String getName()
    {
        return icecream.getName()+" with Sprinkles";
    }
}
