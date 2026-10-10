// Source: 04_Week7_Abstraction_Interface_Practice
// Problem: Problem 3: Orchestra Warm-Up Routine

abstract class Instrument { abstract String play(); }
class StringInstrument extends Instrument {
    String play(){return "Strumming the strings";}
}
class Violin extends StringInstrument {
    @Override String play(){return super.play()+", with a bow drawn across four strings";}
}
