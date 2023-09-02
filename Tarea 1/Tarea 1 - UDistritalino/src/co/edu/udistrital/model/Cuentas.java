package co.edu.udistrital.model;
import java.util.Arrays;
import java.util.Random;

public class Cuentas {
	public static int[][] ventasAleatorias() {
        int[][] ventas = new int[4][7];
        Random random = new Random();
        for (int semana = 0; semana < 4; semana++) {
            for (int dia = 0; dia < 7; dia++) {
                ventas[semana][dia] = random.nextInt(975901) + 25000;
            }
        }
        return ventas;
    }
	public static void imprimirVentas(int[] ventas) {
		System.out.println("Ventas diarias: " + Arrays.toString(ventas));
		}
	public static void main(String[] args) {
		int[][] ventas = ventasAleatorias();
		for (int semana = 0; semana < 4; semana++) {
			int[] ventasSemana = ventas[semana];
			System.out.println("Semana " + (semana + 1) + ":");
			imprimirVentas(ventasSemana);
			}
		}
	}


