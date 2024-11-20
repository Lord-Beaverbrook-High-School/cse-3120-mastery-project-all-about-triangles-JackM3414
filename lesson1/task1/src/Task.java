public class Task {
  public static void main(String[] args) {
Triangle tri=new Triangle();
Triangle tri2=new Triangle(27,12,13.5);
Triangle tri3=new Triangle(9,7.5,3.1);
Triangle tri4=new Triangle(8.54,3.0,8.0);
Triangle tri5=new Triangle(4.0,7.25,4.0);
System.out.println(tri.displayTriangle());
System.out.println(tri.isTri());
System.out.println(tri2.displayTriangle());
System.out.println(tri2.isTri());
tri2.setLarge(2+tri2.getMed());
System.out.println(tri2.isTri());
System.out.println(tri3.perimeter());
System.out.println(tri3.getArea());
System.out.println(tri4.isRightTri());
System.out.println(tri5.displayTriangle());
// I tested each method using different triangles, making sure that each method, especially triangle, isRightTri, and getArea was correct for a variety of different sets of numbers. Each test came back correct.
  }
}