public abstract class Icecream
{
    public final void templateMethod(int quantity)
    {
        addScoops(quantity);
        
        serve();
    
    }
    public void addScoops(int quantity)
    {
        System.out.println("\n\n"+quantity+" scoops of your desired ice cream is added and sundae is prepared.");
    }
    
    abstract int getPrice();
 
    
    abstract String getName();
    
    public void serve()
    {
        System.out.println("Served by waiter!");
    }
}
