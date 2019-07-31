/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAs_Proyecto;

/**
 *
 * @author LestherCarranza
 */
public class NodeBinario<E> {
    private E data;
    private ArbolBinario<E> left;
    private ArbolBinario<E> right;
    private boolean isQuestion;
    private NodeBinario<E> father;
    
    public NodeBinario(){
        this(null,null,null);
    }
    
    public NodeBinario(E data){
        this(data,null,null);
    }
    public NodeBinario(E data,ArbolBinario<E> left,ArbolBinario<E> right){
        this.data=data;
        this.left=left;
        this.right=right;
        this.isQuestion=true;
        this.father=null;
    }
    
    public NodeBinario<E> getPadre(){
        return this.father;
    }
    
    public void setPadre(NodeBinario<E> padre){
        this.father=padre;
    }
    
    public E getData(){
        return this.data;
    }
    
    public void setData(E data){
        this.data=data;
    }
    
    public ArbolBinario<E> getLeft(){
        return this.left;
    }
    
    public void setLeft(ArbolBinario<E> left){
        this.left=left;
    }
    
    public ArbolBinario<E> getRight(){
        return this.right;
    }
    
    public void setRight(ArbolBinario<E> right){
        this.right=right;
    }
    
    public boolean getIsQuestion(){
        return this.isQuestion;
    }
    
    public void setIsQuestion(boolean isQuestion){
        this.isQuestion=isQuestion;
    }
    
    @Override
    public String toString(){
        return this.data.toString();
    }
    
    
}
