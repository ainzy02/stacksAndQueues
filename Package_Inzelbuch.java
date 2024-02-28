public class Package_Inzelbuch {

    private String area;
    private String address;
    private double weight;
    private String Status;

    public Package_Inzelbuch(String area, String address, double weight, String Status) {
        this.area = area;
        this.address = address;
        this.weight = weight;
        this.Status = Status;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double weight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String Status() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
}

