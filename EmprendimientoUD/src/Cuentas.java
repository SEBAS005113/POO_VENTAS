import java.util.Scanner;

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
