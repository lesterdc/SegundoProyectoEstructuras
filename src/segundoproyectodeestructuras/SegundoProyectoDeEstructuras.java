/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoproyectodeestructuras;

import Juego.ControlArchivosIO;
import Juego.ControlJuego;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;
import tree.BinaryNode;
import tree.BinaryTree;


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
        /*HashMap<Integer,String> mapa=ControlArchivosIO.lecturaArchivo("veamos.txt");
        mapa.forEach((llave,valor)->System.out.println(llave+"=>"+valor));*/
        /*BinaryTree<String> arbol=new BinaryTree<>("perro");
        arbol.setLeft(new BinaryTree("SI"));
        arbol.setRight(new BinaryTree("mira"));
        arbol.getRight().setRight(new BinaryTree("Veamos"));
        arbol.getRight().setLeft(new BinaryTree("AQUI"));
        arbol.IterativeInOrden();
        BinaryTree<String> arbol2=new BinaryTree<>("otor");
        arbol2.setChildrenInLevel(new BinaryTree("vamos"),arbol2);
        arbol2.setChildrenInLevel(new BinaryTree("perroo "), arbol2);
        System.out.println(arbol2.countLeavesIterative());
        arbol2.IterativeInOrden();*/
        ControlJuego control=new ControlJuego();
        BinaryTree<String> arbol = control.constructorArbol();
        arbol.IterativeInOrden();
        System.out.println(arbol.iterativecountSons(arbol));
        HashMap<String,LinkedList<String>> respuestas = ControlArchivosIO.lecturaArchivoRespuestas("respuestas.txt");
        respuestas.forEach((texto,list)->System.out.println(texto+"=>"+list));
        //HashMap<Integer,String> preguntas = ControlArchivosIO.lecturaArchivo("preguntas.txt");
        //HashMap<Integer,String> respuestas = ControlArchivosIO.lecturaArchivo("respuestas.txt");
        
        /*Set<Integer> keypreguntas = preguntas.keySet();
        BinaryTree<String> arbol=new BinaryTree<>(preguntas.get(0));
        arbol.add(preguntas.get(0),preguntas.get(1));
        arbol.add(preguntas.get(1),preguntas.get(2));
        arbol.add(preguntas.get(2),preguntas.get(3));
        //arbol.setChildrens(new BinaryTree(preguntas.get(1)));
        System.out.println(arbol.countLeavesIterative());*//////////////////////
        //arbol.setChildrens(new BinaryTree(preguntas.get(2)));
        //System.out.println(arbol.countLeavesIterative());
        //arbol.setChildrenInLevel(new BinaryTree(preguntas.get(3)), arbol);
        /*System.out.println(arbol.searchNodo("sera").getContent());
        arbol.add("sera", "perrito");
        arbol.add("perrito", "caballo");
        arbol.add("sera","loro");
        arbol.add("perrito","Sofia");*/
        //arbol.IterativeInOrden();
        //arbol.getChildrens(new BinaryTree("VEE"));
        
        
    }
    
}
