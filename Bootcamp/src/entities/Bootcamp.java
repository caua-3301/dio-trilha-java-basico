package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Bootcamp {
    List<Curso> cursos = new ArrayList<>();
    List<Dev> devs = new ArrayList<>();

    public void mostrarDevs() {
        devs.forEach(System.out::println);
    }

    public void mostrarCursos() {
        cursos.forEach(System.out::println);
    }

    public void addCurso(Curso cursos) {
        this.cursos.add(cursos);
    }

    public void addListaCurso(List<Curso> cursos) {
        this.cursos.addAll(cursos);
    }

    public void addListaDevs(List<Dev> devs) {
        this.devs.addAll(devs);
    }

    public void removerCurso(int idCurso) {
        cursos.removeIf(curso -> curso.getId() == idCurso);
    }

    public void addDev(Dev dev) {
        devs.add(dev);
    }

    //aplicacao diferente
    public void removerDev(int idDev) {
        devs.removeIf(new Predicate<Dev>() {
            @Override
            public boolean test(Dev devs) {
                return devs.getId() == idDev;
            }
        });
    }
}
