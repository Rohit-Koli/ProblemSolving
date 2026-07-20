package com.LeetCodeSolutions;
/*
* Best Time to Buy and Sell Stock
* */
public class Problem121 {

    public static int maxProfit(int[] prices) {
        int buyIndex=-1;
        int maxBuyPrice=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buyIndex==-1 &&i+1<prices.length && prices[i]<prices[i+1]){
                buyIndex = i;
                i++;
            }
            if(buyIndex!=-1 && prices[i]>maxBuyPrice){
                maxBuyPrice=prices[i];
            }
        }
        if(buyIndex==-1){
            return 0;
        }
        return maxBuyPrice-prices[buyIndex];
    }

    public static void main(String[] args) {
        int[] arr={2,1,2,1,0,1,2};
        System.out.println(maxProfit(arr));
    }
}
