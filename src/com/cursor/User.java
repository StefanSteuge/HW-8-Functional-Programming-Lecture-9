package com.cursor;

import java.time.LocalDate;

public class User {
    private final String email;
    private final LocalDate entered_Data;
    private final String team;

    public User(String email, LocalDate entered_data, String team) {
        this.email = email;
        entered_Data = entered_data;
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getEntered_Data() {
        return entered_Data;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "User{" +
                "email = '" + email + '\'' +
                ", entered_Data = " + entered_Data +
                ", team = '" + team + '\'' +
                "}\n";
    }
}
/*
2. There is a list of users (User {email, loginDate, team}).
        Filter users who logged in after week ago, group by a team, where K - team, V - email.

 */