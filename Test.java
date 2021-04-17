import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
public class Test
{  
    private static int  choice,choice1;  
    public static void main() throws NumberFormatException, IOException    
    { 
       do
       {        
        System.out.print("========= Sundae Menu ============ \n");  
        System.out.print("            1. Caramel Apple Sundae    \n");  
        System.out.print("            2. Strawberry Bonanza Sundae\n");  
        System.out.print("            3. Chocolate Waffle Sundae         \n");  
        System.out.print("            4. Tropical Pineapple Sundae         \n");  
        System.out.print("            5. Exit                        \n");  
        System.out.print("Enter your choice: ");  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
        choice=Integer.parseInt(br.readLine()); 
        
        if(choice<1 || choice>4)
        {
            System.out.println("\nThank you : ) ");  
            break;
        }
        
        
        System.out.print("\n========= Additional Sundae Toppings ============ \n");  
        System.out.print("            1. Brownie bites   \n");  
        System.out.print("            2. Oreo\n");  
        System.out.print("            3. Caramel         \n");  
        System.out.print("            4. Nuts         \n");  
        System.out.print("            5. Choco chips         \n");
        System.out.print("            6. Fruits         \n");
        System.out.print("            7. Sprinkles         \n");
        System.out.print("            8. Exit                        \n");  
        System.out.print("Enter your choice: ");  
        choice1=Integer.parseInt(br.readLine()); 
        
        switch (choice) 
        {  
            case 1:
            {   
                
                
                Icecream ic=new CaramelApple(); 
                
                ic.templateMethod(2);
                if(choice1==1)ic=new Browniebites(ic);
                else if(choice1==2)ic=new Oreo(ic);
                else if(choice1==3)ic=new Caramel(ic);
                else if(choice1==4)ic=new Nuts(ic);
                else if(choice1==5)ic=new Chocochips(ic);
                else if(choice1==6)ic=new Fruits(ic);
                else if(choice1==7)ic=new Sprinkles(ic);
                System.out.println("\n---Bill---");
                System.out.println(ic.getName()+ " Rs. " + ic.getPrice()+"\n\n\n\n");
                
            }  
            break;  
            case 2:
            {  
                Icecream ic=new Strawberry();  
                ic.templateMethod(2);
                if(choice1==1)ic=new Browniebites(ic);
                else if(choice1==2)ic=new Oreo(ic);
                else if(choice1==3)ic=new Caramel(ic);
                else if(choice1==4)ic=new Nuts(ic);
                else if(choice1==5)ic=new Chocochips(ic);
                else if(choice1==6)ic=new Fruits(ic);
                else if(choice1==7)ic=new Sprinkles(ic);
                System.out.println("\n---Bill---");
                System.out.println(ic.getName()+ " Rs. " + ic.getPrice()+"\n\n\n\n");
            }  
            break;  
            case 3:
            {  
                Icecream ic=new Chocolate();  
                ic.templateMethod(2);
                if(choice1==1)ic=new Browniebites(ic);
                else if(choice1==2)ic=new Oreo(ic);
                else if(choice1==3)ic=new Caramel(ic);
                else if(choice1==4)ic=new Nuts(ic);
                else if(choice1==5)ic=new Chocochips(ic);
                else if(choice1==6)ic=new Fruits(ic);
                else if(choice1==7)ic=new Sprinkles(ic);
                System.out.println("\n---Bill---");
                System.out.println(ic.getName()+ " Rs. " + ic.getPrice()+"\n\n\n\n");
            }  
            break;  
            case 4:
            {  
                Icecream ic=new Pineapple(); 
                ic.templateMethod(2);
                if(choice1==1)ic=new Browniebites(ic);
                else if(choice1==2)ic=new Oreo(ic);
                else if(choice1==3)ic=new Caramel(ic);
                else if(choice1==4)ic=new Nuts(ic);
                else if(choice1==5)ic=new Chocochips(ic);
                else if(choice1==6)ic=new Fruits(ic);
                else if(choice1==7)ic=new Sprinkles(ic);
                System.out.println("\n---Bill---");
                System.out.println(ic.getName()+ " Rs. " + ic.getPrice()+"\n\n\n\n");
            }  
            break;    
             
        }  
          
    }while(choice!=5);  
  }  
}  