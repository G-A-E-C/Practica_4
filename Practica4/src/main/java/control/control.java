/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import control.ed.lista.ListaEnlazada;
import control.ordenacion.Mergesort;
import control.ordenacion.Quicksort;
import java.util.Random;

/**
 *
 * @author gabrielalejandroespinzacoronel
 */
public class control {
    private ListaEnlazada<Double> numeros;
    private Mergesort merge = new Mergesort();
    private Quicksort quick = new Quicksort();
    
    public control () {
        numeros = new ListaEnlazada<>();
        addRandomNumbers(numeros);
    }
    public ListaEnlazada<Double> getNumeros() {
        return numeros;
    }

    public void setNumeros(ListaEnlazada<Double> numeros) {
        this.numeros = numeros;
    }
    
    public void addRandomNumbers(ListaEnlazada<Double> lista){
        Random random = new Random();
        for (int i = 0; i < 20000; i++) {
            lista.insertar(random.nextDouble() * 100);
        }
    }
    public void ordenar(int tipo, int metodo) {

        if (metodo == 0) {
            this.numeros = quick.quickSort(numeros, tipo);
        } else {
            this.numeros = merge.mergeSort(numeros, tipo);
        }

    }
    
    /*
    public void quickSort() {
        
        Double[] aux = numeros.toArray();

        nes.ordenarQuick(aux, 0, aux.length - 1);

        numeros = numeros.toList(aux);
    }*/
    
}
        
