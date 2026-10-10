// Source: 04_Week7_Abstraction_Interface_Practice
// Problem: Problem 2: Warehouse Label Printer

interface Printable { String printLabel(); }
class PackageBox implements Printable {
    String id; PackageBox(String i){id=i;}
    public String printLabel(){return "Package label: "+id;}
}
class Invoice implements Printable {
    String id; Invoice(String i){id=i;}
    public String printLabel(){return "Invoice label: "+id;}
}
class Main {
    static void printAll(Printable[] a){for(Printable p:a)System.out.println(p.printLabel());}
}
