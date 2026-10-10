// Source: 03_Week7_Abstraction_Interface_Assignment
// Problem: Problem 2: Gallery Description Cards

abstract class ArtPiece {
    private static int count=1000; final String pieceId="ART-"+(++count);
    abstract String describe();
    String getPieceId(){return pieceId;}
}
class Painting extends ArtPiece {
    String title; Painting(String t){title=t;}
    String describe(){return "Painting: "+title+", framed on canvas";}
}
class Sculpture extends ArtPiece {
    String title; Sculpture(String t){title=t;}
    String describe(){return "Sculpture: "+title+", carved from stone";}
}
