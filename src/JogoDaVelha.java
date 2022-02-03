import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		String matriz[][] = new String [3][3];
		boolean jogador1Vence = false;
		boolean jogador2Vence = false;
		int contador = 0;


		System.out.println("Baseando-se na posição dos números ao lado direito do teclado, selecione uma posição para jogar.");
		System.out.println("Lembre-se que o jogador 1 começa com 'O' e o jogador 2 com o 'x'");
		System.out.println();
		preencherMatriz(matriz);
		imagemInicial(matriz);
		
		do{
			if (jogador1Vence == false && jogador2Vence == false && contador < 9) {
				jogador1(matriz);
				mostrarJogo(matriz);
				jogador1Vence = jogador1Venceu(matriz);
				contador++;
				
			}if (jogador1Vence == false && jogador2Vence == false && contador < 9) {
				jogador2(matriz);
				mostrarJogo(matriz);
				jogador2Vence = jogador2Venceu(matriz);
				contador++;
			}
			
		}while(jogador1Vence == false && jogador2Vence == false && contador < 9);

		if (jogador1Vence == true) {
			System.out.println();
			System.out.println("Jogador 1 venceu.");
		}else if (jogador2Vence == true) {
			System.out.println();
			System.out.println("Jogador 2 venceu.");
		}else {
			System.out.println();
			System.out.println("EMPATE.");
		}
	}
	public static void jogador1(String matriz[][]){
		Scanner scanner = new Scanner(System.in);
		int x = 0;

		do{
			System.out.println("Em qual posição o jogador 1 gostaria de jogar?");
			x = scanner.nextInt();

			switch (x) {
			case 7:
				if (matriz[0][0].equalsIgnoreCase("1")) {
					matriz[0][0] = "O";

				}else{
					System.out.println("Opção inválida. A posição ja foi preenchido");
					System.out.println();
					jogador1(matriz);
				}

				break;

			case 8:
				if (matriz[0][1].equalsIgnoreCase("1")) {
					matriz[0][1] = "O";

				}else{
					System.out.println("Opção inválida. A posição ja foi preenchido");
					System.out.println();
					jogador1(matriz);
				}
				break;
			case 9:
				if (matriz[0][2].equalsIgnoreCase("1")) {
					matriz[0][2] = "O";

				}else{
					System.out.println("Opção inválida. A posição ja foi preenchido");
					System.out.println();
					jogador1(matriz);
				}
				break;
			case 4:
				if (matriz[1][0].equalsIgnoreCase("1")) {
					matriz[1][0] = "O";

				}else{
					System.out.println("Opção inválida. A posição ja foi preenchido");
					System.out.println();
					jogador1(matriz);
				}
				break;
			case 5:
				if (matriz[1][1].equalsIgnoreCase("1")) {
					matriz[1][1] = "O";

				}else{
					System.out.println("Opção inválida. A posição ja foi preenchido");
					System.out.println();
					jogador1(matriz);
				}
				break;
			case 6:
				if (matriz[1][2].equalsIgnoreCase("1")) {
					matriz[1][2] = "O";

				}else{
					System.out.println("Opção inválida. A posição ja foi preenchido");
					System.out.println();
					jogador1(matriz);
				}
				break;
			case 1:
				if (matriz[2][0].equalsIgnoreCase("1")) {
					matriz[2][0] = "O";

				}else{
					System.out.println("Opção inválida. A posição ja foi preenchido");
					System.out.println();
					jogador1(matriz);
				}
				break;
			case 2:
				if (matriz[2][1].equalsIgnoreCase("1")) {
					matriz[2][1] = "O";

				}else{
					System.out.println("Opção inválida. A posição ja foi preenchido");
					System.out.println();
					jogador1(matriz);
				}
				break;
			case 3:
				if (matriz[2][2].equalsIgnoreCase("1")) {
					matriz[2][2] = "O";

				}else{
					System.out.println("Opção inválida. A posição ja foi preenchido");
					System.out.println();
					jogador1(matriz);
				}
				break;
			default:
				System.out.println("Opção inválida");
				System.out.println();
				jogador1(matriz);
				break;
			}
		}while(x < 1 && x > 9);

	}
	public static void jogador2(String matriz[][]){
		Scanner scanner = new Scanner(System.in);
		int x = 0;

		do{
			System.out.println("Em qual posição o jogador 2 gostaria de jogar?");
			x = scanner.nextInt();

			switch (x) {
			case 7:
				if (matriz[0][0].equalsIgnoreCase("1")) {
					matriz[0][0] = "X";

				}else{
					System.out.println("Opção inválida. A posição ja foi preenchido");
					System.out.println();
					jogador2(matriz);
				}

				break;

			case 8:
				if (matriz[0][1].equalsIgnoreCase("1")) {
					matriz[0][1] = "X";

				}else{
					System.out.println("Opção inválida. A posição ja foi preenchido");
					System.out.println();
					jogador2(matriz);
				}

				break;
			case 9:
				if (matriz[0][2].equalsIgnoreCase("1")) {
					matriz[0][2] = "X";

				}else{
					System.out.println("Opção inválida. A posição ja foi preenchido");
					System.out.println();
					jogador2(matriz);
				}
				break;
			case 4:
				if (matriz[1][0].equalsIgnoreCase("1")) {
					matriz[1][0] = "X";

				}else{
					System.out.println("Opção inválida. A posição ja foi preenchido");
					System.out.println();
					jogador2(matriz);
				}
				break;
			case 5:
				if (matriz[1][1].equalsIgnoreCase("1")) {
					matriz[1][1] = "X";

				}else{
					System.out.println("Opção inválida. A posição ja foi preenchido");
					System.out.println();
					jogador2(matriz);
				}
				break;
			case 6:
				if (matriz[1][2].equalsIgnoreCase("1")) {
					matriz[1][2] = "X";

				}else{
					System.out.println("Opção inválida. A posição ja foi preenchido");
					System.out.println();
					jogador2(matriz);
				}
				break;
			case 1:
				if (matriz[2][0].equalsIgnoreCase("1")) {
					matriz[2][0] = "X";

				}else{
					System.out.println("Opção inválida. A posição ja foi preenchido");
					System.out.println();
					jogador2(matriz);
				}
				break;
			case 2:
				if (matriz[2][1].equalsIgnoreCase("1")) {
					matriz[2][1] = "X";

				}else{
					System.out.println("Opção inválida. A posição ja foi preenchido");
					System.out.println();
					jogador2(matriz);
				}
				break;
			case 3:
				if (matriz[2][2].equalsIgnoreCase("1")) {
					matriz[2][2] = "X";

				}else{
					System.out.println("Opção inválida. A posição ja foi preenchido");
					System.out.println();
					jogador2(matriz);
				}
				break;
			default:
				System.out.println("Opção inválida");
				System.out.println();
				jogador2(matriz);
				break;
			}
		}while(x < 1 && x > 9);

	}
	public static void mostrarJogo(String matriz[][]){
		System.out.println("" + ".......");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				if (matriz[i][j].equalsIgnoreCase("1")) {
					System.out.print("|" + "_" + ""  );
				}else {
					System.out.print("|" + matriz[i][j]);
				}
			}
			System.out.print("|");
			System.out.println();
		}
	}
	public static void imagemInicial(String matriz[][]){
		System.out.println("" + ".......");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("|" + "_" + ""  );


			}
			System.out.print("|");
			System.out.println();
		}
	}
	public static void preencherMatriz(String matriz[][]){
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = "1";
			}
		}
	}
	public static boolean jogador1Venceu(String matriz[][]){
		if (matriz[0][0].equalsIgnoreCase("O") && matriz[0][1].equalsIgnoreCase("O") && matriz[0][2].equalsIgnoreCase("O")) {
			return true;
		}else if (matriz[1][0].equals("O") && matriz[1][1].equals("O") && matriz[1][2].equals("O")) {
			return true;
		}else if (matriz[2][0].equals("O") && matriz[2][1].equals("O") && matriz[2][2].equals("O")) {
			return true;
		}else if (matriz[0][0].equals("O") && matriz[1][0].equals("O") && matriz[2][0].equals("O")) {
			return true;
		}else if (matriz[0][1].equals("O") && matriz[1][1].equals("O") && matriz[2][1].equals("O")) {
			return true;
		}else if (matriz[0][2].equals("O") && matriz[1][2].equals("O") && matriz[2][2].equals("O")) {
			return true;
		}else if (matriz[0][0].equals("O") && matriz[1][1].equals("O") && matriz[2][2].equals("O")) {
			return true;
		}else if (matriz[0][2].equals("O") && matriz[1][1].equals("O") && matriz[2][0].equals("O")) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean jogador2Venceu(String matriz[][]){
		if (matriz[0][0].equals("X") && matriz[0][1].equals("X") && matriz[0][2].equals("X")) {
			return true;
		}else if (matriz[1][0].equals("X") && matriz[1][1].equals("X") && matriz[1][2].equals("X")) {
			return true;
		}else if (matriz[2][0].equals("X") && matriz[2][1].equals("X") && matriz[2][2].equals("X")) {
			return true;
		}else if (matriz[0][0].equals("X") && matriz[1][0].equals("X") && matriz[2][0].equals("X")) {
			return true;
		}else if (matriz[0][1].equals("X") && matriz[1][1].equals("X") && matriz[2][1].equals("X")) {
			return true;
		}else if (matriz[0][2].equals("X") && matriz[1][2].equals("X") && matriz[2][2].equals("X")) {
			return true;
		}else if (matriz[0][0].equals("X") && matriz[1][1].equals("X") && matriz[2][2].equals("X")) {
			return true;
		}else if (matriz[0][2].equals("X") && matriz[1][1].equals("X") && matriz[2][0].equals("X")) {
			return true;
		}else {
			return false;
		}
	}
}