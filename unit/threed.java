/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit;
import java.util.*;
/**
 *
 * @author Desktop Pc
 */
public class threed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // create a 3d array
        int[][][] test = {
            {
              {1, -2, 3}, 
              {2, 3, 4}
            }, 
            { 
              {-4, -5, 6, 9}, 
              {1}, 
              {2, 3}
            } 
        };

      
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }
    }
}
    

