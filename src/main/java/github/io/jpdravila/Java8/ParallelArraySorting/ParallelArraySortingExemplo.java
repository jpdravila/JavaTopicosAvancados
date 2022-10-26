package github.io.jpdravila.Java8.ParallelArraySorting;

import java.util.Arrays;

public class ParallelArraySortingExemplo {

    public static void main(String[] args){
        int[] meu_array = {5, 8, 1, 0, 6, 9, 50, -3};

        for(int i : meu_array){
            System.out.print(i + " ");
        }

        Arrays.parallelSort(meu_array, 0 , 4);

        System.out.println();

        for(int i : meu_array){
            System.out.print(i + " ");
        }

    }

}

/*
public static void main(String[] args){
        double[] meu_array = {5, 8, 1, 0.009 ,0, 6, 9,50, -3};

        for(double i : meu_array){
            System.out.print(i + " ");
        }

        Arrays.parallelSort(meu_array);

        System.out.println();

        for(double i : meu_array){
            System.out.print(i + " ");
        }

    }
   */
