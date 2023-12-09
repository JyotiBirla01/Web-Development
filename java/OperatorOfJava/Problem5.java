public class Problem5 {
    public static void main(String[] args) {
        int num = 12345, firstnum, lastsecondnum, c;
        firstnum = num / 10000;
        System.out.println(firstnum);
        lastsecondnum = (num / 10) % 10;
        // c = num % 100;
        System.out.println(lastsecondnum);
        c = firstnum + lastsecondnum;
        System.out.println("The sum of two number is :- " + c);

    }
}
