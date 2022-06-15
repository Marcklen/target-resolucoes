package testesLogica.bootcamp.dio;

public class JobRotationTargetSistemas {

	public static void main(String[] args) {
		
		System.out.println("RESULTADOS ABAIXO");
		System.out.println("-----------");
		System.out.println("O VALOR DA SOMA É: "+soma()+"\n-----------");
		System.out.print("SEQUENCIA DA FIBONACCI: ");
		int fibo = 13;
		int contador = 0;
		for(int i = contador; i <= fibo; i++) {
			System.out.print(fibonnaci(i)+ " ");
			contador ++;
		}
		System.out.println();
		if(fibo == fibonnaci(contador)) {
			System.out.print(fibo + " tem na fibo");
		}else {
			System.out.println(fibo +" nao tem na fibo");
		}
	
		System.out.println("\n-----------");		
		System.out.println("A LOGICA DO PRX ELEMENTO É:\n-----------");
		
		System.out.println("A: 9 (Progressão Aritimetica)" 
						 + "\nB: 128 (Progressão Geométrica)" 
						 + "\nC: 49 (Numeros Impares Crescente)" 
						 + "\nD: 100 (Numeros Pares sempre somando 8 do ultimo" 
						 + "\nE: 13 (Fibonnaci)" 
						 + "\nF: 200 (Iniciando com a letra 'D'\n-----------");
		System.out.println("O VEICULO MAIS PROXIMO DA CIDADE DE RIBEIRAO PRETO É O CAMINHÃO, POIS O "
				+ "CARRO ESTÁ NUMA VELOCIDADE SUPERIOR E LEVA 0,5 A MAIS QUE O CAMINHÃO POR KM RODADO\n"
				+ "SE CONSIDERAR QUE O CAMINHÃO PASSOU EM 1 OBSTACULO DURANTE A VIAGEM "
				+ "\n-----------");
		
		System.out.println("INVERTENDO STRING ATRAVES DO REVERSE: "+reverterComMeteodo("nelkcram"));
		
		System.out.println("INVERTENDO STRING ATRAVES DE LOGICA : "+reverterComLogica("searamiug"));
		
	}

	//using a reverse method and put the word to upper case
	private static String reverterComMeteodo(String string) {
		// TODO Auto-generated method stub
		String s = new StringBuffer(string).reverse().toString().toUpperCase();
		return s;
	}
	//using logic 
	private static String reverterComLogica(String string) {
		// TODO Auto-generated method stub
		String s = "";
		for (int i = string.length() - 1; 0 <= i; i--) {
			s += string.charAt(i);
		}
		return s.toUpperCase();
	}
	//using a recursive function
	private static int fibonnaci(int num) {
		// TODO Auto-generated method stub
		if(num < 2) {
			return num;
		}else {
			return fibonnaci(num - 1) + fibonnaci(num - 2);
		}
	}
	
	private static int soma() {
		// TODO Auto-generated method stub
		int indice = 13;
		int soma = 0;
		int k = 0;
		while(k < indice) {
			k++;
			soma += k;
		}
		return soma;
	}
}
