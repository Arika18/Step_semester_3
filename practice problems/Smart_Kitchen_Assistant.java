// Source: 04_Week7_Abstraction_Interface_Practice
// Problem: Problem 4: Smart Kitchen Assistant

abstract class KitchenTool {
    private int speedLevel=1;
    abstract String prepare();
    int getSpeedLevel(){return speedLevel;}
    void setSpeedLevel(int n){if(n>=1&&n<=5)speedLevel=n;}
}
interface Washable { String clean(); }
class Blender extends KitchenTool implements Washable {
    String prepare(){return "Blending at speed "+getSpeedLevel();}
    public String clean(){return "Blender rinsed and dried";}
}
