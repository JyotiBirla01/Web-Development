

 class Practice_Ass {
   static  int a=10;
   int b=20;

   public void m1(){
    //local varible
    //System.out.println(a);
       System.out.println(a);
    int b=22;
    System.out.println(b);
   }
   

}
class Test{
     public static void main(String[] args) {
    Practice_Ass obj =new Practice_Ass() ;
    obj.m1();   
    }

    
}
