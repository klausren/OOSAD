package assignments.decorator.ex01;

//Implementation of a simple Window without any scrollbars
class SimpleWindow implements Window {
 public void draw() {
     // Draw window
	 System.out.println("Draw a window");
 }

 public String getDescription() {
     return "simple window";
 }
}