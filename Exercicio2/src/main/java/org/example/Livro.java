package org.example;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void exibirDetalhes() {
        System.out.println("Livro: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas);
    }

    public String getAutor() {
        return autor;
    }
}