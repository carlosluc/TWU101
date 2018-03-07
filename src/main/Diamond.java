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

    public String drawDiamond(int number) {

        String output = drawIsoscelesTriangle(number);
        output += "\n";

        //bottom side, from the largest to the smallest
        for (int count = number - 1; count >= 1; count--){

            int space = number - count;
            int asterisk = 2*count - 1;

            output += drawSpace(space);
            output += drawAsterisk(asterisk);

            if(count!=1){
                output += "\n";
            }
        }

        return output;
    }

    public String drawDiamondWithName(int number) {

        String outputBuffer = drawDiamond(number);

        int asterisk = 2*number - 1;
        String base = drawAsterisk(asterisk);

        int start = outputBuffer.indexOf(base);
        int end = start + base.length();

        String output = outputBuffer.substring(0,start);
        output += "Carlos";
        output += outputBuffer.substring(end);

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