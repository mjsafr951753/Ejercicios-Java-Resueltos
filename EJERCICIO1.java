//DISEÑA MEDIANTE DIAGRAMAS DE FLUJO Y IMPLEMENTA EN JAVA UN PROGRAMA QUE PIDA UN NUMERO ENTERO AL USUARIO Y INDIQUE SI EL NUMERO INTRODUCIDO ES PAR O IMPAR

public static void main(String[]args){
	Scanner scan = new Scanner(System.in);
	int numero;
	
	System.out.print("Escribe un numero: ");
	numero= scan.nextInt();

	if((numero % 2) ==0){

		System.out.println("El numero es par");
	}else{
		System.out.println("Numero impar");
	}



}
