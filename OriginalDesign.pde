int x=1;
float y=1;
void setup()
{
size(400,400);
background(35,50,100);
frameRate(30);
}


void draw()
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
	y=y+1.5;

}


