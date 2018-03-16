/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;


public class Point {
    private double x;
    private double y;

    public Point() {
        x = 0;
        y = 0;
    }
    
    public Point(double newX, double newY){
        x = newX;
        y = newY;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public void setX(double newX)
    {
        x = newX;
    }
    
    public void setY(double newY){
        y = newY;
    }
    
    public Point getMidPoint(Point p2)
    {
        Point md = new Point((this.x + p2.x) / 2.0, (this.y + p2.y) / 2.0);
        return md;
    }
    
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
           
    
    
    
    
}
