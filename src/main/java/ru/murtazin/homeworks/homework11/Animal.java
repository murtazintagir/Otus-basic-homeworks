package ru.murtazin.homeworks.homework11;

public abstract class Animal {
    String name;
    double speedRun;
    double speedSwim;
    double endurance;

    public Animal(String name, double speedRun, double speedSwim, double endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.endurance = endurance;
    }

    public double run(double distance) {
        if (distance > this.endurance) {
            return -1;
        } else {
            return distance / this.speedRun;
        }
    }

    public abstract double swim(double distance);

    public void info() {
        System.out.println("Имя: " + this.name + "\n" +
                "Скорость бега: " + this.speedRun + " м/с\n" +
                "Скорость плавания: " + this.speedSwim + " м/с\n" +
                "Выносливость: " + this.endurance + " ед. выносливости\n");
    }

    public String getName() {
        return name;
    }

    public void setEndurance(double endurance) {
        this.endurance = endurance;
    }

    public double getEndurance() {
        return endurance;
    }
}
