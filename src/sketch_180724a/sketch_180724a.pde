
import ddf.minim.*;
Minim minim;
AudioPlayer sound;

void setup() {
  minim = new Minim(this);      //in the setup method
sound = minim.loadFile("ding.wav");
   size(500,500);
}

void draw() {
  PImage pepperoni = loadImage("pepperoni.ppm.gif");
  
 fill(255,229,204);
 ellipse(250,250,200,200);
 fill(204,0,0);
 ellipse(250,250,180,180);
  fill(255,255,51);
  ellipse(250,250,170,170);
  if (mousePressed) {
    image (pepperoni, mouseX, mouseY);
    sound.play();
sound.rewind();
  }
}