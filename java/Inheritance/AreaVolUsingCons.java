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
    private Volume (int l,int w,int h){
        super(l,w);
this.h=h;
    }
    public int getVolume(){
        return getArea()*h;
    }


    public static void main(String[] args) {
        Volume v= new Volume(2,3,4);
        System.out.println(v.getArea());
        System.out.println(v.getVolume());
        


        }}

