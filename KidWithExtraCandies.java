/*
There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
*/

import java.util.ArrayList;

public class KidWithExtraCandies {
    public static void main(String[] args) {
        int [] arr = {2,3,5,1,3};
        int extraCandies =3;
        ArrayList<Boolean> res = getExtraCandies(arr,extraCandies);
        System.out.println(res);
    }

    private static ArrayList<Boolean> getExtraCandies(int[] arr, int extraCandies) {
        int max = -1;
        for(int i:arr){
            if(i>max){
                max =i;
            }
        }
        ArrayList<Boolean> res = new ArrayList<>();
        for(int i:arr){
            if(i+extraCandies>=max){
                res.add(true);
            }else {
                res.add(false);
            }
        }
        return res;
    }
}