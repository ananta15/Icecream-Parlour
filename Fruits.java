public class Fruits extends Decorator
{
    Fruits(Icecream icecream )
    {
        this.icecream =icecream;
    }
    
    int getPrice()
    {
        return icecream.getPrice()+25;
    }
    String getName()
    {
        return icecream.getName()+" with Fruits";
    }
}
