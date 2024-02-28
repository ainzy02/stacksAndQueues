import java.util.ArrayList;
import java.util.concurrent.LinkedTransferQueue;

public class Bathroom_Inzelbuch {
    public static void main(String[] args) {

    }

    private LinkedTransferQueue<Student_Inzelbuch> bathroomLine;
    private ArrayList<Student_Inzelbuch> insideBathroom;
    private ArrayList<Student_Inzelbuch> usedRecently;
    private int maxCapacity;

    public Bathroom_Inzelbuch(int maxCapacity) {
        this.bathroomLine = new LinkedTransferQueue<>();
        this.insideBathroom = new ArrayList<>();
        this.usedRecently = new ArrayList<>();
        this.maxCapacity = maxCapacity;

    }

    public ArrayList<Student_Inzelbuch> getinsideBathroom() {
        return insideBathroom;
    }

    public LinkedTransferQueue<Student_Inzelbuch> getBathroomLine() {
        return bathroomLine;
    }

    public ArrayList<Student_Inzelbuch> getUsedRecently() {
        return usedRecently;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void clearAll() {
        bathroomLine.clear();
        insideBathroom.clear();
        usedRecently.clear();
    }

    public void addToQueue(Student_Inzelbuch student) {
        if (usedRecently.contains(student)) {
            System.out.print(student.getFName() + " " + student.getLName() + " has used the bathroom recently.");
        } else {
            bathroomLine.add(student);
        }
    }

    public void enterBathroom() {
        if (!(bathroomLine.isEmpty()) && insideBathroom.size() < maxCapacity) {

            Student_Inzelbuch student = bathroomLine.poll();
            insideBathroom.add(student);
            System.out.println("Student " + student.getFName() + " " + student.getLName() + " has entered the bathroom.");
        }
    }

    public void leaveBathroom(Student_Inzelbuch student) {
        if (insideBathroom.contains(student)) {
            insideBathroom.remove(student);
            usedRecently.add(student);
            System.out.println(student.getFName() + " " + student.getLName() + "just exited the     bathroom");
        } else {
            System.out.println(student.getFName() + " " + student.getLName() + " is not in the bathroom.");
        }
    }

    public int getQueueLength() {
        return bathroomLine.size();
    }

    public String searchForStudent(Student_Inzelbuch student) {
        if (bathroomLine.contains(student)) {
            return student.getFName() + " " + student.getLName() + "is in the bathroom line";
        }
        if (insideBathroom.contains(student)) {
            return student.getFName() + " " + student.getLName() + " is in the bathroom";
        }
        return student.getFName() + " " + student.getLName() + " is not in the bathroom line or inside the bathroom.";
    }


}
