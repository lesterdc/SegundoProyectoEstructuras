/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;
import tree.BinaryTree;

/**
 *
 * @author Lesther Carranza
 */
public class ControlJuego {
    
    public BinaryTree<String> constructorArbol(){
        HashMap<Integer,String> preguntas = ControlArchivosIO.lecturaArchivo("preguntas.txt");
        HashMap<String,LinkedList<String>> respuestas = ControlArchivosIO.lecturaArchivoRespuestas("respuestas.txt");
        
        Set<Integer> keypreguntas = preguntas.keySet();
        BinaryTree<String> arbol=new BinaryTree<>(preguntas.get(0));
        keypreguntas.stream().filter((i) -> (i!=0)).forEachOrdered((i) -> {
            arbol.setChildrens(new BinaryTree(preguntas.get(i)));
        });
        respuestas.forEach((resp,lista)->arbol.add(resp,lista));
        return arbol;
    }
    
    /*private void setAnswer(BinaryTree<String> arbol,LinkedList<String> answers,String data){
        BinaryTree<String> tmp=arbol;
        String ultimo=answers.get(answers.size()-1);
        for(int i=0;i<=answers.size()-1;i++){
            if(answers.removeFirst().equals("si")){
                tmp=tmp.getRight();
            }else{
                tmp=tmp.getLeft();
            }
        }
        String string=tmp.getRoot().getContent();
        if(answers.removeLast().equals(ultimo)){
            arbol.add(string,data);
        }else{
            arbol.add(string, data);
        }
    }*/
}
