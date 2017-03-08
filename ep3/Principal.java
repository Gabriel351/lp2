import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
public class Principal {
	public static void main(String arg[]) {
		ArrayList<Aluno>alunos = new ArrayList<Aluno>(); 
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		Aluno aluno5 = new Aluno();
		alunos.add(0,aluno1);
		alunos.add(1,aluno1);
		alunos.add(2,aluno1);
		alunos.add(3,aluno1);
		alunos.add(4,aluno1);
		aluno1.setNome("Gabriel");
		aluno1.setIdade(17);
		aluno1.setNome("Luiz");
		aluno1.setIdade(30);
		aluno1.setNome("Agnaldo");
		aluno1.setIdade(2);
		aluno1.setNome("Maria");
		aluno1.setIdade(5);
		aluno1.setNome("João");
		aluno1.setIdade(10);
		Collections.sort(alunos);
		for (int i = 0; i < alunos.size(); i++) {
			System.out.println(Aluno.get(i).getNome());
		}
	}	
}
