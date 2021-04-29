package hu.nive.ujratervezes.kepesitovizsga;

public class AddDigits {

    public int addDigits(String value) {
        if (value == null || value == ""){
            return -1;
        } return numberExtractor(value);
    }

    private int numberExtractor(String value) {
        int total = 0;
        for (int i = 0; i < value.length(); i++) {
            char number = value.charAt(i);
            if (Character.isDigit(number)) {
                int v = Character.getNumericValue(number);
                total = total + v;
            }
        }
        return total;
    }


}
