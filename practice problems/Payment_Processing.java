// Source: 06_Week8_Practice_Coding_Questions
// Problem: Question 5: Payment Processing

import java.util.*;
interface PaymentMethod { boolean processPayment(double amount); }
class CreditCardPayment implements PaymentMethod { public boolean processPayment(double a){return true;} }
class PayPalPayment implements PaymentMethod { public boolean processPayment(double a){return false;} }
class Order {
    List<Double> items=new ArrayList<>(); String status="Pending";
    void add(double price){items.add(price);}
    boolean pay(PaymentMethod method){
        if(items.isEmpty())throw new IllegalStateException("Empty order");
        double total=0;for(double x:items)total+=x;
        if(method.processPayment(total))status="Paid";
        return status.equals("Paid");
    }
}
