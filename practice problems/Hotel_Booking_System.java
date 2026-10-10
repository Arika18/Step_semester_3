// Source: 06_Week8_Practice_Coding_Questions
// Problem: Question 4: Hotel Booking System

import java.time.LocalDate;
import java.util.*;
abstract class Room {
    String id; Room(String i){id=i;} abstract double rate();
}
class StandardRoom extends Room { StandardRoom(String i){super(i);} double rate(){return 100;} }
class DeluxeRoom extends Room { DeluxeRoom(String i){super(i);} double rate(){return 180;} }
class Reservation {
    Room room; LocalDate start,end; boolean cancelled;
    Reservation(Room r,LocalDate s,LocalDate e){room=r;start=s;end=e;}
    boolean overlaps(LocalDate s,LocalDate e){return !cancelled&&s.isBefore(end)&&e.isAfter(start);}
    double price(){return java.time.temporal.ChronoUnit.DAYS.between(start,end)*room.rate();}
    void cancel(boolean beforeDeadline){if(!beforeDeadline)throw new IllegalStateException("Deadline passed");cancelled=true;}
}
