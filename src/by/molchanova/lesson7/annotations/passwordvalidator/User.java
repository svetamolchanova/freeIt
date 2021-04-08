package by.molchanova.lesson7.annotations.passwordvalidator;

public class User {

    @ValidPassword(message = "password invalid")
    String password;
    String login;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
