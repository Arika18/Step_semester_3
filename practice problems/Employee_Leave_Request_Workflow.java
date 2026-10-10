// Source: 06_Week8_Practice_Coding_Questions
// Problem: Question 2: Employee Leave Request Workflow

abstract class Employee { String name; Employee(String n){name=n;} abstract int maxLeave(); }
class FullTimeEmployee extends Employee { FullTimeEmployee(String n){super(n);} int maxLeave(){return 30;} }
class PartTimeEmployee extends Employee { PartTimeEmployee(String n){super(n);} int maxLeave(){return 10;} }
class LeaveRequest {
    Employee employee; String dates,status="Pending";
    LeaveRequest(Employee e,String d){employee=e;dates=d;}
    void review(boolean approved){
        if(!status.equals("Pending"))throw new IllegalStateException("Already reviewed");
        status=approved?"Approved":"Rejected";
    }
}
