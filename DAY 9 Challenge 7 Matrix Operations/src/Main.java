public class Main {
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7,8} };

        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
        int sum = 0;
        for (int i = 0; i <myNumbers.length; i++) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
            sum += myNumbers[i][j];
            }}
        System.out.println("The sum is: " + sum);
        int inversemyNumber[][]= new int[4][4];
        int k=0;
        int j=myNumbers.length-1;
        for (int i=0;i<myNumbers.length;i++){
            for( j = 0; j < myNumbers[i].length; ++j) {
            inversemyNumber[j][k]=myNumbers[i][j];
        }
            k++;
        }
        for (int i = 0; i < inversemyNumber.length; ++i) {
            for( j = 0; j < inversemyNumber[i].length; ++j) {
                System.out.println(inversemyNumber[i][j]);
            }
        }

    }
    }