//The base and height of a triangle are in the ratio 8 : 5 and its area is 320 m². Find the height and base of the 
//triangle
public class Ass11 {
    public static void main(String[] args) {
        int base = 8, height = 5, area = 320;
        float arealet = 1 / 2f * base * height;
        float ans = area / arealet;
        System.out.println(Math.sqrt(ans));
    }
}
