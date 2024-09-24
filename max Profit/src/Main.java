public class Main {

    // WRITE THE MAXPROFIT METHOD HERE //
    //                                 //
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////
    public static int maxProfit(int[] prices){
        if(prices.length == 0 || prices.length<2){
            return 0;
        }

        int maxy = prices[0];
        int miny = 0;

        for(int i = 1;i<prices.length;i++){
            if(maxy > prices[i]){
                maxy = prices[i];
            }else{
                if(miny < (prices[i]-maxy)){
                    miny = prices[i]-maxy;
                }
            }
        }
        return miny;
    }



    public static void main(String[] args) {

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int profit1 = maxProfit(prices1);
        System.out.println("Test case 1: Maximum profit: " + profit1); // prints "Maximum profit: 5"

        int[] prices2 = {7, 6, 5, 4, 3, 2, 1};
        int profit2 = maxProfit(prices2);
        System.out.println("Test case 2: Maximum profit: " + profit2); // prints "Maximum profit: 0"

        int[] prices3 = {1, 2, 3, 4, 5, 6, 7};
        int profit3 = maxProfit(prices3);
        System.out.println("Test case 3: Maximum profit: " + profit3); // prints "Maximum profit: 6"

        int[] prices4 = {3, 2, 6, 5, 0, 3};
        int profit4 = maxProfit(prices4);
        System.out.println("Test case 4: Maximum profit: " + profit4); // prints "Maximum profit: 4"

        int[] prices5 = {2, 4, 1};
        int profit5 = maxProfit(prices5);
        System.out.println("Test case 5: Maximum profit: " + profit5); // prints "Maximum profit: 2"

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: Maximum profit: 5
            Test case 2: Maximum profit: 0
            Test case 3: Maximum profit: 6
            Test case 4: Maximum profit: 4
            Test case 5: Maximum profit: 2
        */

    }

}
