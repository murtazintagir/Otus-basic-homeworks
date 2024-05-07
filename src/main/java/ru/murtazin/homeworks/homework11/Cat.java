package ru.murtazin.homeworks.homework11;


public class Cat extends Animal {
    public Cat(String name, double speedRun, double speedSwim, double endurance) {
        super(name, speedRun, speedSwim, endurance);
    }

    @Override
    public double swim(double distance) {
        return -1;
    }
}
