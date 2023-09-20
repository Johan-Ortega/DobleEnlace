
package dobleenlace;

import javax.swing.JOptionPane;

public class Lista_doble {

   
    public static void main(String[] args) {
        ListaD lista = new ListaD();
        int opcion = 0, elemento;
        
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                      "1. Agregar un nodo al inicio\n"
                                    + "2. Agregar un nodo al final\n"
                                    + "3. Mostrar la lista de inicio a fin\n"
                                    + "4. Mostrar la lista de fin a inicio\n"
                                    + "5. Salir\n"
                                    + "¿Qué deseas hacer?", "Menú de opciones",
                                    JOptionPane.INFORMATION_MESSAGE));
                
                switch(opcion){
                    case 1:
                        try{
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del nodo", "Agregando Nodo al inicio",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.agregarAlInicio(elemento);
                        }catch(NumberFormatException n){
                            JOptionPane.showInternalMessageDialog(null, "Error" + n.getMessage());
                        }
                        break;
                        
                    case 2:
                        try{
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del nodo", "Agregando Nodo al final",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.agregarAlFinal(elemento);
                        }catch(NumberFormatException n){
                            JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                        }
                        break;
                        
                    case 3:
                        if(!lista.estaVacia()){
                            lista.MostrarListaInicioFin();
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay nodos aun",
                                    "Lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 4:
                        if(!lista.estaVacia()){
                            lista.MostrarListaFinInicio();
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay nodos aun",
                                    "Lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 5:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "La opcion no esta en el menú",
                                "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            }
        }while(opcion != 5);
    }
    
}
