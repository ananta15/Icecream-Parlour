public class Oreo extends Decorator
{
    Oreo(Icecream icecream )
    {
        this.icecream =icecream;
    }
    
    int getPrice()
    {
        return icecream.getPrice()+10;
    }
    String getName()
    {
        return icecream.getName()+" with Oreo";
    }
}
