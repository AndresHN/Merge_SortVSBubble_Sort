package com.company;

public class Main {

    public static void main(String[] args) {
        int[] vector = {47, 56, 60, 61, 63, 65, 66, 68, 69, 70, 73, 76, 77,1, 4, 7, 8, 9, 14, 23, 47, 56, 60, 61, 63, 65, 66, 68, 69, 70, 73, 76, 77,1, 4, 7, 8, 9, 14,
                23, 47, 56, 60, 61, 63, 65, 66, 68, 1, 4, 7, 8, 9, 14, 23, 47, 56, 60, 61, 63, 65, 66, 68, 69, 70, 73, 76, 77,1, 4, 7, 8, 9, 14, 23, 47, 56, 60, 61, 63, 65, 66, 68, 69, 70, 73, 76, 77
                ,1, 4, 7, 8, 9, 14, 23, 47, 56, 60, 61, 63, 65, 66, 68, 69, 70, 73, 76, 77,1, 4, 7, 8, 9, 14, 23, 47, 56, 60, 61, 63, 65, 66, 68, 69, 70, 73, 76, 77,1, 4, 7, 8, 9, 14,
                23, 47, 56, 60, 61, 63, 65, 66, 68, 69,47, 56, 60, 61, 63, 65, 66, 68, 69, 70, 73, 76, 77,1, 4, 7, 8, 9, 14, 23, 47, 56, 60, 61, 63, 65, 66, 68, 69, 70, 73, 76, 77,1, 4, 7, 8, 9, 14,
                23, 47, 56, 60, 61, 63, 65, 66, 68, 1, 4, 7, 8, 9, 14, 23, 47, 56, 60, 61, 63, 65, 66, 68, 69, 70, 73, 76, 77,1, 4, 7, 8, 9, 14, 23, 47, 56, 60, 61, 63, 65, 66, 68, 69, 70, 73, 76, 77
                ,1, 4, 7, 8, 9, 14, 23, 47,47, 56, 60, 61, 63, 65, 66, 68, 69, 70, 73, 76, 77,1, 4, 7};


        int[] arr = {1, 2, 3, 4, 5,6, 7, 8, 9};
        Main m = new Main();
        long startTime = System.nanoTime();
        //Para comprobar el tiempo de ejecucion intercambiar los metodos de bubble o merge sort y recibe el arreglo de tamaño n
        arr = m.mergeSort(vector);
        long endTime = System.nanoTime() - startTime;

        System.out.println("Tiempo medido en un arreglo de tamaño " + vector.length);
        System.out.println("tiempo en nano segundos:" + endTime);
    }

    // BubbleSort codigo
    public int [] bubbleSort(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    // a y b estan ordenados
    public int[] merge(int []a, int[]b){
        int [] c = new int[a.length + b.length];
        int j =0, k = 0, i;
        for (i = 0; i < c.length && j < a.length && k < b.length; i++) {
            if(a[j] < b[k]){
                c[i] = a[j++];
            }
            else{
                c[i] = b[k++];
            }

        }

        for(; i< c.length;i++){
            if(j<a.length){
                c[i] = a[j++];
            }
            if(k<b.length){
                if(k<b.length){
                    c[i] = b[k++];
                }
            }
        }

        return c;
    }

    public int [] mergeSort(int[] arr){
        // caso base
        if(arr.length == 1)
            return arr;

        int[] parteInferior = new int[arr.length/2];
        int[] parteSuperior = new int[arr.length - parteInferior.length];
        int i = 0;

        for (; i < parteInferior.length; i++) {
            parteInferior[i] = arr[i];
        }

        for (int j = 0; j < parteSuperior.length; j++) {
            parteSuperior[j] = arr[i+j];
        }

        // parte recursiva del caso recursivo

        return merge(mergeSort(parteInferior), mergeSort(parteSuperior));
    }
}