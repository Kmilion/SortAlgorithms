package algoritmos;

import java.util.Arrays;

public class AlgoritmosDeOrdenamiento {

	public static Integer[] seleccion(Integer[] arreglo) {
		int posMax;
		Integer aux;
		for (int i = arreglo.length - 1; i > 0; i--) {
			posMax = 0;
			for (int j = 0; j <= i; j++) {
				if (arreglo[j] > arreglo[posMax])
					posMax = j;
			}
			aux = arreglo[i];
			arreglo[i] = arreglo[posMax];
			arreglo[posMax] = aux;
		}
		return arreglo;
	}

	public static Integer[] burbujeo(Integer[] arreglo) {
		Integer aux;
		for (int i = 0; i < arreglo.length - 1; i++) {
			for (int j = arreglo.length - 1; j > i; j--) {
				if (arreglo[j] < arreglo[j - 1]) {
					aux = arreglo[j];
					arreglo[j] = arreglo[j - 1];
					arreglo[j - 1] = aux;
				}
			}
		}
		return arreglo;
	}

	public static Integer[] burbujeoW(Integer[] arreglo) {
		Integer aux;
		boolean hayIntercambio = true;
		int i = 0;
		while (hayIntercambio && i < arreglo.length - 1) {
			hayIntercambio = false;
			for (int j = arreglo.length - 1; j > i; j--) {
				if (arreglo[j] < arreglo[j - 1]) {
					hayIntercambio = true;
					aux = arreglo[j];
					arreglo[j] = arreglo[j - 1];
					arreglo[j - 1] = aux;
				}
			}
			i++;
		}
		return arreglo;
	}

	public static void main(String[] args) {
		Integer[] numeros = { 3, 4, 5, 6, 89, 43, 12, 87, 21 };
		
		System.out.println(Arrays.toString(numeros));
		System.out.println(Arrays.toString(seleccion(numeros)));
		
		System.out.println(Arrays.toString(burbujeo(numeros)));
		
		System.out.println(Arrays.toString(burbujeoW(numeros)));
	}

}
