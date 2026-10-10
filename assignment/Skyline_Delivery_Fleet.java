// Source: 03_Week7_Abstraction_Interface_Assignment
// Problem: Problem 5: Skyline Delivery Fleet

abstract class Drone { abstract String fly(); }
interface Trackable { String getLocation(); }
class DeliveryDrone extends Drone implements Trackable {
    String id; DeliveryDrone(String i){id=i;}
    String fly(){return id+" flying";}
    public String getLocation(){return id+" at Sector 4";}
}
class ScoutDrone extends Drone {
    String id; ScoutDrone(String i){id=i;}
    String fly(){return id+" scouting";}
}
class GroundRobot implements Trackable {
    String id; GroundRobot(String i){id=i;}
    public String getLocation(){return id+" at Sector 4";}
}
class Main {
    static String getLocationIfTrackable(Object o){
        return o instanceof Trackable ? ((Trackable)o).getLocation() : "Tracking not available";
    }
}
