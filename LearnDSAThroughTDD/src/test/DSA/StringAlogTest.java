package test.DSA;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// ASCII codes of all characters on key board
public class StringAlogTest {

    @Test
    public void return_ture_if_all_uppercase(){
        StringCaseCheack  upperCaseChar = new StringCaseCheack();
        assertTrue(upperCaseChar.isUpperCase("KART"));
    
    }
    @Test
    public void return_false_atleatOne_char_lowerCase(){
        StringCaseCheack  value = new StringCaseCheack();
        assertFalse(value.isUpperCase("KaRT"));

    }

    @Test
    public void return_true_all_char_lowerCase(){
        StringCaseCheack  value = new StringCaseCheack();
        assertTrue(value.isLowerCase("karth"));

    }
    @Test
    public void return_false_atleastOne_char_upperCase(){
        StringCaseCheack  value = new StringCaseCheack();
        assertFalse(value.isLowerCase("Karth"));

    }
    @Test
    public void return_true_if_match_password_criteria(){
        StringCaseCheack  value = new StringCaseCheack();
        assertTrue(value.isPassword("Karth1"));
        assertFalse(value.isPassword("Kart2"));

    }
    @Test
    public void return_false_if_not_matchs_password_criteria(){
        StringCaseCheack  value = new StringCaseCheack();
        assertFalse(value.isPassword("Kart"));
    }
    @Test
    public void leaning_streams(){
        StringCaseCheack  value = new StringCaseCheack();
    }
    @Test
    public void test_print_flatmap(){
        getMonthsSinceYouBorn(LocalDate.of(1990, 8, 14));


    }

    private void getMonthsSinceYouBorn(LocalDate dateOfBirth) {
        LocalDate currentData = LocalDate.now();

        Period between = Period.between(dateOfBirth, currentData);
        int years = between.getYears();
        int months = between.getMonths();
        System.out.println(years * 12 + months);
    }


}
