package Animais;

public class AnimaisTesta {
	
public static void main(String[] args) {
		
		Cachorro cach = new Cachorro();
		
		Cavalo cav = new Cavalo();
		
		Pregui�a preg = new Pregui�a();
				
		cach.setNome("Scooby");
		cach.setIdade(2);
		cach.setEmitirSom("AU AU!!");
		cach.setDevecorrer("CORRER");
		

		
		System.out.println("Nome do cachorro �: " + cach.getNome());
		System.out.println("Idade do cachorro: " + cach.getIdade());
		System.out.println("O Som que o cahorro faz: " + cach.getEmitirSom());
		System.out.println("A a��o do cachorro �: " + cach.getDevecorrer());
		
		System.out.println();
		
		cav.setNome("PedePano");
		cav.setIdade(5);
		cav.setEmitirSom("IRRIRRIRRINNN");
		cav.setDevecorrer("CORRER");
		
		
		System.out.println("Nome do cacalo �: " + cav.getNome());
		System.out.println("Idade do cavalo: " + cav.getIdade());
		System.out.println("O Som que o cavalo faz: " + cav.getEmitirSom());
		System.out.println("A a��o do cavalo �: " + cav.getDevecorrer());
		
		System.out.println();
		
		
		preg.setNome("Preguicinha");
		preg.setIdade(10);
		preg.setEmitirSom("zzzzzzzzzzz");
		preg.setDevecorrer("Subir em arvores");
		
		
		System.out.println("Nome da Pregui�a �: " + preg.getNome());
		System.out.println("Idade da pregui�a: " + preg.getIdade());
		System.out.println("O Som que a pregui�a faz: " + preg.getEmitirSom());
		System.out.println("A a��o da pregui�a �: " + preg.getDevecorrer());
	}



	
	}
