// Source: 04_Week7_Abstraction_Interface_Practice
// Problem: Problem 5: Package Drop-Off Log

abstract class DeliveryNote {
    abstract String confirmDelivery();
    String confirmDelivery(String signature){return confirmDelivery()+", signed by "+signature;}
}
class ParcelNote extends DeliveryNote {
    String id; ParcelNote(String i){id=i;}
    String confirmDelivery(){return "Parcel "+id+" delivered";}
}
class LetterNote extends DeliveryNote {
    String id; LetterNote(String i){id=i;}
    String confirmDelivery(){return "Letter "+id+" delivered";}
}
class Main {
    static void logAll(DeliveryNote[] a){for(DeliveryNote n:a)System.out.println(n.confirmDelivery());}
}
