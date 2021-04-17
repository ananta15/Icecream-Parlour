public class Nuts extends Decorator
{
    Nuts(Icecream icecream )
    {
        this.icecream =icecream;
    }
    
    int getPrice()
    {
        return icecream.getPrice()+30;
    }
    String getName()
    {
        return icecream.getName()+" with Nuts";
    }
}
