public class Student_Inzelbuch {
    private String fName;
    private String lName;
    private int ID;

    public Student_Inzelbuch(String fName, String lName, int ID) {
        this.fName = fName;
        this.lName = lName;
        this.ID = ID;
    }

    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
    }

    public int getID() {
        return ID;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean equals(Student_Inzelbuch student1) {
        return(student1.getID() == this.ID);
    }

}

