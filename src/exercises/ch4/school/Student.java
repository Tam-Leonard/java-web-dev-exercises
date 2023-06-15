package exercises.ch4.school;

public class Student {

    public static void main(String[] args) {
        Student myself = new Student("Grace", 1, 30, 4.0);
        Student twin = new Student("Grace", 2, 20, 2.0);
        Teacher theTeacher = new Teacher();

       //String myGradeLevel = myself.getGradeLevel(); //Ch5 test for gradeLevel did this first
        // System.out.println(myGradeLevel); // Ch 5 this test to see if gradeLevel method works

        //myself.addGrade(3,3.0); test to calculate gpa
        //System.out.println(myself.gpa);

        //System.out.println(myself.toString()); test toString
        //custom .equals method test
        System.out.println(myself.equals(twin));

    }


    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    //Ch 5////////
    public void addGrade(int courseCredits, double grade) {// parameters were already completed
        // Update the appropriate fields: numberOfCredits, gpa


        //DO THIS FIRST: 5.5.2.2. Determine the New GPA - Current total quality score = gpa * number of credits
        //gpa and numberOfCredits are class variables stated above so use this. to access them
        double currentTotalQualityScore = this.gpa * this.numberOfCredits;

        //DO THIS SECOND: The quality score for a class is found by multiplying the letter grade score (0.0-4.0) by the number of credits.
        //break down task: quality score = letter grade (0.0-4.0) * number of credits
        double newQualityScore = grade * courseCredits;

        //DO THIS THIRD: Use the new course grade and course credits to update their total quality score
        double newTotalQualityScore = currentTotalQualityScore + newQualityScore;

        //DO THIS FORTH: Update the student’s total numberOfCredits
        //this is an int b/c the parameter said it so we add numberOfCredits and what is passed into the parameter
        int newTotalNumberOfCredits = this.numberOfCredits + courseCredits;
        this.numberOfCredits = newTotalNumberOfCredits;

        //DO THIS FIFTH: Compute their new GPA
        //formula to calculate gpa: gpa = (total quality score) / (total number of credits)
        double newGPA = newTotalQualityScore /  newTotalNumberOfCredits;
        //Update the new gpa
        this.gpa = newGPA;

    }

    public String getGradeLevel() { //Ch5
        // Determine the grade level of the student based on numberOfCredits
       // Freshman (0-29 credits), Sophomore (30-59 credits), Junior (60-89 credits), or Senior (90+ credits)

        //Task: returns the student’s level based on the number of credits they have earned
        //to access class variables, use the keyword this
        //first ex. is freshman look to see if credits are >=0 and <= 29
        if (this.numberOfCredits >= 0 && this.numberOfCredits <= 29) {
            return "Freshman";
        } else if (this.numberOfCredits >= 30 && this.numberOfCredits <= 59) {
            return "Sophomore";
        } else if (this.numberOfCredits >= 60 && this.numberOfCredits <= 89) {
            return "Junior";
        } else if (this.numberOfCredits >= 90) {
            return "Senior";
        } else {
            return null; //this is a catch all or none of the above kind of case.
        }

        //return null; //started w/ return null as a placeholder b/c the curly bracket was red but removed b/c
        //its considered unreachable  b/c of the else statement above. It won't be executed b/c there is never a reason
        //why it will need to be executed
    }

    //5.5.3. toString and equals
    // Add custom equals() and toString() methods to the Student class.
    @Override
    public String toString() {
        return this.name +": " + this.gpa;
    }

    @Override
    public boolean equals(Object obj) {
        if (( obj instanceof Student) == false) return false;
        Student myStudentObj = (Student) obj;
        if (myStudentObj.name.equals(this.name)) return true;
        else return false;
    }


//END CH 5 ////////
    /* getters and setters */
    public String getName() { return this.name; }

    public void setName() { this.name = name; }

    public int getStudentId() { return this.studentId; }
    private void setStudentId(int studentId) { this.studentId = studentId; }

    public int getNumberOfCredits() { return this.numberOfCredits; }

    public void setNumberOfCredits(int numberOfCredits ) { this.numberOfCredits = numberOfCredits; }

    public double getGpa() { return this.gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

}
