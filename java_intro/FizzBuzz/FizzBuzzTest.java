import java.lang.Math;
public class FizzBuzzTest{
    public String fizzBuzz(int Number){
        String a = "Fizz";
        String b = "Buzz";
        String c = "FizzBuzz";
        String i = Integer.toString(Number);
        
        if(Number%3 == 0 && Number%5 == 0){
            return i = c;
        }

        if(Number%5 == 0){
            return i = b;
        }

        if(Number%3 == 0){
            return i = a;
        }
        return i;
    }
}