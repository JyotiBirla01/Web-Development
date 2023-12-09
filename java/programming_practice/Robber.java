
/*  You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

 

Example 1:

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
Example 2:

Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.
 

Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 400
Accepted
1.7M
Submissions
3.5M
Acceptance Rate
49.8%
Discussion (73)*/
import java.util.Scanner;

class Robber {
    public int amount(int houseArr[]) {
        int sumOdd = 0, sumEven = 0;
        for (int i = 0; i < houseArr.length; i++) {
            if (i % 2 != 0) {
                sumOdd = sumOdd + houseArr[i];
            }
            if (i % 2 == 0) {
                sumEven = sumEven + houseArr[i];
            }

        }
        if (sumOdd > sumEven)
            return sumOdd;
        else
            return sumEven;
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of house  ");
        int house = sc.nextInt();
        int houseArr[] = new int[house];
        System.out.println("Enter the number of house ");
        for (int i = 0; i < houseArr.length; i++) {
            houseArr[i] = sc.nextInt();

        }
        // System.out.println("Enter the size of money");
        // int money = sc.nextInt();
        // int moneyArr[] = new int[money];
        // System.out.println("Enter the money");
        // for (int i = 0; i < moneyArr.length; i++) {
        // moneyArr[i] = sc.nextInt();

        // }
        Robber obj = new Robber();
        System.out.println("total amount that is robber rob");
        System.out.println(obj.amount(houseArr));
    }

}