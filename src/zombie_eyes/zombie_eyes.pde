
void setup() {
  PImage face = loadImage("obama-face-1.jpg");
  image(face,0,0);
  size(500,400);
}

void draw() {
  
  if(mousePressed) {
    fill(random(255),random(255),random(255));
  }
  ellipse(254,130,30,30);
  ellipse(330,130,30,30);
  fill(0,0,0);
  ellipse(254,130,5,5);
  ellipse(330,130,5,5);
  
}