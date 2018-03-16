/**
 * /****************************************************************************
 * Name: Luis Gustavo Grubert Valensuela Z#:23351882 lvalensuela2015@fau.edu
 * Course: JavaProgramming
 * Professor: Dr. Mehrdad Nojoumian
 * Due Date:03/15/2018             Due Time: 11:30PM
 * Assignment Number: Assignment 4
 * Last Changed: 03/15/2018
 *
 * Description:
 * class called Point used with the Quadrilateral class.
/*******************************************************************************
 */
package assignment4;


public class Point {
    private double x;
    private double y;

    public Point() {
        /**
         * Default Constructor
         */
        x = 0;
        y = 0;
    }
    
    public Point(double newX, double newY){
        /**
         * Default Constructor with two arguments
         */
        x = newX;
        y = newY;
    }
    
    public double getX(){
        /**
         * Method to get x value
         */
        return x;
    }
    
    public double getY(){
        /**
         * Method to get y value
         */
        return y;
    }
    
    public void setX(double newX){
        /**
         * Method to set x value
         */
        x = newX;
    }
    
    public void setY(double newY){
        /**
         * Method to set y value
         */
        y = newY;
    }
    
    public Point getMidPoint(Point p2){
        /**
         * Method to get the midpoint between 2 points
         */
        Point md = new Point((this.x + p2.x) / 2.0, (this.y + p2.y) / 2.0);
        return md;
    }
    
    public String toString(){
        /**
         * Method to print x and y points
         */
        return "(" + x + ", " + y + ")";
    }
           
    
    
    
    
}
