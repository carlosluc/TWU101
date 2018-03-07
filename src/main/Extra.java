package main;

import java.util.ArrayList;
import java.util.List;

public class Extra {

    public String fizzBuzzGame(int number) {

        String output = "";

        for(int item=1; item<= number; item++){

            if (isDivisibleByThree(item)){
                output += "Fizz";
            }

            if (isDivisibleByFive(item)) {
                output += "Buzz";
            }

            if (!isDivisibleByThree(item) && !isDivisibleByFive(item)) {
                output += String.valueOf(item);
            }

            if(item!=number){
                output += "\n";
            }
        }

        return output;
    }

    private boolean isDivisibleByThree(int number){
        return number%3 == 0;
    }

    private boolean isDivisibleByFive(int number){
        return number%5 == 0;
    }

    public List<Integer> primeFactors(int number) {
        List<Integer> list = new ArrayList<>();

        int count = 2;

        while (number > 1) {

            if(number%count == 0) {
                list.add(count);
                number = number/count;
                count = 2;
            } else {
                count++;
            }
        }

        return list;
    }
}