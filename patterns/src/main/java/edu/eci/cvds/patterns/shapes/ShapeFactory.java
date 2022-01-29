package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;


public class ShapeFactory {

    public static Shape create(RegularShapeType type) {
        Shape forma = null;
        switch(type) {
            case Triangle:
                forma = new Triangle();
                break;
            case Quadrilateral:
                forma = new Quadrilateral();
                break;
            case Pentagon:
                forma = new Pentagon();
                break;
            case Hexagon:
                forma = new Hexagon();
                break;
        }
        return forma;
    }
}