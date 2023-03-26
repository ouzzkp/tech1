package Entity.Concretes;

import java.awt.*;

public class Personel {


    private int id;
    private int birt_date;
    private String name;
    private String surname;
    private int salary;
    private String hire_date;
    private String email;
    private int phone;
    private String address;
    private Image photo;
    private String notes;

    public Personel() {

    }

    public Personel(int id, int birt_date, String name, String surname, int salary, String hire_date, String email, int phone, String address, Image photo, String notes) {
        this.id = id;
        this.birt_date = birt_date;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.hire_date = hire_date;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.photo = photo;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBirt_date() {
        return birt_date;
    }

    public void setBirt_date(int birt_date) {
        this.birt_date = birt_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getHire_date() {
        return hire_date;
    }

    public void setHire_date(String hire_date) {
        this.hire_date = hire_date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}
