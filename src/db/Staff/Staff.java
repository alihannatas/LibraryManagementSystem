package db.Staff;

import static db.Staff.ArrayOperations.addItem;

//Todo: reconstruct this class after the completion of database design occurs
//Omer

public class Staff {
    private int id;
    private String name;
    private String surname;
    private String birthdate;
    private String[] telephoneNumbers = { };
    private String[] emails = { };
    private String[] adresses = { };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String[] getTelephoneNumbers() {
        return telephoneNumbers;
    }

    public void setTelephoneNumbers(String[] telephoneNumbers) {
        this.telephoneNumbers = telephoneNumbers;
    }

    public String[] getEmails() {
        return emails;
    }

    public void setEmails(String[] emails) {
        this.emails = emails;
    }

    public String[] getAdresses() {
        return adresses;
    }

    public void setAdresses(String[] adresses) {
        this.adresses = adresses;
    }


    Staff(int id, String name, String surname, String birthdate, String telephoneNumber, String email, String adress){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.telephoneNumbers = addItem(this.telephoneNumbers, telephoneNumber); //this referance is unnecessary but we are doing for the sake of writing formal code.
        this.emails = addItem(this.emails, email);
        this.adresses = addItem(this.adresses, adress);
    }

}
