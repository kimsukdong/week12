package week12;
public class Shapes {
	 public static void main(String [] args) {
		Shape donut = new Circle(10); // 반지름이 10인 원 객체
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}
}