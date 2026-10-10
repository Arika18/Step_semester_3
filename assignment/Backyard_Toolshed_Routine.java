// Source: 03_Week7_Abstraction_Interface_Assignment
// Problem: Problem 3: Backyard Toolshed Routine

abstract class GardenTool { abstract String use(); }
class CuttingTool extends GardenTool {
    String use(){return "Using the tool in the garden, blade sharpened first";}
}
class Pruner extends CuttingTool {
    @Override String use(){return super.use()+", then trimming branches precisely";}
}
