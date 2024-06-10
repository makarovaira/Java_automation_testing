package org.example;

public class LoginData {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public LoginData(String name, String password) {
        this.name = name;
        this.password = password;
    }

}
