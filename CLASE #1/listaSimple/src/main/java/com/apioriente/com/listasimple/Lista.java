/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apioriente.com.listasimple;

/**
 *
 * @author apioriente
 */
public class Lista {
    private Nodo inicio;
    private int tamanio;
    
    public void Lista()
    {
        inicio = null;
        this.tamanio =0;
        
    }
    
    public boolean esVacia()
    {
        return inicio==null;
        
    }
    
    public int getTamanio()
    {
        return tamanio;
    }
    
    public void AgregarFinal(int valor)
    {
      Nodo nuevo = new Nodo();
      nuevo.setValor(valor);
      if(esVacia())
      {
          inicio = nuevo;
          
      }
      else{
          Nodo aux = inicio;
          while(aux.getSiguiente()!=null)
          {
              aux = aux.getSiguiente();
          }
          
          aux.setSiguiente(nuevo);
          
      }
     this.tamanio++;
        
    }
    
    
    public void AgregarInicio(int valor)
    {
        Nodo nuevo= new Nodo();
        nuevo.setValor(valor);
       if(esVacia())
       {
           inicio = nuevo;
           
       }
       else
       {
           nuevo.setSiguiente(nuevo);
           inicio = nuevo ;
           
       }
       this.tamanio++;
    }
    
    public void insertarReferencia(int referencia, int valor)
    {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);

        if (!esVacia()) {
            if (Buscar(referencia)) {
                Nodo aux = inicio;
                while (aux.getValor() != referencia) {
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(nuevo);
                nuevo.setSiguiente(siguiente);
                this.tamanio++;

            }

        }


    }
    public boolean Buscar(int referencia)
    {
        Nodo aux = inicio;
        boolean encontrado  = false;
        
        while(aux!=null && encontrado!=true)
        {
           if(referencia == aux.getValor())
           {
               encontrado = true;
           }
           else{
               aux  = aux.getSiguiente();
           }
            
        }
        return encontrado;
    }
    
    public void removerPosicion(int posicion)
    {
        if(posicion>0 && posicion< tamanio)
        {
            if(posicion ==0)
            {
                
                inicio = inicio.getSiguiente();
            }
            else
            {
                Nodo aux = inicio;
                int contador=0;
                while(contador<posicion)
                {
                    aux = aux.getSiguiente();
                    contador++;
                }
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());

            }
            this.tamanio--;
                      
                        
        }
    }
    
    public void eliminar()
    {
        inicio = null;
        tamanio=0;
        
    }
    
    
    public void listar()
    {
        if(!esVacia())
        {
            Nodo aux = inicio;
            int i=1;
            while(aux!=null)
            {
                System.out.print(i+ ".["+ aux.getValor() + "]" + "-->");
                aux = aux.getSiguiente();
                i++;
            }
            
            
        }
    }
    
}
