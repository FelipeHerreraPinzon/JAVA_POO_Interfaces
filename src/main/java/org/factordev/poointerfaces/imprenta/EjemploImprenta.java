package org.factordev.poointerfaces.imprenta;

import org.factordev.poointerfaces.imprenta.modelo.Curriculo;
import org.factordev.poointerfaces.imprenta.modelo.Hoja;
import org.factordev.poointerfaces.imprenta.modelo.Informe;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Juan Felipe", "Desarrollador", "resumen laboral");
        cv.addExperiencia("Java");
        cv.addExperiencia("Oracle DBA");
        cv.addExperiencia("Spring Framework");
        cv.addExperiencia("Desarrollador Full Stack");
        cv.addExperiencia("Angular");

        Informe informe = new Informe("Bill Gates", "Jamez R", "Estudio sobre micoservicios");
        imprimir(cv);
        imprimir(informe);
    }

    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.Imprimir());
    }
}
