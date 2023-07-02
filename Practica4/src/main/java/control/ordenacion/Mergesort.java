/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control.ordenacion;

import control.control;
import control.ed.lista.ListaEnlazada;


/**
 *
 * @author gabrielalejandroespinzacoronel
 */
public class Mergesort {
    
    private int tipo;
    
    private void merge(Double arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        double L[] = new double[n1];
        double R[] = new double[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (this.tipo == 0 ? L[i] <= R[j] : L[i] >= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public void ordenarMerge(Double arr[], int l, int r) {
        if (l < r) {

            int m = l + (r - l) / 2;

            ordenarMerge(arr, l, m);
            ordenarMerge(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }
    
    public ListaEnlazada<Double> mergeSort(ListaEnlazada<Double> lista, int tipo) {

        this.tipo = tipo;
        
        Double[] aux = lista.toArray();

        ordenarMerge(aux, 0, aux.length - 1);

        return lista.toList(aux);
        

    }
    

}
