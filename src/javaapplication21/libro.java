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
public class libro {

    private String titulo;
    private String autor;
    private String isbn;
    public libro(String titulo, String autor, String isbn){
    this.titulo = titulo;
    this.autor = autor;
    this.isbn = isbn;
    }
    public String getTitulo(){return titulo;}
    public void settitulo(String titulo){this.titulo = titulo;}
    public String getAutor(){return  autor;}
    public void setautor(String autor){this.autor = autor;}
    public String getisbn(){return  isbn;}
    public void setisbn(String isbn){this.isbn = isbn;}
    
}

   
    

