package com.pbo;

public class BlockScope {
    public static void main(String[] args) {
        //code here canot use x
        { // this is a block
            //code here cannot use x

            int x = 100;

            //code here can use x
            System.out.println(x);
        } // the block ends here
         //code here cannot use x
    }
}

