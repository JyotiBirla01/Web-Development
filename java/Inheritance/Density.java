
 class Area {
    private int l;
    private int w;
    public Area(int l, int w){
        this.l=l;
        this.w=w;

    }
    public int getArea(){
        return l*w;
    }
    
}
class Volume extends Area{
    private int h;
    public Volume (int l,int w,int h){
        super(l,w);
this.h=h;
    }
    public int getVolume(){
        return getArea()*h;
    }

}
class Density extends Volume{
private float m;
public Density (int l,int w,int h,float m){
    super(l,w,h);
    this.m=m;

}   
public float getDensity(){
    return m/getVolume();
}}

class Main{
    public static void main(String[] args) {
        Density d= new Density(2,3,4,15);
        System.out.println(d.getArea());
        System.out.println(d.getVolume());
        System.out.println(d.getDensity());
        


        }}

