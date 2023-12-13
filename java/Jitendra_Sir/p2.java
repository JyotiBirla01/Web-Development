// Max Contigous String 
public class p2 {
  public static void main(String[] args) {
    String s = "1100101110011001111";
    int count = 0, max = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '1') {
        count++;
       
      }

      else {
        if (count > max)
          max = count;
        count = 0;
       

      }
    }
    if (count > max)
      max = count;
    System.out.println(max);
  }
}
