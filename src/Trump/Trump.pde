PImage wall;
PImage friend;
void setup() {
friend = loadImage("FRIEND.jpg");
size(800,600);
friend.resize(width,height);
wall = loadImage("WALL.jpg");
wall.resize(800,800);
}

void draw() {
background(friend);
if (mousePressed) {
image(wall,0,300);
}
}
