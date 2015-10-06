int r,g,b;
float button1X=100, button1Y=100, button1W=80, button1H=40;
int counter=0;




void setup() {
  size( 800, 500 );
}

void reset() {
  r=  100;
  g=  200;
  b=  250;
}

void draw() {
  background( r,g,b );
  fill(30,80,100);
  showButton( button1X, button1Y, button1W, button1H );
  fill(50,100,60);
  text( "Click me!", button1X+button1W/4, button1Y+button1H*2/3 );
}

void showButton( float x, float y, float w, float h ) {
  rect ( x,y, w,h );
  fill( 265,255,0 );
}


