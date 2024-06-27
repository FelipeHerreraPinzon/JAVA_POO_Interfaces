package org.factordev.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{
    private List<Imprimible> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        this.genero = genero;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Imprimible pagina){
        paginas.add(pagina);
        return this;
    }


    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(this.titulo).append("\n")
                .append("Autor: ").append(this.autor).append("\n")
                .append("Genero: ").append("\n");

        for(Imprimible pag: this.paginas){
            sb.append(pag.Imprimir()).append("\n");
        }
        return sb.toString();
    }


    @Override
    public String Imprimir() {
        return "";
    }
}
