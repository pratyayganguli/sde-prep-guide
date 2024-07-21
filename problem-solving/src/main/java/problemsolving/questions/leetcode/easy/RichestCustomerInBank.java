package problemsolving.questions.leetcode.easy;


/**
 *
 * data representation of money of the customer in different bank accounts.
 *                  bank 1      bank 2      bank 3
 *  customer 1
 *  customer 2
 *  customer 3
 */

class RichestCustomerInBank {

    static int getRichestCustomer(int[][] customerBankArr) {
        int amountInEachBank = 0;
        int maxAmount = 0;
        for (int i = 0; i < customerBankArr.length; i++) {
            for (int j = 0; j < customerBankArr[i].length ; j++) {
                amountInEachBank = amountInEachBank + customerBankArr[i][j];
            }

            if(i > 0) {
                if(maxAmount < amountInEachBank) {
                    maxAmount = amountInEachBank;
                }
            }

            amountInEachBank = 0;
        }
        return maxAmount;
    }


    public static void main(String [] args) {
        int [][] data = new int[][] {
                {1, 2, 3},
                {7, 8, 9},
                {10, 20, 30}
        };
        int maxAmount = getRichestCustomer(data);
        System.out.println(maxAmount);
    }


}
