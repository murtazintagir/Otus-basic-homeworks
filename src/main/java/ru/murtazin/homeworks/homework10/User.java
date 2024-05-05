package ru.murtazin.homeworks.homework10;

import java.time.LocalDate;

public class User {
    private final String surname;
    private final String name;
    private final String middleName;
    private final LocalDate birthDay;
    private final String email;

    public User(String surname, String name, String middleName, LocalDate birthDay, String email) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.birthDay = birthDay;
        this.email = email;
    }

    public String getInfo() {
        return "ФИО: " + getSurname() + " " + getName() + " " + getMiddleName() + "\n" +
                "Дата рождения: " + getBirthDay() + "\n" +
                "email: " + getEmail();
    }

    public String getSurname() {
        return surname;
    }


    public String getName() {
        return name;
    }


    public String getMiddleName() {
        return middleName;
    }


    public LocalDate getBirthDay() {
        return birthDay;
    }


    public String getEmail() {
        return email;
    }
}
