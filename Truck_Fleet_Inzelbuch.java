import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.LinkedTransferQueue;

public class Truck_Fleet_Inzelbuch {
    private ArrayList<Package_Inzelbuch> packageTBL;
    private ArrayList<Truck_Inzelbuch> trucks;

    public void addTrucks(Truck_Inzelbuch truck) {
        trucks.add(truck);
    }
    public void addPackage(Package_Inzelbuch aPackage) {
        String area = aPackage.getArea();
        boolean loaded = false;
        for (Truck_Inzelbuch truck: trucks) {
            if (truck.getArea().compareTo(area) == 0 && truck.getLocation().equals("Warehouse")){
                if(truck.getMaxWeight()>truck.getCurrentWeight()+aPackage.weight() && truck.getMaxCapacity() > truck.getNumPackages() + 1) {
                    truck.loadPackage(aPackage);
                    loaded = true;
                }
            }

        }
        if(!loaded) {
            packageTBL.add(aPackage);
        }
    }
    public String searchForPackage(Package_Inzelbuch aPackage) {
        return aPackage.Status();
    }
    public String searchFortruck(Truck_Inzelbuch trucks)
    {
       return trucks.getLocation();
    }
    public void declareDeliverd(Package_Inzelbuch aPackage)
    {
        for (Truck_Inzelbuch truck: trucks) {
            truck.unloadPackage(aPackage);
        }
    }
    public void atWareHouse(Truck_Inzelbuch trucksWarehouse) {
        trucksWarehouse.setLocation("Warehouse");
        for(Package_Inzelbuch packagesIWH:packageTBL)
            {
                if(packagesIWH.getArea().equals(trucksWarehouse.getArea()))
                {
                    if(trucksWarehouse.getMaxWeight()>trucksWarehouse.getCurrentWeight()+packagesIWH.weight() && trucksWarehouse.getMaxCapacity() > trucksWarehouse.getNumPackages() + 1) {
                        trucksWarehouse.loadPackage(packagesIWH);
                        packageTBL.remove(packagesIWH);
                    }
                }
            }
    }
}
