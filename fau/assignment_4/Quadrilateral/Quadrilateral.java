/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.*;
public class Quadrilateral
{
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;
  
    public Quadrilateral()
    {
        p1 = new Point(1, 1);
        p2 = new Point(2, 1);
        p3 = new Point(2, 2);
        p4 = new Point(1, 2);
    }

    public Quadrilateral(Point newP1, Point newP2, Point newP3, Point newP4)
    {
        p1 = new Point(newP1.getX(), newP1.getY());
        p2 = new Point(newP2.getX(), newP2.getY());
        p3 = new Point(newP3.getX(), newP3.getY());
        p4 = new Point(newP4.getX(), newP4.getY());
    }
  
    public void setPoint1(Point newP)
    {
       p1.setX(newP.getX());
       p1.setY(newP.getY());
    }
  
    public void setPoint2(Point newP)
    {
       p2.setX(newP.getX());
       p2.setY(newP.getY());
    }
  
    public void setPoint3(Point newP)
    {
       p3.setX(newP.getX());
       p3.setY(newP.getY());
    }
  
    public void setPoint4(Point newP)
    {
       p4.setX(newP.getX());
       p4.setY(newP.getY());
    }  
  
    public Point getPoint1()
    {
       return p1;
    }
  
    public Point getPoint2()
    {
       return p2;
    }
  
    public Point getPoint3()
    {
       return p3;
    }
  
    public Point getPoint4()
    {
       return p4;
    }
  
    public Point getPoint(int pointNum)
    {
        switch(pointNum)
        {
            case 1:
                return getPoint1();
            case 2:
                return getPoint2();
            case 3:
                return getPoint3();
            case 4:
                return getPoint4();
            default:
                return null;
        }
    }
  
    public void setPoint(int pointNum, Point newP)
    {
        switch(pointNum)
        {
            case 1:
                setPoint1(newP);
                break;
            case 2:
               setPoint2(newP);
                break;
            case 3:
               setPoint3(newP);
                break;
            case 4:
               setPoint4(newP);
               break;
        }
    }

    public boolean isParallelogram()
    {      
       double d12 = Math.pow(p2.getX() - p1.getX(), 2.0) + Math.pow(p2.getY() - p1.getY(), 2.0);
       double d23 = Math.pow(p3.getX() - p2.getX(), 2.0) + Math.pow(p3.getY() - p2.getY(), 2.0);
       double d34 = Math.pow(p4.getX() - p3.getX(), 2.0) + Math.pow(p4.getY() - p3.getY(), 2.0);
       double d41 = Math.pow(p1.getX() - p4.getX(), 2.0) + Math.pow(p1.getY() - p4.getY(), 2.0);
      
       if(d12 != d34 || d23 != d41)
           return false;
      
       double mp13x = (p1.getX() + p3.getX()) / 2;
       double mp13y = (p1.getY() + p3.getY()) / 2;
       double mp24x = (p2.getX() + p4.getX()) / 2;
       double mp24y = (p2.getY() + p4.getY()) / 2;
      
       if(mp13x != mp24x || mp13y != mp24y)
           return false;
      
       return true;
    }

    public boolean isRectangle()
    {
       if(isParallelogram())
       {
           double d13 = Math.pow(p3.getX() - p1.getX(), 2.0) + Math.pow(p3.getY() - p1.getY(), 2.0);
           double d24 = Math.pow(p4.getX() - p2.getX(), 2.0) + Math.pow(p4.getY() - p2.getY(), 2.0);
          
           if(d13 != d24)
               return false;
          
           return true;
       }
       else      
           return false;
    }

    public boolean isSquare()
    {
       if(isRectangle())
        {
           double d12 = Math.pow(p2.getX() - p1.getX(), 2.0) + Math.pow(p2.getY() - p1.getY(), 2.0);
           double d23 = Math.pow(p3.getX() - p2.getX(), 2.0) + Math.pow(p3.getY() - p2.getY(), 2.0);
          
           if(d12 != d23)
               return false;          
          
           return true;
        }
       else
           return false;      
    }
  
    public String toString()
    {
        return "Point1: " + p1 + "\n" + "Point2: " + p2 + "\n" + "Point3: " + p3 + "\n" + "Point4: " + p4;
    }  

    
    public static void main(String[] args) {
               
        Quadrilateral q = new Quadrilateral();
      
        System.out.println("Four points of the quadrilateral #1");
        System.out.println(q);
        System.out.println("This is a parallelograme.(T/F): " + q.isParallelogram());
        System.out.println("This is a rectangle.(T/F): " + q.isRectangle());
        System.out.println("This is a square.(T/F): " + q.isSquare());

        q.setPoint2(new Point(3, 1));
        q.setPoint3(new Point(3, 2));

        System.out.println("\nFour points of the quadrilateral #2");
        System.out.println(q);
        System.out.println("This is a parallelograme.(T/F): " + q.isParallelogram());
        System.out.println("This is a rectangle.(T/F): " + q.isRectangle());
        System.out.println("This is a square.(T/F): " + q.isSquare());

        q.setPoint3(new Point(4, 2));
        q.setPoint4(new Point(2, 2));

        System.out.println("\nFour points of the quadrilateral #3");
        System.out.println(q);
        System.out.println("This is a parallelograme.(T/F): " + q.isParallelogram());
        System.out.println("This is a rectangle.(T/F): " + q.isRectangle());
        System.out.println("This is a square.(T/F): " + q.isSquare());

    }
    
}
