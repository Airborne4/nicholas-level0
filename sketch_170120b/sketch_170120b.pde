void setup(){
size(600,550);
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
if(mouseX<400){
mouseX=400;
}
ellipse(mouseX,250,40,40);

ellipse(mouseX+300,250,40,40);

fill(255,255,255);

}