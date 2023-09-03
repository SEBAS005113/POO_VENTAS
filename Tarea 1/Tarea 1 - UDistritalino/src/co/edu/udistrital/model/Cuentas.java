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
	public static int promedioVentasPorSemana(int[]ventas){
		 int total = TotalVentasPorSemana(ventas);
		 int promedio = Math.round(total/ventas.length);
		 return promedio;
		}
	public static void imprimirVentas(int[] ventas) {
		System.out.println("Ventas diarias: " + Arrays.toString(ventas));
		}
	public static void topDeVentas(int[] ventas) {
		System.out.println("Top de ventas: " + Arrays.toString(ventas));
		}
	public static int encontrarMaxVentas(int[] ventasSemana) {
	    int maximo = ventasSemana[0];
	    for (int i = 0; i < ventasSemana.length; i++) {
	        int venta = ventasSemana[i];
	        if (venta > maximo) {
	            maximo = venta;
	        }
	    }
	    return maximo;
	}
	public static int encontrarMinVentas(int[] ventasSemana) {
	    int minimo = ventasSemana[0];
	    for (int i = 0; i < ventasSemana.length; i++) {
	        int venta = ventasSemana[i];
	        if (venta < minimo) {
	            minimo = venta;
	        }
	    }
	    return minimo;
	}
	public static int promedioMensual(int[][] ventas) {
	    int totalVentas = 0;
	    int cantidadVentas = 0;
	    for (int semana = 0; semana < ventas.length; semana++) {
	        for (int dia = 0; dia < ventas[semana].length; dia++) {
	            totalVentas += ventas[semana][dia];
	            cantidadVentas++;
	            }
	        }
	    int promedio = Math.round(totalVentas / cantidadVentas);
	    return promedio;
	    }

	public static void main(String[] args) {
		int[][] ventas = ventasAleatorias();
		for (int semana = 0; semana < 4; semana++) {
			int[] ventasSemana = ventas[semana];
			System.out.println("Semana " + (semana + 1) + ":" + "\n");
			imprimirVentas(ventasSemana);
			int totalVentas = TotalVentasPorSemana(ventasSemana);
            System.out.println("Total de ventas: " + totalVentas);
            int[] top_ventas = ventasMenorAMayor(ventasSemana);
            topDeVentas(top_ventas);
            int promedio_semana = promedioVentasPorSemana(ventasSemana);
            System.out.println("El promedio de ventas en la semana fue de: " + promedio_semana);
            int maxima_venta = encontrarMaxVentas(ventasSemana);
            System.out.println("El valor maximo vendido fue de: " + maxima_venta);
            int minima_venta = encontrarMinVentas(ventasSemana);
            System.out.println("El valor mínimo vendido fue de: " + minima_venta + "\n");
			}
		int promedio_mensual = promedioMensual(ventas);
		System.out.println("El promedio de ventas mensual es de: " + promedio_mensual);
		
		}
    }
    


