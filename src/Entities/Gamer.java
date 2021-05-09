package Entities;

import java.time.LocalDate;

public class Gamer {

    private String id;
    private String firstName;
    private String lastName;
    private LocalDate date;
    public Gamer(){

    }

    public Gamer(String id, String firstName, String lastName, LocalDate date) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
