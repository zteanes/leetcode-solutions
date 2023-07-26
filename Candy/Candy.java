package Candy;

import java.util.Arrays;

class Candy {
    /**
     * Solution to the candy question in candy.txt
     * 
     * @param ratings the ratings of the children
     * @return        the minimum number of candies to give
     */
    public int candy(int[] ratings) {
        // first, if ratings is null we can just return 0
        if (ratings == null || ratings.length == 0) return 0;

        // create an array to represent the candies to give starting with 1
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1); // fill with 1

        // go from left to right, if the current is greater than the previous,
        // add 1 to the current
        for(int i = 1; i < ratings.length; i++){ // iterate to start at 1 and go until end
            if(ratings[i] > ratings[i - 1]){ // if current is greater than previous
                candies[i] = candies[i - 1] + 1; // add 1 to current
            }
        }

        // go from right to left, if the current is greater than the next,
        // add 1 to the current
        for(int i = ratings.length - 1; i > 0; i--){ // iterate right to left
            if(ratings[i - 1] > ratings[i]){ // if the rating of the left > right
                if(candies[i - 1] <= candies[i]){ // if the num candies of the left less or equal
                    candies[i - 1] = candies[i] + 1; // make left 1 greater than right
                }
            }
        }

        // sum up the candies
        int sum = 0;
        for(int i = 0; i < candies.length; i++){
            sum += candies[i];
        }

        return sum; // return the sum of minimal candies
    }

    /**
     * Main method to test the candy method
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Candy candy = new Candy();

        // Test cases
        int[] ratings1 = {1, 0, 2};
        int[] ratings2 = {1, 2, 2};
        int[] ratings3 = {4, 2, 3, 4, 1};
        
        // results from candy
        int result1 = candy.candy(ratings1);
        int result2 = candy.candy(ratings2);
        int result3 = candy.candy(ratings3);

        // print out the results
        System.out.println("Minimum candies for ratings1: " + result1); // Output should be 5
        System.out.println("Minimum candies for ratings2: " + result2); // Output should be 4
        System.out.println("Minimum candies for ratings3: " + result3); // Output should be 9

        // assert the results to be right
        assert result1 == 5;
        assert result2 == 4;
        assert result3 == 9;
    }
}