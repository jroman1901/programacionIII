/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apioriente.com.arbolbiniario;

/**
 *
 * @author apioriente
 */
public class Arbol {

    Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    public void Insertar(int valor) {
        raiz = insertarArbol(raiz, valor);

    }

    public Nodo insertarArbol(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;

        }

        if (valor < raiz.dato) {
            raiz.izquierdo = insertarArbol(raiz.izquierdo, valor);

        } else if (valor > raiz.dato) {
            raiz.derecho = insertarArbol(raiz.derecho, valor);
        }

        return raiz;

    }

    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            return false;
        }

        if (valor == raiz.dato) {
            return true;
        }

        if (valor < raiz.dato) {
            return buscarRec(raiz.izquierdo, valor);
        } else {
            return buscarRec(raiz.derecho, valor);
        }
    }

    public void preOrden() {
        preOrdenRec(raiz);
    }

    private void preOrdenRec(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.dato + " ");
            preOrdenRec(raiz.izquierdo);
            preOrdenRec(raiz.derecho);
        }
    }

    public void inOrden() {
        inOrdenRec(raiz);
    }

    private void inOrdenRec(Nodo raiz) {
        if (raiz != null) {
            inOrdenRec(raiz.izquierdo);
            System.out.print(raiz.dato + " ");
            inOrdenRec(raiz.derecho);
        }
    }

    public void postOrden() {
        postOrdenRec(raiz);
    }

    private void postOrdenRec(Nodo raiz) {
        if (raiz != null) {
            postOrdenRec(raiz.izquierdo);
            postOrdenRec(raiz.derecho);
            System.out.print(raiz.dato + " ");
        }
    }

}
