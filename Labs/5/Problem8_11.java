import java.util.Scanner;

public class Problem8_11 {

	public static void main(String[] args) {
		int[][] max = new int[3][3];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int num = input.nextInt();
        String choice = decider(num);

        // put 1's and 0's using binary string
        int count = 0; 
        for (int i = 0; i < max.length; i++) {

            for (int k = 0; k < max[i].length; k++) {
                int coinSide = (choice.charAt(count++) == '0') ? 0 : 1;//either one or zero
                max[i][k] = coinSide;
            }
        }
        for (int i = 0; i < max.length; i++) {

            for (int k = 0; k < max[i].length; k++) {
                char side = (max[i][k] == 0)? 'H' : 'T';//choose between heads and tails
                System.out.print(side + " ");
            }
            System.out.println("");
        }

    }

    public static String decider(int n) {

        StringBuilder string = new StringBuilder();
        while (n != 0) {
        	string.append(n & 1);//append method to bring them together
            n = n >> 1;
        }
        while (string.length() < 9) {
        	string.insert(0, "0");//insert to the first spot
        }
        return string.toString();
    }


}