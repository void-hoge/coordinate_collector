import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class coordinate_collector extends PApplet {

int currentx;
int currenty;

public void setup() {
	currentx = mouseX;
	currenty = mouseY;
	
}

public void draw() {
	if (mousePressed == true) {
		line(currentx, currenty, mouseX, mouseY);
		print("g.drawLine(" + currentx + ", " + currenty + ", " + mouseX + ", " + mouseY+");\n");
	}
	currentx = mouseX;
	currenty = mouseY;
}
  public void settings() { 	size(1000,1000); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "coordinate_collector" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
