import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
	// size of the space
    size(800, 400);
  }

  public void setup() {
    // colour of the background
    background(210, 255, 173);
  }

  public void draw() {
    // red men row
    stroke(255, 0, 0); 
    row(0); 
    // orange men row
    stroke(230, 137,17); 
    row(50); 
    // Yellow men row
    stroke(222,230,9); 
    row(100); 
    // green men row
    stroke(59,160,43); 
    row(150); 
    // blue men row
    stroke(0,103,171); 
    row(200); 
    // Navy men row
    stroke(0,19,223); 
    row(250); 
    // Purple men row
    stroke(137,0,224);
    row(300);  
    // draw the heart 
    for (int y = 1; y < 7; y++) {
      int xBalance = (y % 2) * 50; 
      for (int x = 70; x < 700; x += 100) {
        heart(x +xBalance, y * 50);
      }
    }
  }
  // draw the stick men 
  private void man(int x, int y){  
    int locationX = 50 + x; 
    int locationY = y;

    //set colour of the stick figure 
    fill(210, 255, 173);
    //body 
    line (locationX, 40 + locationY, locationX, 55 + locationY);
    //right leg
    line(locationX, 55 + locationY,60 + x, 65 + locationY);
    //left leg
    line(locationX, 55 + locationY,40 + x, 65 + locationY);
    //head 
    ellipse(locationX,30 + locationY, 15, 15);
    //right arm 
    line(locationX, 50 + locationY,60 + x, 40 + locationY);
    //left arm 
    line(locationX, 50 + locationY,40 + x, 40 + locationY);
  }

  //draw the rows 
  private void row(int y){
    for (int x = 0; x < 750; x += 50){
      man(x,y);
      }
    }

  //draws the heart 
  private void heart(int x, int y){
   stroke(0);
   fill(0, 0, 0);
   ellipse(x, y, 8, 10);
   ellipse(x + 10, y, 8, 10);
   triangle(x - 4, y, x + 14, y, x + 5, y + 12);
  }
}