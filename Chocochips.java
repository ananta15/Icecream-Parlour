public class Chocochips extends Decorator
{
    Chocochips(Icecream icecream )
    {
        this.icecream =icecream;
    }
    
    int getPrice()
    {
        return icecream.getPrice()+25;
    }
    String getName()
    {
        return icecream.getName()+" with Chocochips";
    }
}
