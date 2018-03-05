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
}
