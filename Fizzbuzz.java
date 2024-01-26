package fizzbuzz;

public class Fizzbuzz {

    public Fizzbuzz(){
        
    }
    
    public static void main(String[] args) {
        
        for(int x = 1; x<=20; x++)
        {
            if (x % 3 != 0 && x % 5 != 0)
            {
            System.out.println(x);
            }
            else if (x % 3 == 0 && x % 5 != 0)
            {
            System.out.println("fizz");
            }
            else if (x % 3 != 0 && x % 5 == 0)
            {
            System.out.println("buzz");
            }
            else
            {
            System.out.println("fizzbuzz");
            }
        }
    }
}
