package exercises.ch4.school;

public class Teacher {
    // four fields: firstName, lastName, subject, and yearsTeaching
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;


    //Getters and setters
    public String getFirstName(){ return this.firstName; }
    private void setFirstName(){ this.firstName = firstName; }
    //changed from public to private cos changing 1st name shouldn't be public

    public String getLastName() { return this.lastName; }
    public void setLastName(){ this.lastName = lastName; }

    public String getSubject(){ return this.subject; }
    public void setSubject(){ this.subject = subject; }

    public int getYearsTeaching(){ return this.yearsTeaching; }
    public void setYearsTeaching(int yearsTeaching){ this.yearsTeaching = yearsTeaching; }
}
