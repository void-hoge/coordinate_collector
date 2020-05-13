int currentx;
int currenty;

void setup() {
	currentx = mouseX;
	currenty = mouseY;
	size(1000,1000);
}

void draw() {
	if (mousePressed == true) {
		line(currentx, currenty, mouseX, mouseY);
		print("g.drawLine(" + currentx + ", " + currenty + ", " + mouseX + ", " + mouseY+");\n");
	}
	currentx = mouseX;
	currenty = mouseY;
}
