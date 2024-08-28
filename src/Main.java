import java.time.LocalDate;

import br.com.cadubcastro.desafioPOO.dominio.Conteudo;
import br.com.cadubcastro.desafioPOO.dominio.Curso;
import br.com.cadubcastro.desafioPOO.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java Basico");
		curso1.setDescricao("Descrição do curso java basico");
		curso1.setCargaHoraria(8);
		
		System.out.println(curso1);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Java Basico Avançado");
		curso2.setDescricao("Descrição do curso java avançado");
		curso2.setCargaHoraria(22);
		
		System.out.println(curso2);
		

		//*******************************************************//
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java Baásico");
		mentoria.setDescricao("Descrição para mentoria Java Básico");
		mentoria.setData(LocalDate.now());
		
		System.out.println(mentoria);
		
		//*******************************************************//
		
		Conteudo conteudo = new Curso();
	}

}
