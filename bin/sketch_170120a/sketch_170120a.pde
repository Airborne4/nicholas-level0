size(500,500);
for (int i = 450; i>0; i-=15) {
  if(i%30==0){
  fill(10,50,200);
  }
  else{
  fill(0,0,0);
  }
  ellipse(250, 250, i, i);
}