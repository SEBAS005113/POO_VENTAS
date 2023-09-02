package co.edu.udistrital.model;
import java.util.Arrays;
import java.util.Random;

public class Cuentas {
	public static int[][] ventasAleatorias() {
        int[][] ventas = new int[4][7];
        Random venta_dia = new Random();
        for (int semana = 0; semana < 4; semana++) {
            for (int dia = 0; dia < 7; dia++) {
                ventas[semana][dia] = venta_dia.nextInt(975901) + 25000;
            }
        }
        return ventas;
    }
	public static void imprimirVentas(int[] ventas) {
		System.out.println("Ventas diarias: " + Arrays.toString(ventas));
		}
	public static void topDeVentas(int[] ventas) {
		System.out.println("Top de ventas: " + Arrays.toString(ventas));
		}
	public static int TotalVentasPorSemana(int[] ventas) {
	    int total = 0;
	    for (int i = 0; i < ventas.length; i++) {
	        int venta = ventas[i];
	        total += venta;
	        }
	    return total;
	    }
	public static int[] ventasMenorAMayor(int[] ventas) {
        int[] ventasOrdenadas = Arrays.copyOf(ventas, ventas.length);
        Arrays.sort(ventasOrdenadas);
        return ventasOrdenadas;
        }
	public static void main(String[] args) {
		int[][] ventas = ventasAleatorias();
		for (int semana = 0; semana < 4; semana++) {
			int[] ventasSemana = ventas[semana];
			System.out.println("Semana " + (semana + 1) + ":");
			imprimirVentas(ventasSemana);
			int totalVentas = TotalVentasPorSemana(ventasSemana);
            System.out.println("Total de ventas: " + totalVentas);
            int[] top_ventas = ventasMenorAMayor(ventasSemana);
            topDeVentas(top_ventas);
			}
		}
    }
    


