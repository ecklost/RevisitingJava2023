/* 
Project Euler 62

The cube, 41063625 (3453), can be permuted to produce two other cubes: 56623104 (3843) and 66430125 (4053). In fact, 41063625 is the smallest cube which has exactly three permutations of its digits which are also cube.

Find the smallest cube for which exactly five permutations of its digits are cube.

*/
package p062;

import java.math.BigInteger;

public class P062 {
    static final int MAX_SIZE = 10000;
    
    public static void main(String[] args) {
        BigInteger[] cubes = new BigInteger[MAX_SIZE];
        String[] cubesPerm = new String[MAX_SIZE];
        
        for (int i = 0; i < MAX_SIZE; i++) {
            BigInteger biCubes = new BigInteger("" + i);
            cubes[i] = biCubes.pow(3);
        }
        
        
        for (int x = 0; x < MAX_SIZE; x++) {
            String sCube = "" + cubes[x];
            char[] cCube = sCube.toCharArray();
            int i = 1;
            while (i < sCube.length()) {
                int j = i;
                while (j > 0 && cCube[j - 1] > cCube[j]) {
                    char swap = cCube[j];
                    cCube[j] = cCube[j-1];
                    cCube[j-1] = swap;
                    j--;
                }
                i++;
            }
            cubesPerm[x] = new String(cCube);
            System.out.println(x + ": " + cubesPerm[x]);
        }
        
        for (int i = 0; i < MAX_SIZE; i++) {
            String perm = cubesPerm[i];
            int counter = 0;
            for (int j = i+1; j < MAX_SIZE; j++) {
               if ( cubesPerm[i].equals(cubesPerm[j]) ) { 
                   counter++;
               }
            }
            if (counter == 4) { System.out.println(cubes[i]); break; }
        }
    }
    
}
