import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS.");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*
         * System.out.println(curso1);
         * System.out.println(curso2);
         * System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " +
                devCamila.getConteudoInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("CAMILA PROGREDIU");
        System.out.println("Conteúdos Inscritos Camila: " +
                devCamila.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Camila: " +
                devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("------------");

        Dev devNatalia = new Dev();
        devNatalia.setNome("Natália");
        devNatalia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Natália: " +
                devNatalia.getConteudoInscritos());
        devNatalia.progredir();
        devNatalia.progredir();
        devNatalia.progredir();
        System.out.println("NATÁLIA PROGREDIU");
        System.out.println("Conteúdos Inscritos Natália: " +
                devNatalia.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Natália: " +
                devNatalia.getConteudosConcluidos());
        System.out.println("XP: " + devNatalia.calcularTotalXp());

    }
}
