void setup(){
size(800,550);
ellipseMode(LEFT);
}
  void draw(){
background(0,200,255);
    ellipse(100,250,200,100);
    ellipse(400,250,200,100);
fill(255,0,0);
if(mouseX<100){
mouseX=100;
}
if(mouseX>260){
mouseX=260;
}
ellipse(mouseX,mouseY,40,40);

ellipse(mouseX+mouseY,250,40,40);
if(mouseY>300){
mouseY=300;
}
if(mouseY>280){
mouseY=280;
}
fill(255,255,255);

}