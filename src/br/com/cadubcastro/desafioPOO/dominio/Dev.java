package br.com.cadubcastro.desafioPOO.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); // Set para adicionar elementos únicos, LinkedHashSet para ficar na mesma ordem
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    
    
    
    public void inscreverBootcamp(Bootcamp bootcamp){
    	
    	//Recebe o bootcamp e passa todo o conteúdo para conteudosInscritos
    	this.conteudosInscritos.addAll(bootcamp.getConteudos());
    	
    	bootcamp.getDevsInscritos().add(this);
    }
    
    
    public void progredir() {
    	
    	//Pega o primeiro conteudo inscrito, caso exista
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        
        if(conteudo.isPresent()) {
        
        	// Adiciona o conteúdo como concluido
        	this.conteudosConcluidos.add(conteudo.get());
            
        	// Remove o conteúdo dos incritos
        	this.conteudosInscritos.remove(conteudo.get());
            
        } else {
        	
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }
    
    
    public double calcularTotalXp() {

        return this.conteudosConcluidos
        	.stream()
            .mapToDouble(conteudo -> conteudo.calcularXp())
            .sum();
    }
    
    

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}
	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	
	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}
	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscritos, nome);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}
}
