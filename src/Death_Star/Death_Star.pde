

void setup() {
size(600, 600);
fill(#000000);
rect(0,0,1000,1000);
fill(#898787);
ellipse(350,300,100,100);
}

void draw() {
triangle(300,300,000,325,000,275);
if (mousePressed) {
fill(#00FF0A);
} else {
fill(#000000);
}
}
