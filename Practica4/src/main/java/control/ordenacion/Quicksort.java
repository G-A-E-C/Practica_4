/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control.ordenacion;

import control.ed.lista.ListaEnlazada;

/**
 *
 * @author gabrielalejandroespinzacoronel
 */
public class Quicksort {
    private int tipo;
    
    private void cambiar(Double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int particion(Double[] arr, int low, int high) {
        double pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (this.tipo == 0 ? arr[j] < pivot : arr[j] > pivot) {

                i++;
                cambiar(arr, i, j);
            }
        }
        cambiar(arr, i + 1, high);
        return (i + 1);
    }

    public void ordenarQuick(Double[] arr, int low, int high) {
        if (low < high) {

            int pi = particion(arr, low, high);

            ordenarQuick(arr, low, pi - 1);
            ordenarQuick(arr, pi + 1, high);
        }
    }
    
    public ListaEnlazada<Double> quickSort(ListaEnlazada<Double> lista, int tipo) {
        
        this.tipo = tipo;
        
        Double[] aux = lista.toArray();
        
        ordenarQuick(aux, 0, aux.length - 1);
        
        return lista.toList(aux);
    }
}