package test.bank;

import main.bank.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.math.BigInteger;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    public void test_with_draw(){
        BankAccount bankAccount = new BankAccount(2000, 500);
        bankAccount.withDraw(400);

        assertEquals( 1600, bankAccount.getBalance() );
      /*  String[] names = "tuna:veena:Malik".split(":");
        System.out.println(names+"---> "+ names.length);*/

    }
    @Test
    public void test_deposits(){
        BankAccount bankAccount = new BankAccount(2000, 500);
        bankAccount.deposit(750);
        assertEquals( 2750, bankAccount.getBalance() );
        Path path = Paths.get("EmployeeTest.java");
        System.out.println(path);
        Path absolute = path.toAbsolutePath();
        System.out.println(absolute);

    }

    @Test
    public void testAllItemsInList(){
        List<Integer> numbers = Arrays.asList(-10,6,7,8,9,10);
        assertAll(() -> assertEquals(-10, numbers.get(0)),
                () -> assertEquals(6, numbers.get(1)),
                () -> assertEquals(7, numbers.get(2)),
                () -> assertEquals(8, numbers.get(3)),
                () -> assertEquals(9, numbers.get(4)),
                () -> assertEquals(10, numbers.get(5)));
    }
// @Todo Assumtions testing in Junit

    @Test
    @EnabledOnOs(OS.MAC)
    public void testOnMac(){
        System.out.println(System.getProperty("os.name"));
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void testOnWindow(){

    }
    @Test
    public void testing_reentrantLockCount(){
        testingConcurrent();
    }

    @Test
    public void bigIntegerFactorial(){
        bigIntegerDetails(4);
    }

    private void testingConcurrent(){
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        System.out.println(reentrantLock.getHoldCount());
        reentrantLock.lock();
        System.out.println(reentrantLock.getHoldCount());

        reentrantLock.unlock();
        System.out.println("unlocked first lock "+reentrantLock.getHoldCount());

    }

    public void bigIntegerDetails(int number){
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }





    
}
