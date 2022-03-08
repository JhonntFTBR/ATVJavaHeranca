package Animais;

public class AnimaisTesta {
	
public static void main(String[] args) {
		
		Cachorro cach = new Cachorro();
		
		Cavalo cav = new Cavalo();
		
		Preguiça preg = new Preguiça();
				
		cach.setNome("Scooby");
		cach.setIdade(2);
		cach.setEmitirSom("AU AU!!");
		cach.setDevecorrer("CORRER");
		

		
		System.out.println("Nome do cachorro é: " + cach.getNome());
		System.out.println("Idade do cachorro: " + cach.getIdade());
		System.out.println("O Som que o cahorro faz: " + cach.getEmitirSom());
		System.out.println("A ação do cachorro é: " + cach.getDevecorrer());
		
		System.out.println();
		
		cav.setNome("PedePano");
		cav.setIdade(5);
		cav.setEmitirSom("IRRIRRIRRINNN");
		cav.setDevecorrer("CORRER");
		
		
		System.out.println("Nome do cacalo é: " + cav.getNome());
		System.out.println("Idade do cavalo: " + cav.getIdade());
		System.out.println("O Som que o cavalo faz: " + cav.getEmitirSom());
		System.out.println("A ação do cavalo é: " + cav.getDevecorrer());
		
		System.out.println();
		
		
		preg.setNome("Preguicinha");
		preg.setIdade(10);
		preg.setEmitirSom("zzzzzzzzzzz");
		preg.setDevecorrer("Subir em arvores");
		
		
		System.out.println("Nome da Preguiça é: " + preg.getNome());
		System.out.println("Idade da preguiça: " + preg.getIdade());
		System.out.println("O Som que a preguiça faz: " + preg.getEmitirSom());
		System.out.println("A ação da preguiça é: " + preg.getDevecorrer());
	}



	
	}
