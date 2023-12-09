interface B {
     Number m();
}
class Main{
    public static void main(String[] args) {
      B obj=  () -> 7 * 12.0;
      System.out.println(obj.m());

}

}