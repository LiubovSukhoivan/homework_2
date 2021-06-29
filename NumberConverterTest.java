package Test;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NumberConverterTest {
    @Test
    public void convet_1_To_I(){
        String romanNumber = ConvertNumber.toRoman(1);
        assertEquals("I",romanNumber);
    }
    @Test
    public void convet_2_To_II(){
        String romanNumber = ConvertNumber.toRoman(2);
        assertEquals("II",romanNumber);
    }
    @Test
    public void convet_3_To_III(){
        String romanNumber = ConvertNumber.toRoman(3);
        assertEquals("III",romanNumber);
    }
    @Test
    public void convet_4_To_IV(){
        String romanNumber = ConvertNumber.toRoman(4);
        assertEquals("IV",romanNumber);
    }
    @Test
    public void convet_5_To_V(){
        String romanNumber = ConvertNumber.toRoman(5);
        assertEquals("V",romanNumber);
    }
    @Test
    public void convet_6_To_VI(){
        String romanNumber = ConvertNumber.toRoman(6);
        assertEquals("VI",romanNumber);
    }
    @Test
    public void convet_10_To_X(){
        String romanNumber = ConvertNumber.toRoman(10);
        assertEquals("X",romanNumber);
    }
    @Test
    public void convet_19_To_XIX(){
        String romanNumber = ConvertNumber.toRoman(19);
        assertEquals("XIX",romanNumber);
    }

}
