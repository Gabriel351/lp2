import java.util.Collections;
import java.util.ArrayList;

public class Principal {
	public static void main(String arg[]) {
		ArrayList<Aluno>alunos = new ArrayList<Aluno>(); 
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		Aluno aluno5 = new Aluno();
		alunos.add(0,aluno1);
		alunos.add(1,aluno2);
		alunos.add(2,aluno3);
		alunos.add(3,aluno4);
		alunos.add(4,aluno5);
		aluno1.setNome("Gabriel");
		aluno1.setIdade(17);
		aluno2.setNome("Adriene");
		aluno2.setIdade(30);
		aluno3.setNome("Agnaldo");
		aluno3.setIdade(2);
		aluno4.setNome("Maria");
		aluno4.setIdade(5);
		aluno5.setNome("João");
		aluno5.setIdade(10);
		Collections.sort(alunos);
		for (int i = 0; i < alunos.size(); i++) {
			System.out.println("Nome:" + alunos.get(i).getNome() + "      Idade:" + alunos.get(i).getIdade());
		}
		ArrayList<Nota>notas = new ArrayList<Nota>();
		Disciplina lp2 = new Disciplina("lp2","Herbert");
		Disciplina web = new Disciplina("web","Marcelo");
		double valor = 0;
		for (int i = 0; i < 5; i++) {
			notas.add(new Nota(valor, alunos.get(i), lp2));
			valor++;
		}
		for (int i = 0; i < 5; i++) {
			notas.add(new Nota(valor, alunos.get(i), web));
			valor++;
		}
        double maiorweb = 0, maiorlp2 = 0;
        int pweb = 0, plp2 = 0;
		for (int i = 0; i < 10; i++) {
           if (notas.get(i).getDisciplina().getNome() == "web") {
             if (notas.get(i).getValor() > maiorweb) {
                maiorweb = notas.get(i).getValor();
                pweb = i;
             }            
           }else {
                if (notas.get(i).getValor() > maiorlp2) {
                   maiorlp2 = notas.get(i).getValor();
                   plp2 = i;    
             }    
           }
        }
		/*System.out.println("Maior nota - Nome:" + notas.get(9/2).getAluno().getNome() + " Nota:" + notas.get(9/2).getValor() + " Disciplina:" + notas.get(9/2).getDisciplina().getNome());
		System.out.println("Maior nota - Nome:" + notas.get(9).getAluno().getNome() + " Nota:" + notas.get(9).getValor() + " Disciplina:" + notas.get(9).getDisciplina().getNome());
		System.out.println("Maior nota de LP2 - Nome:" + notas.get(9/2).getAluno().getNome() + " Nota:" + notas.get(9/2).getValor());
	}*/
    System.out.println("Maior nota - Nome:" + notas.get(plp2).getAluno().getNome() + " Nota:" + notas.get(plp2).getValor() + " Disciplina:" + notas.get(plp2).getDisciplina().getNome());
		System.out.println("Maior nota - Nome:" + notas.get(pweb).getAluno().getNome() + " Nota:" + notas.get(pweb).getValor() + " Disciplina:" + notas.get(pweb).getDisciplina().getNome());
		System.out.println("Maior nota de LP2 - Nome:" + notas.get(plp2).getAluno().getNome() + " Nota:" + notas.get(plp2).getValor());
	}	
}
