
 class AreaOfCircle {
     private int radius ;
private float pi=3.14f;
public void setArea(int radius , float pi){
this.radius = radius;
this.pi= pi;
}
public float  display(){
   return pi*radius*radius;
}
}
class volumeOfCylinder{
public void setVolume(int radius ,float pi, int height ){
setArea(radius ,pi);
 this.height =height;

}
}
