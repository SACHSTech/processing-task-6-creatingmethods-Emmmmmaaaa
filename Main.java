import processing.core.PApplet;

/**
 * Draws 7 rows of 15 stick men with hearts between every two. 
 * @author Emma Chan 
 *
 */
class Main {
  public static void main(String[] args) {
    
    String[] processingArgs = {"MySketch"};
	  Sketch mySketch = new Sketch();
	  PApplet.runSketch(processingArgs, mySketch);
  }
  
}