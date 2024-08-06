package application;

import entities.Bootcamp;
import entities.Curso;
import entities.Dev;
import enums.OpcaoDeLinguagemEDificuldade;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Curso javaBasico = new Curso(1, "Java Basico","Introducao ao Java", OpcaoDeLinguagemEDificuldade.JAVA);
        Curso cBasico = new Curso(2, "C introdutorio","Introducao ao C", OpcaoDeLinguagemEDificuldade.C);

        Dev dev1 = new Dev(1, "Caua", "caua@gmail.com");
        Dev dev2 = new Dev(2, "Jose", "jose@gmail.com");

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.addListaCurso(Arrays.asList(javaBasico, cBasico));
        bootcamp.addListaDevs(Arrays.asList(dev2, dev1));

        bootcamp.mostrarDevs();
        bootcamp.mostrarCursos();
    }
}
