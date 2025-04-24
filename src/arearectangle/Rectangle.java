package arearectangle;

import java.util.Scanner;

public class Rectangle
{
    public float area(float length,float breadth)
    {

        float rec_area = length * breadth;
      return rec_area;
    }

    public static void main(String[] args) {
        float length,breadth;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter length and breadth");
        length = scan.nextFloat();
        breadth = scan.nextFloat();

        Rectangle rec = new Rectangle();
        float rec_area = rec.area(length,breadth);
        System.out.println("area is"+rec_area);


    }




}
