package Test;

public class ConvertNumber {
    public static String toRoman(int arabicNumber) {
        String romanNumber = getRomanNumber(arabicNumber);
        romanNumber = romanNumber.replace("IIII", "IV");
        romanNumber = replaceInterlacedDigits(romanNumber);
        return romanNumber;
    }

    private static String replaceInterlacedDigits(String romanNumber) {
        for (int i = 2; i < romanNumber.length(); i++) {
            if (romanNumber.charAt(i - 2) == romanNumber.charAt(i)&&
            romanNumber.charAt(i - 1) != romanNumber.charAt(i)){
    romanNumber =romanNumber.substring(0,i-2) +
            romanNumber.charAt(i-1)+
            nextDigit(romanNumber.charAt(i))+
            romanNumber.substring(i+1);
            }
        }
        return romanNumber;
    }
    private static char nextDigit(char digit1){
        return new DigitsMap().nextDigit(digit1);
    }

    private static String getRomanNumber(int arabicNumber) {
        StringBuilder romanNumber = new StringBuilder();
        DigitsMap digitsMap = new DigitsMap();


        for (PairOfDigits digits1 : digitsMap.digits) {
            while (arabicNumber >= digits1.getArabic()) {
                romanNumber.append(digits1.getRoman());
                arabicNumber -= digits1.getArabic();
            }
        }
        return romanNumber.toString();
    }
}
