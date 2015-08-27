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

public class OriginalDesign extends PApplet {

int x=1;
float y=1;
public void setup()
{
size(400,400);
background(35,50,100);
frameRate(30);
}


public void draw()
{	noStroke();
	fill(249,70,250);
	ellipse(200,200,150,x);
	ellipse(200,200,x,150);
	
	if(x>400)
	{
		background(35,50,100);
		x=1;
	}
	
	fill(240,150,200);
	ellipse(200,200,10,y);
	ellipse(200,200,y,10);

	if(y>400)
	{
		background(35,50,100);
		y=1;
	}
	x=x+1;
	y=y+1.5f;

}


  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
