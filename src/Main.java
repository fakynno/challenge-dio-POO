import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) throws DateTimeParseException {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Curso introdutório de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Angular");
        curso2.setDescricao("Curso introdutório de Angular");
        curso2.setCargaHoraria(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Angular");
        mentoria1.setDescricao("mentoria guiada nos principais aspectos do Angular");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de Java");
        mentoria2.setDescricao("mentoria guiada nos principais aspectos do java");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Mobile Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Mobile Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev dev1 = new Dev();
        dev1.setNome("Fabio Aquino");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo em que " + dev1.getNome() + " está escrito: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteúdo concluído até o momento por " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());

        Dev dev2 = new Dev();
        dev2.setNome("Gabriel Santos");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo em que " + dev2.getNome() + " está escrito: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteúdo concluído até o momento: " + dev2.getConteudosConcluidos());

    }
}
