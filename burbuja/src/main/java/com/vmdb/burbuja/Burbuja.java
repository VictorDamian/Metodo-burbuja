/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmdb.burbuja;

/**
 *
 * @author DantesMx
 */
public class Burbuja {
    public static void main(String [] args){
        int[] arreglo = {2,4,7,8,9,8,1,0,3,1};
        int[] array = burbuja(arreglo);
        for(int i=0; i<array.length;  i++){
            System.out.println(array[i]);
        }
    }
    
    public static int[] burbuja(int[] arreglo){
        int[] arreglo2;
        int aux;
        for(int i=0;i<arreglo.length; i++){
            for(int j=0; j<arreglo.length-1; j++){
                if(arreglo[j] > arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        arreglo2 = arreglo;
        return arreglo2;
    }
}
