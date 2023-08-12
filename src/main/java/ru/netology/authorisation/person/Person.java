package ru.netology.authorisation.person;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Person {
    @NotBlank
    @Size(min = 2, max = 15)
    private String user;
    @NotBlank
    @Size(min = 2, max = 5)
    private String password;

    public Person(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
