public class Disciplina {
	private String nome;
	private String professor;
	public Disciplina(String nome, String professor) {
		this.nome = nome;
		this.professor = professor;
	}

	public String getNome() {
		return this.nome;
	}

	public String getProfessor() {
		return this.professor;
	}
}
