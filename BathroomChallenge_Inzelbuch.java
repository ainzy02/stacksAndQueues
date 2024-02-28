public class BathroomChallenge_Inzelbuch {
    public static void main(String []args)
    {
        Bathroom_Inzelbuch bathroom1 = new Bathroom_Inzelbuch(3);
        Bathroom_Inzelbuch bathroom2 = new Bathroom_Inzelbuch(3);
        Student_Inzelbuch students1 = new Student_Inzelbuch("James", "Washington", 1);
        Student_Inzelbuch students2 = new Student_Inzelbuch("David", "Monte", 2);
        Student_Inzelbuch students3 = new Student_Inzelbuch("Charlie", "Jackson ", 3);
        Student_Inzelbuch students4 = new Student_Inzelbuch("Johnny", "Johnson ", 4);
        Student_Inzelbuch students5 = new Student_Inzelbuch("Davis", "Davidson ", 5);
        Student_Inzelbuch students6 = new Student_Inzelbuch("Rachel", "Bobson ", 6);
        Student_Inzelbuch students7 = new Student_Inzelbuch("Chuck", "Gary", 7);
        Student_Inzelbuch students8 = new Student_Inzelbuch("John", "Smith", 8);
        Student_Inzelbuch students9 = new Student_Inzelbuch("John ", "Doe", 9);
        Student_Inzelbuch students10 = new Student_Inzelbuch("Jane", "Doe", 10);
        Student_Inzelbuch students11 = new Student_Inzelbuch("Janette", "Reed", 11);
        Student_Inzelbuch students12 = new Student_Inzelbuch("Michele", "Mickey", 12);
        bathroom1.addToQueue(students1);
        bathroom1.addToQueue(students2);
        bathroom1.addToQueue(students9);
        bathroom1.addToQueue(students8);
        bathroom1.addToQueue(students7);
        bathroom2.addToQueue(students11);
        bathroom2.addToQueue(students10);
        bathroom2.addToQueue(students6);
        bathroom2.addToQueue(students12);

    }
}
