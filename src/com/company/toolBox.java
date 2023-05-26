//Owen Riske

package com.company;

import java.util.Random;


public class toolBox {
    public static int randomPosition(int min, int max){
        Random rand=new Random();
        return rand.nextInt(max+min)-min;
    }


}
