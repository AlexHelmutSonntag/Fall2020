package person;

public class Person {
    private String surname;
    private String givenName;
    private String occupation;
    private Gender gender;
    private int birthyear;

    public Person(String givenName_input, String surname_input, String occupation_input, Gender gender_input,
            int birthyear_input) {
        this.surname = surname_input;
        this.givenName = givenName_input;
        this.occupation = occupation_input;
        this.gender = gender_input;
        this.birthyear = birthyear_input;
    }

    public boolean equals(Person that)
    {
        return(that!= null) && (that.surname.equals(this.surname)) && (that.givenName.equals(this.givenName)) && (that.occupation.equals(this.occupation)) &&(that.birthyear == this.birthyear)&& (that.gender == this.gender);
    }

    public String toString() {
        return surname + " " + givenName + " " + occupation + " " + gender + " " + birthyear;
    }

}