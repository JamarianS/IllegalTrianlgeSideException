/**Class: Triangle
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: October 2, 2023
 *
 * This class – This program creates a class named Triangle. Then creates 3 double method to repsresent the sides
 * of Triangle. Then it checks to see of the Triangle meet the proper criteria for a triangle, if not it
 * throws an exception. It then creates a main method and 2 objects to check if they are proper using a tyr catch.
 */
public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public boolean checkSides() throws IllegalTriangleSideException {
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            return true;
        }
        throw new IllegalTriangleSideException("Invalid Triangle Sides");
    }

    public static void main(String[] args) {
        try {
            Triangle triangle1 = new Triangle(3.0, 4.0, 5.0);
            if (triangle1.checkSides()) {
                System.out.println("A valid triangle");
            }
        } catch (IllegalTriangleSideException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            Triangle triangle2 = new Triangle(1.0, 1.0, 3.0);
            if (triangle2.checkSides()) {
                System.out.println("A valid triangle");
            }
        } catch (IllegalTriangleSideException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
