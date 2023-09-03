package EmprendimientoUD.model;
import java.util.Arrays;
import java.util.Random;
public class Cuentas {
	
	public static void main(String[] args) {
		int[][] ventas = ventasAleatorias();				// Utilizamos funcion para arrojar valores al azar en la matriz
		
		for (int semana = 0; semana < 4; semana++) {		//iteramos las semanas para obtener valores generales de ellas
			int[] ventasSemana = ventas[semana];			//Se crea un arreglo para hacer calculos con cada semana
			System.out.println("Semana " + (semana + 1) + ":" + "\n");
			
			// Hacemos llamado a las funciones relacionadas con datos semanales
			imprimirVentas(ventasSemana);
			TotalVentasPorSemana(ventasSemana);
            int[] top_ventas = ventasMenorAMayor(ventasSemana);
            topDeVentas(top_ventas);          
            promedioVentasPorSemana(ventasSemana);
            
            encontrarMaxVentas(ventasSemana);            
            encontrarMinVentas(ventasSemana);            
			}
		
		// Hacemos llamado a las funciones relacionadas con datos mensuales
		encontrarDiaMasVentas(ventas);
		encontrarDiaMenosVentas(ventas);
		int promedio_mensual = promedioMensual(ventas);		
		diasEncimaPromedio(ventas,promedio_mensual);
		
	}
	public static int[][] ventasAleatorias() {
        int[][] ventas = new int[4][7];				//Inicializamos la matriz con la cantidad de dias y semanas
        Random venta_dia = new Random();			//Utilizamos libreria para ocupar matriz con valores al alzar 
        for (int semana = 0; semana < 4; semana++) {
            for (int dia = 0; dia < 7; dia++) {
                ventas[semana][dia] = venta_dia.nextInt(975901) + 25000;
                ventas[semana][dia] = venta_dia.nextInt(974990) + 25000;
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
	    System.out.println("Total de ventas: " + total);
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
		 System.out.println("El promedio de ventas en la semana fue de: " + promedio);
		 return promedio;
		}
	
	
	public static void imprimirVentas(int[] ventas) {
		System.out.println("Ventas diarias: " + Arrays.toString(ventas));
		}
	public static void topDeVentas(int[] ventas) {
		System.out.println("Top de ventas: " + Arrays.toString(ventas));
		}
	
	
	public static int encontrarMaxVentas(int[] ventasSemana) {	//Recibimos un arreglo de parametro 
	    int maximo = ventasSemana[0];	//Establecemos a la primera posocion como venta mayor
	    for (int i = 0; i < ventasSemana.length; i++) {
	        int venta = ventasSemana[i];
	        if (venta > maximo) {//Preguntamos si la poscion actual supera el valor la variable maximo
	            maximo = venta;		//De ser asi se actualiza la variable
	        }
	    }
	    System.out.println("El valor maximo vendido fue de: " + maximo);
	    return maximo;
	}
	public static int encontrarMinVentas(int[] ventasSemana) {//Solicitamos un arreglo, en este caso el arreglo con las ventas semana
	    int minimo = ventasSemana[0];		//Afirmamos que el valor de la primera posicion es la menor
	    for (int i = 0; i < ventasSemana.length; i++) {
	        int venta = ventasSemana[i];
	        if (venta < minimo) {		//Preguntamos si la posicion actual es menor que la almacenda en la variable
	            minimo = venta;		//Se actualiza la variable
	        }
	    }
	    System.out.println("El valor mínimo vendido fue de: " + minimo + "\n");
	    return minimo;
	}
	public static int promedioMensual(int[][] ventas) {
	    int totalVentas = 0;		//Utilizamos dos contadores
	    int cantidadVentas = 0;
	    for (int semana = 0; semana < ventas.length; semana++) {
	        for (int dia = 0; dia < ventas[semana].length; dia++) {
	            totalVentas += ventas[semana][dia]; //Por cada venta incrementa el valor total de las ventas y la cantidad de ellas
	            cantidadVentas++;
	            }
	        }
	    int promedio = Math.round(totalVentas / cantidadVentas); //Sacamos el promedio mensual en ventas de la tienda
	    return promedio;
	    }
	
	public static int encontrarDiaMasVentas(int[][] ventas) {
		int mayorVenta=ventas[0][0];//Se comienza afirmano que la primera posicion de iteracion es la mayor
		int NumDia=0, NumSemana=0;// Utilizamos variables que indicaran dia y fecha exacta
		
		for(int semana=0;semana<ventas.length;semana++) {//iteramos semanas
			for(int dia=0;dia<ventas[semana].length;dia++){//iteramos dias
				
				if(ventas[semana][dia]>mayorVenta) {
					mayorVenta=ventas[semana][dia];
					NumDia=dia+1;
					NumSemana=semana+1;
					//cuando una posicion supere el registro de mayorVenta se actualizara el dia, semana y valor
				}
			}
		}
		System.out.println("El dia que mas se vendio fue: \nDia: "+NumDia+" de la semana: "+NumSemana+"\nCon un valor de venta de: "+mayorVenta);
		return mayorVenta;
	}
	public static int encontrarDiaMenosVentas(int[][] ventas) {
		int menorVenta=ventas[0][0];//Repetimos proceso para hallar la venta menor
		int NumDia=0, NumSemana=0;
		for(int semana=0;semana<ventas.length;semana++) {
			for(int dia=0;dia<ventas[semana].length;dia++){//cambiamos el signo, porque buscmos la venta menor
				if(ventas[semana][dia]<menorVenta) {
					menorVenta=ventas[semana][dia];
					NumDia=dia+1;
					NumSemana=semana+1;  //Almacenamos datos
					
				}
			}
		}
		System.out.println("El dia que menos se vendio fue: \nDia: "+NumDia+" de la semana: "+NumSemana+"\nCon un valor de venta de: "+menorVenta);
		return menorVenta;
	}
	
	public static int diasEncimaPromedio(int[][] ventas,int promedio) {//recibimos dos parametros, uno de ellos de funcion anterior
		int diasEncimaPromedio=0;//Inicializamos contador
		
		for(int semana=0;semana<4;semana++) {
			for(int dia=0;dia<7;dia++){
				if(ventas[semana][dia]>promedio) {//Peguntamos si la posicion de la matriz tiene un valor superior al del promedio mensual
					diasEncimaPromedio++;
				}
			}
		}
		System.out.println("La cantidad de dias que estan por encima del promedio de ventas mensual es: "+ diasEncimaPromedio);
		return diasEncimaPromedio;
		
	}
	
    }