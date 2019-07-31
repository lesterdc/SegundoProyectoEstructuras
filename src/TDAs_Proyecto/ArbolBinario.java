/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAs_Proyecto;

/**
 *
 * @author Lesther Carranza
 */
public class ArbolBinario<E> {
    private NodeBinario<E> root;
    
    public ArbolBinario(){
        this.root=null;
    }
    
    private NodeBinario<E> getRoot(){
        return this.root;
    }
    
    public ArbolBinario(NodeBinario<E> root){
        this.root=root;
    }
    
    public ArbolBinario(E data){
        this.root=new NodeBinario(data);
    }
    
    public boolean isEmpty(){
        return root==null;
    }
    /*Lo separare de dos para abtraerme el ingreso de la raiz y tener mas limpio el codigo*/
    private NodeBinario<E> searchNode(E element){
        return searchNodeRecursivo(element,this.root);
    }
    
    private NodeBinario<E> searchNodeRecursivo(E element,NodeBinario<E> arbol){
        if(isEmpty() | element==null)
            return null;
        else if(arbol.getData().equals(element)){
            return arbol;
        }
        NodeBinario<E> i = searchNodeRecursivo(element,arbol.getLeft().getRoot());
        NodeBinario<E> j = searchNodeRecursivo(element,arbol.getRight().getRoot());
        if(i==null && j == null){
            return null;
        }else{
            if(i==null){
                return j;
            }else{
                return i;
            }
        }
    }
    
    public boolean add(E padre, E element){
        ArbolBinario<E> nodo=new ArbolBinario<>(element);
        if(padre==null && isEmpty() && element!=null){   //Pues si no hay nadie y solo el arbol fue declarado pero no inicializado el primero sera 
            this.root=nodo.getRoot();
            return true;
        }else if(padre!=null && element != null && !isEmpty() && searchNode(element) == null){ //El searchNode es para asegurarme de que no exista previamente y no llenar de mas el arbol
            NodeBinario<E> ref = searchNode(padre);
            if(ref==null){
                return false;
            }
            if(ref.getLeft()==null){
                ref.setLeft(nodo);
                nodo.getRoot().setPadre(ref);
                return true;
            }else if(ref.getRight()==null){
                ref.setRight(nodo);
                nodo.getRoot().setPadre(ref);
                return true;
            }
            return false;
        }
        return false;
    }
}
