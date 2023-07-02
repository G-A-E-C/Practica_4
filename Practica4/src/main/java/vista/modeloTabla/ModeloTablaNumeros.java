package vista.modeloTabla;

import control.ed.lista.ListaEnlazada;


import javax.swing.table.AbstractTableModel;

public class ModeloTablaNumeros extends AbstractTableModel {
    
    ListaEnlazada<Double> numeros;
    public ListaEnlazada<Double> getNumeros() {
        return numeros;
    }

    public void setNumeros(ListaEnlazada<Double> numeros) {
        this.numeros = numeros;
    }
    public int getRowCount() {
        return numeros.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int arg0, int arg1) {
        Double n = null;
        try{
            n = numeros.get(arg0);
        }catch(Exception e){

        }
        switch (arg1) {
            case 0:
                return n;
            default:
                return null;
        }
    }
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Numeros";
            default:
                return null;
        }
    }
}
