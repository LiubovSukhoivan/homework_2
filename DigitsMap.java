package Test;

import java.util.ArrayList;

public class DigitsMap {
    public final ArrayList<PairOfDigits> digits;
    public DigitsMap() {
        digits = new ArrayList<>();
        digits.add(new PairOfDigits(10, 'X'));
        digits.add(new PairOfDigits(5, 'V'));
        digits.add(new PairOfDigits(1, 'I'));
    }
    public char nextDigit(char digit1){
        for(int i =0;i<digits.size();i++){
            if(digits.get(i).getRoman()==digit1){
                return digits.get(i-1).getRoman();
            }
        }
       return digit1;
    }
}
