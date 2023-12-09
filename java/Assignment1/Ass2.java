class Smallest {
    public static void main(String[] args) {
        int a = 10, b = 30, c = 35;
        int x = (a < b) ? a : b;
        int small = (x < c) ? x : c;
        System.out.println("The smallest number is :- " + small);

    }
}