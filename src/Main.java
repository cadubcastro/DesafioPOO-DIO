import java.time.LocalDate;

import br.com.cadubcastro.desafioPOO.dominio.Bootcamp;
import br.com.cadubcastro.desafioPOO.dominio.Curso;
import br.com.cadubcastro.desafioPOO.dominio.Dev;
import br.com.cadubcastro.desafioPOO.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Fundamentos da Programação Orientada a Objetos com Java");
		curso1.setDescricao("---");
		curso1.setCargaHoraria(3);
		
		//System.out.println(curso1);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Pilares da Programação Orientada a Objetos em Java");
		curso2.setDescricao("---");
		curso2.setCargaHoraria(2);
		
		//System.out.println(curso2);
		
		Curso curso3 = new Curso();
		curso3.setTitulo("Conhecendo Collections Java");
		curso3.setDescricao("---");
		curso3.setCargaHoraria(4);
		
		//System.out.println(curso3);
		
		Curso curso4 = new Curso();
		curso4.setTitulo("Ganhando Produtividade com Stream API");
		curso4.setDescricao("---");
		curso4.setCargaHoraria(3);
		
		//System.out.println(curso4);
		

		//*******************************************************//
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Desenvolvendo APIs e Microsserviços na Claro");
		mentoria.setDescricao("Descubra como a Claro desenvolve e gerencia APIs e microsserviços para oferecer soluções ágeis e escaláveis. Nesta mentoria, abordaremos os princípios fundamentais do desenvolvimento de APIs e a arquitetura de microsserviços, destacando sua importância na modernização e eficiência dos serviços.");
		mentoria.setData(LocalDate.now());
		
		//System.out.println(mentoria);
		
		//*******************************************************//
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Claro - Java com Spring Boot");
		bootcamp.setDescricao("Construa uma API com Java e Spring de ponta a ponta!");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(curso3);
		bootcamp.getConteudos().add(curso4);
		bootcamp.getConteudos().add(mentoria);
		
		System.out.println("----");
		
		Dev devCarlos = new Dev();
		devCarlos.setNome("Carlos");
		devCarlos.inscreverBootcamp(bootcamp);
		System.out.println("Dev: " + devCarlos.getNome());
		System.out.println("Conteúdos Incritos: " + devCarlos.getConteudosInscritos());
		
		while (devCarlos.getConteudosInscritos().size() > 0) {
			
			devCarlos.progredir();
			System.out.println("\n progredir++ \n");
			
			System.out.println("Conteúdos Concluídos: " + devCarlos.getConteudosConcluidos());
			System.out.println("Conteúdos Pendentes: " + devCarlos.getConteudosInscritos());
			System.out.println("\nXP: " + devCarlos.calcularTotalXp());
			
		}
		
		
		System.out.println("----");
		
//		Dev devEduardo = new Dev();
//		devEduardo.setNome("Eduardo");
//		devEduardo.inscreverBootcamp(bootcamp);
//		System.out.println("Conteúdos Incritos: [" + devEduardo.getNome() + "]" + devEduardo.getConteudosInscritos());
//		devEduardo.progredir();
//		devEduardo.progredir();
//		System.out.println("Conteúdos Concluídos: [" + devEduardo.getNome() + "]" + devEduardo.getConteudosConcluidos());
//		System.out.println("Conteúdos Pendentes: [" + devEduardo.getNome() + "]" + devEduardo.getConteudosInscritos());
//		System.out.println("XP: " + devEduardo.calcularTotalXp());
		
		
		
		
	}

}
