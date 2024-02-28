import java.util.Stack;

public class Truck_Inzelbuch {
    private int maxCapacity;
    private double maxWeight;
    private String area;
    private String location;
    private double currentWeight;
    private Stack<Package_Inzelbuch> packagesInsideTruck = new Stack<Package_Inzelbuch>();


    public Truck_Inzelbuch(int maxCapacity, double maxWeight, String area, String location){
        this.maxCapacity = maxCapacity;
        this.area = area ;
        this.maxWeight = maxWeight;
        this.location = location;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public int getNumPackages() {
        return packagesInsideTruck.size();
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getNextLocation(){
       return packagesInsideTruck.peek().getAddress();
    }
    public void loadPackage(Package_Inzelbuch aPackage){
        packagesInsideTruck.push(aPackage);
    }
    public void unloadPackage(Package_Inzelbuch aPackage) {
        if (packagesInsideTruck.peek().equals(aPackage)) {
                packagesInsideTruck.pop().setStatus("Delivered");
        }
    }

}
