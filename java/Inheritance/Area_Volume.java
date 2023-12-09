 class Area {
    private int l;
    private int w;
    public void setData(int l,int w){
this.l=l;
this.w=w;
     }
    public int  getArea(){
        return (l*w);
    }
}
class Volume extends Area{
    private int h;
    public void setData(int l,int w,int h){
        setData(l, w);
        this.h=h;


    }
    public int  getVolume(){
        return getArea()*h;
    }

}
class Main{
    public static void main(String[] args) {
        Volume v= new Volume();
        v.setData(2, 3, 4);
        System.out.println(v.getArea());
        System.out.println(v.getVolume());
    }
}
