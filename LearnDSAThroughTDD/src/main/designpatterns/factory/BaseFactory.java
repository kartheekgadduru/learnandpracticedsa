package main.designpatterns.factory;

public interface BaseFactory {
    Motor createMotor();
    Battery createBattery();
}
