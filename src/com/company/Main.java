//Owen Riske

package com.company;


public class Main {

    public static void main(String[] args) {
        int max=100;
        int min=0;
        double success=0;
        double failure=0;
        for (int i = 0; i < 999999; i++) {
            int candle1=toolBox.randomPosition(min,max);
            int candle2=toolBox.randomPosition(min,max);
            int cut=toolBox.randomPosition(min,max);
            if(candle1<cut && cut<candle2 || candle1>cut && cut>candle2){
                success++;
            }
            else{
                failure++;
            }

        }
        System.out.println(success/failure*100+"%");
    }
}
