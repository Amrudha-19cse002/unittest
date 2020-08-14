/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit;

/**
 *
 * @author Desktop Pc
 */
public class twod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        //declare an array of int 
        int[][] intArray = new int[3][3];
        System.out.println("Array elements are:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                intArray[i][j] = i+1;           
                System.out.print(intArray[i][j] + " "); 
            }
            System.out.println();
        }
    }
}
    
    

