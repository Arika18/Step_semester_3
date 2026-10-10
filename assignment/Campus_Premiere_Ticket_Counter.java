// Source: 05_Week8_Coding_Assignment
// Problem: Question 3: Campus Premiere Ticket Counter

import java.util.*;
interface Seat { String id(); int price(); }
class RegularSeat implements Seat { String n; RegularSeat(String n){this.n=n;} public String id(){return n;} public int price(){return 150;} }
class PremiumSeat implements Seat { String n; PremiumSeat(String n){this.n=n;} public String id(){return n;} public int price(){return 250;} }
class ReclinerSeat implements Seat { String n; ReclinerSeat(String n){this.n=n;} public String id(){return n;} public int price(){return 400;} }
class Show {
    Set<String> booked=new HashSet<>();
    boolean book(List<Seat> seats){
        if(seats.size()>6) return false;
        for(Seat s:seats)if(booked.contains(s.id()))return false;
        for(Seat s:seats)booked.add(s.id());return true;
    }
    void release(List<Seat> seats){for(Seat s:seats)booked.remove(s.id());}
}
class Booking {
    Show show; List<Seat> seats; String customer; boolean cancelled=false;
    Booking(Show sh,String c,List<Seat> s){show=sh;customer=c;seats=s;}
    int total(){int n=0;for(Seat s:seats)n+=s.price();return n;}
    void cancel(boolean beforeShow){if(beforeShow&&!cancelled){show.release(seats);cancelled=true;}}
}
