package test.DSA;

import org.junit.jupiter.api.Test;

public class RoomTemperatureTest {
    private boolean heater = true;
    private boolean blower = true;
    private boolean cooller = false;
    private boolean hiTemperature = false;
    private boolean loTemperature = false;


    @Test
    public void turnOnHeaterAndBlowerIfTooCold(){
        getState();
    }


    public String getState(){
        String s = "";
        s+=heater?"H":"h";
        s+=blower?"B":"b";
        s+= cooller ?"C":'c';
        s+=hiTemperature?"H":"h";
        s+=loTemperature?"L":"l";
        return s;
    }
}
