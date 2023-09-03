package EmprendimientoUD.model;
import EmprendimientoUD.model.Cuentas;

public class AplMain {

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
            double promedio_semana = promedioVentasPorSemana(ventasSemana);
            System.out.println("El promedio de ventas en la semana fue de: " + promedio_semana);
            int maxima_venta = encontrarMaxVentas(ventasSemana);
            System.out.println("El valor maximo vendido fue de: " + maxima_venta);
            int minima_venta = encontrarMinVentas(ventasSemana);
            System.out.println("El valor mínimo vendido fue de: " + minima_venta + "\n");
            
			}
		}

}
