/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.util.HashMap;
import java.util.Set;
import tree.BinaryTree;

/**
 *
 * @author Lesther Carranza
 */
public class ControlJuego {
    
    public BinaryTree<String> constructorArbol(){
        HashMap<Integer,String> preguntas = ControlArchivosIO.lecturaArchivo("preguntas.txt");
        //HashMap<Integer,String> respuestas = ControlArchivosIO.lecturaArchivo("respuestas.txt");
        
        Set<Integer> keypreguntas = preguntas.keySet();
        BinaryTree<String> arbol=new BinaryTree<>(preguntas.get(0));
        for(Integer i:keypreguntas){
            if(i!=0){
                arbol.setChildrens(new BinaryTree(preguntas.get(i)));
            }
        }
        return arbol;
    }
}
