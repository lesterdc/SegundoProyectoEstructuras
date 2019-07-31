/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoproyectodeestructuras;

import TDAs_Proyecto.ArbolBinario;
import TDAs_Proyecto.NodeBinario;

/**
 *
 * @author Lesther Carranza
 */
public class SegundoProyectoDeEstructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBinario<String> hola=new ArbolBinario<>();
        hola.add("hola", "aqui");
        hola.recursiveInOrden();
    }
    
}
