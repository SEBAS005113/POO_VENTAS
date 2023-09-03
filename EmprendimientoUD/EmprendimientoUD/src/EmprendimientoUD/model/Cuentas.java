/*import java.util.Scanner;

public class Cuentas {

	public static void main(String[] args) {
		int valorVenta, ventaSemana=0;
		int [][]cuentaMes=new int[4][7];
		for (int i = 1; i < cuentaMes.length+1; i++) {
			for(int j=1;j<=7;j++) {
				Scanner leer=new Scanner(System.in);
				System.out.println("Digite el valor de las ventas del dia "+j+" de la semana "+i);
				cuentaMes[i][j]=leer.nextInt();
				valorVenta=cuentaMes[i][j];
				ventaSemana=ventaSemana+valorVenta;
			}
			System.out.println("El total de la ventas de la semana "+i+" es: "+ventaSemana);
		}

	}
	public static void promedioVentasSemana() {}
	public static void promedioVentasMes() {}

}
*/
package EmprendimientoUD.model;
import EmprendimientoUD.model.AplMain;
import java.util.Arrays;
import java.util.Random;

public class Cuentas {
	public int[][] ventasAleatorias() {
        int[][] ventas = new int[4][7];
        Random venta_dia = new Random();
        for (int semana = 0; semana < 4; semana++) {
            for (int dia = 0; dia < 7; dia++) {
                ventas[semana][dia] = venta_dia.nextInt(975901) + 25000;
            }
        }
        return ventas;
    }
	public int TotalVentasPorSemana(int[] ventas) {
	    int total = 0;
	    for (int i = 0; i < ventas.length; i++) {
	        int venta = ventas[i];
	        total += venta;
	        }
	    return total;
	    }
	public int[] ventasMenorAMayor(int[] ventas) {
        int[] ventasOrdenadas = Arrays.copyOf(ventas, ventas.length);
        Arrays.sort(ventasOrdenadas);
        return ventasOrdenadas;
        }
	public double promedioVentasPorSemana(int[]ventas){
		 double total = TotalVentasPorSemana(ventas);
		 double promedio = Math.round(total/ventas.length);
		 return promedio;
		}
	public void imprimirVentas(int[] ventas) {
		System.out.println("Ventas diarias: " + Arrays.toString(ventas));
		}
	public void topDeVentas(int[] ventas) {
		System.out.println("Top de ventas: " + Arrays.toString(ventas));
		}
	public int encontrarMaxVentas(int[] ventasSemana) {
	    int maximo = ventasSemana[0];
	    for (int i = 0; i < ventasSemana.length; i++) {
	        int venta = ventasSemana[i];
	        if (venta > maximo) {
	            maximo = venta;
	        }
	    }
	    return maximo;
	}
	public int encontrarMinVentas(int[] ventasSemana) {
	    int minimo = ventasSemana[0];
	    for (int i = 0; i < ventasSemana.length; i++) {
	        int venta = ventasSemana[i];
	        if (venta < minimo) {
	            minimo = venta;
	        }
	    }
	    return minimo;
	}
	public int encontrarDiaMasVentas(int[][] ventas) {
		int mayorVenta=ventas[0][0];
		for(int semana=0;semana<4;semana++) {
			for(int dia=0;dia<7;dia++){
				int venta=ventas[semana][dia];
				if(venta>mayorVenta) {
					mayorVenta=venta;
				}
			}
		}
		//System.out.println("El dia que mas se vende es: /n Semana: "+mayorVenta[][]+"/n Dia: "+mayorVenta[][]);
		
		return mayorVenta;
	}
	public int encontrarDiaMenosVentas(int[][] ventas) {
		int menorVenta=ventas[0][0];
		for(int semana=0;semana<4;semana++) {
			for(int dia=0;dia<7;dia++){
				int venta=ventas[semana][dia];
				if(venta<menorVenta) {
					menorVenta=venta;
				}
			}
		}
		return menorVenta;
	}
	
    }