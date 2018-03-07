package main;

public class Diamond {

    public String drawIsoscelesTriangle(int number) {

        String output = "";

        for (int count = 1; count <= number; count++){

            int space = number - count;
            int asterisk = 2*count - 1;

            output += drawSpace(space);
            output += drawAsterisk(asterisk);

            if(count!=number){
                output += "\n";
            }
        }

        return output;
    }

    private String drawAsterisk(int number){

        String output = "";

        while (number > 0){
            output += "*";
            number--;
        }

        return output;
    }

    private String drawSpace(int number){

        String output = "";

        while (number > 0){
            output += " ";
            number--;
        }

        return output;
    }
}