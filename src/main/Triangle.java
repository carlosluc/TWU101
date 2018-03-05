package main;

public class Triangle {

    public String drawAsterisk() {
        return "*";
    }

    public String drawHorizontalLine(int number) {

        String output = "";

        while (number > 0){
            output += "*";
            number--;
        }

        return output;
    }

    public String drawVerticalLine(int number) {

        String output = "";

        while (number > 0){
            output += "*";
            number--;

            if(number!=0){
                output += "\n";
            }
        }

        return output;
    }

    public String drawRightTriangle(int number) {

        String output = "";

        for (int count = 1; count <= number; count++){

            output += drawHorizontalLine(count);

            if(count!=number){
                output += "\n";
            }
        }

        return output;
    }
}