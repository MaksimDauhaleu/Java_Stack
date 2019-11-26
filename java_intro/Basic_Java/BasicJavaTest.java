public class BasicJavaTest{
    public Integer printNum(Integer int1){
        Integer x = 0;
        while(x < int1){
            System.out.println(x);
            x++;
        }
        return x;
    }
    public Integer printOdd(Integer int2){
        Integer x = 0;
        while(x < int2){
            if(x % 2 != 0){
                System.out.println(x);
            }
        x++;
        }
        return x;
    }
    public void printSum(Integer int1){
        int total = 0;
        for(int i = 0; i < int1; i++){
            total += i;
            System.out.println("New number: " + i + " Sum: " + total);
        }
    }
}