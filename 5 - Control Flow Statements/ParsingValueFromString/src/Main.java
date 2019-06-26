import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {

        // String numberAsString = "2018";
        String numberAsString = "2018.125";
        System.out.println("numberAsString = " + numberAsString);

        // int number = Integer.parseInt(numberAsString);
        double number = Double.parseDouble(numberAsString);

        System.out.println("number = " + numberAsString);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString is now = " + numberAsString);
        System.out.println("number is now = " + number);
    }
}
