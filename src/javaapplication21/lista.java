/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author ZARAT
 */
public class lista {
    private Nodo cabeza = null;
    private int longitud = 0;
    
    private class Nodo{
        public libro libro;
        public Nodo siguiente = null;
        
       public Nodo(libro libro){
       this.libro = libro;
        
        }
    }
    public void insertaprincipio (libro libro){
        Nodo nodo = new Nodo(libro);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud++;
    }
    public void insertarFinal(libro libro){
            Nodo nodo = new Nodo(libro);
        Nodo puntero = cabeza;
        while(puntero.siguiente != null){
    puntero = puntero.siguiente;
}
        puntero.siguiente = nodo;
        longitud++;
    }

    public void insertardespues(int n, libro libro){
Nodo nodo = new Nodo(libro);
if(cabeza ==null){
    cabeza = nodo;
}else {
    Nodo puntero = cabeza;
    int contador = 0;
    while (contador < n && puntero.siguiente != null){
        puntero = puntero.siguiente;
        contador++;
    }
    nodo.siguiente = puntero.siguiente;
    puntero.siguiente = nodo;
   
}
longitud++;
    }
    public libro obtener(int n){
        if(cabeza== null){
            return null;
        }else{
            Nodo puntero = cabeza;
            int contador = 0;
            while (contador <n && puntero.siguiente !=null ){
           puntero = puntero.siguiente;
           contador++;
        }
         if (contador != n){
             return null;
         }else{
             return puntero.libro;
         }
         }   
    
    }
    public int contar(){
        return longitud;
    }
    public boolean estavacio(){
        return cabeza == null;
    }
    public void eliminarprincipio(){
        if (cabeza !=null){
            Nodo primer = cabeza;
            cabeza = cabeza.siguiente;
            primer.siguiente = null;
            longitud--;
            
        }
    }
    public void eliminarultimo(){
        if(cabeza!= null){
        if(cabeza.siguiente == null){
            cabeza = null;
        }else{
            Nodo puntero = cabeza;
            while(puntero.siguiente.siguiente != null){
                puntero =  puntero.siguiente;
            }
            puntero.siguiente = null;
            }
            
        }
    }
    public void eliminarlibro(int n){
        if(cabeza !=null){
            if(n == 0){
             Nodo primer = cabeza;
             cabeza = cabeza.siguiente;
             primer.siguiente = null;
             longitud--;
            }else if (n < longitud){
                Nodo puntero = cabeza;
                int contador = 0;
                while (contador < (n - 1)){
                    puntero = puntero.siguiente;
                    contador++;
                }
                Nodo temp = puntero.siguiente;
                puntero.siguiente = temp.siguiente;
                temp.siguiente = null;
                longitud--;
                
                
            }
            }
        }
    }
    
 
            

        
       
    

    

