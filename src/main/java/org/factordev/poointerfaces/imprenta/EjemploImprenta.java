package org.factordev.poointerfaces.imprenta;
import static org.factordev.poointerfaces.imprenta.modelo.Genero.*;

import org.factordev.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Juan Felipe", "Desarrollador", "resumen laboral");
        cv.addExperiencia("Java");
        cv.addExperiencia("Oracle DBA");
        cv.addExperiencia("Spring Framework");
        cv.addExperiencia("Desarrollador Full Stack");
        cv.addExperiencia("Angular");

        Libro libro = new Libro("steve jobs", "patrones de disenio: Elem reusables", PROGRAMACION);

        libro.addPagina(new Pagina("patron singleton"))
                .addPagina(new Pagina("patron observer"))
                .addPagina(new Pagina("patron factory"))
                .addPagina(new Pagina("patron Composite"))
                .addPagina(new Pagina("patron Facade"));

        Informe informe = new Informe("Bill Gates", "Jamez R", "Estudio sobre micoservicios");
        Imprimir(cv);
        Imprimir(informe);
        Imprimir(libro);
    }

    public static void Imprimir(Imprimible imprimible){
        System.out.println(imprimible.Imprimir());
    }
}
