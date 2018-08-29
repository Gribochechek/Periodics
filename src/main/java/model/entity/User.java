package model.entity;

import java.math.BigDecimal;

public class User {

    private int user_id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private BigDecimal money;
    private Role role;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public static class Builder {

        private User instance = new User();

        private Builder setId(int id) {
            instance.user_id = id;
            return this;
        }

        private Builder setFirstName(String firstName) {
            instance.firstName = firstName;
            return this;
        }

        private Builder setLastName(String lastName) {
            instance.lastName = lastName;
            return this;
        }

        private Builder setEmail(String email) {
            instance.email = email;
            return this;
        }

        private Builder setPassword(String password) {
            instance.password = password;
            return this;
        }

        private Builder setMoney(BigDecimal money) {
            instance.money = money;
            return this;
        }

        private Builder setRole(Role role) {
            instance.role = role;
            return this;
        }

        public User build() {
            return instance;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", role=" + role +
                '}';
    }
}
