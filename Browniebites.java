public class Browniebites extends Decorator
{
    Browniebites(Icecream icecream )
    {
        this.icecream =icecream;
    }
    
    int getPrice()
    {
        return icecream.getPrice()+18;
    }
    String getName()
    {
        return icecream.getName()+" with Browniebites";
    }
}
