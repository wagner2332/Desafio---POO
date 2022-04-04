import Domínio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Java POO");
        curso.setCargaHoraria(8);
        curso.setDescricao("Aprendendo o conceito de Orientacao a objetos com Java");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("Saiba mais");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Desenvolvimento em Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev wagner = new Dev();
        wagner.setNome("Wagner Wilson");
        wagner.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + wagner.getConteudosInscritos());
        wagner.progredir();
        System.out.println("------------------------------------------------------------" );
        System.out.println("Conteudos concluidos: " + wagner.getConteudosConcluidos());
        System.out.println("- - - - - - - ");
        System.out.println("XP: " + wagner.calcularTotalXp());






    }
}
