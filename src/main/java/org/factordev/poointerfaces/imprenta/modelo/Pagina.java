package org.factordev.poointerfaces.imprenta.modelo;

public class Pagina extends Hoja implements  Imprimible{

    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String Imprimir() {
        return this.contenido;
    }

    @Override
    public String imprimir() {
        return "";
    }
}
