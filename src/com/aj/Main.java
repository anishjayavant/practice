package com.aj;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    static int NUMCOUNT = 10;

    public static void main(String[] args) {
        Random r = new Random(0);
        List<Integer> input = new LinkedList<>();
	    for(int i = 0 ; i < NUMCOUNT; i++){
	        input.add(r.nextInt());
        }

        //compute mean
        int mean = input.stream().mapToInt(i -> i).sum();

        System.out.println("#s are ");
        input.stream().forEach(i -> System.out.println(i));
        System.out.println("Mean is: " + mean);
    }


}
