/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * ShapeFactoryDemo is a class that demonstrates the Factory design pattern in action. It uses the ShapeFactory
 * class to get instances of shapes without knowing their classes.
 *
 * @author Praveen
 * @version 1.0
 */
public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape1=shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2=shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3=shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
