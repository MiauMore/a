import java.util.Scanner;

public class Ventasdiarias {
	public static void main(String[] args) {
		Scanner tcld = new Scanner(System.in);
		String vivienda;
		int ventasA=0, ventasB=0, ventasC=0, masVenta;
		long valorCasaAUF=20*136, valorCasaBUF=20*75, valorCasaCUF=20*100, uf, valorCasaA, valorCasaB, valorCasaC, valorEstacionamiento, valorBodega, totalDineroA=0, totalDineroB=0, totalDineroC=0, ventasEstacionamA=0, ventasBodegaA=0, ventasEstacionamB=0, ventasBodegaB=0, ventasEstacionamC=0, ventasBodegaC=0;;
		System.out.println("Ingrese el valor del UF");
		uf = tcld.nextLong();
		valorEstacionamiento = 700*uf;
		valorBodega = 700*uf;
		valorCasaA = valorCasaAUF*uf;
		valorCasaB = valorCasaBUF*uf;
		valorCasaC = valorCasaCUF*uf;
		do {
			long totalVenta=0;
			int estacionamientos, bodegas, cantVivienda;
			System.out.println("Seleccione la vivienda vendida");
			System.out.println("A, B o C");
			vivienda = tcld.next();
			switch (vivienda) {
				case "A":
					System.out.println("Cuantos se compraron?");
					cantVivienda = tcld.nextInt();
					totalVenta += valorCasaA*cantVivienda;
					ventasA += cantVivienda;
					System.out.println("Cuantos estacionamientos se compraron?");
					estacionamientos = tcld.nextInt();
					totalVenta += estacionamientos*valorEstacionamiento;
					ventasEstacionamA += estacionamientos; 
					System.out.println("Cuantas bodegas se compraron?");
					bodegas = tcld.nextInt();
					totalVenta += bodegas*valorBodega;
					ventasBodegaA += bodegas;
					totalDineroA += totalVenta;
					break;
				case "B":
					System.out.println("Cuantos se compraron?");
					cantVivienda = tcld.nextInt();
					totalVenta += valorCasaB*cantVivienda;
					ventasB += cantVivienda;
					System.out.println("Cuantos estacionamientos se compraron?");
					estacionamientos = tcld.nextInt();
					totalVenta += estacionamientos*valorEstacionamiento;
					ventasEstacionamB += estacionamientos;
					System.out.println("Cuantas bodegas se compraron?");
					bodegas = tcld.nextInt();
					totalVenta += bodegas*valorBodega;
					ventasBodegaB += bodegas;
					totalDineroB += totalVenta;
					break;
				case "C":
					System.out.println("Cuantos se compraron?");
					cantVivienda = tcld.nextInt();
					totalVenta += valorCasaC*cantVivienda;
					ventasC += cantVivienda;
					System.out.println("Cuantos estacionamientos se compraron?");
					estacionamientos = tcld.nextInt();
					totalVenta += estacionamientos*valorEstacionamiento;
					ventasEstacionamC += estacionamientos;
					System.out.println("Cuantas bodegas se compraron?");
					bodegas = tcld.nextInt();
					totalVenta += bodegas*valorBodega;
					ventasBodegaC += bodegas;
					totalDineroC += totalVenta;
					break;
			}
			System.out.println("Existe otra venta?");
			System.out.println("1: Si, 2: No");
			masVenta = tcld.nextInt();
		} while (masVenta != 2);
		System.out.println("Tipo de casa	#Viviendas	 #Estacionam 	#Bodegas 	Total($)");
		System.out.println("A " + ventasA + " " + ventasEstacionamA + " " + ventasBodegaA + " " + totalDineroA);
		System.out.println("B " + ventasB + " " + ventasEstacionamB + " " + ventasBodegaB + " " + totalDineroB);
		System.out.println("C " + ventasC + " " + ventasEstacionamC + " " + ventasBodegaC + " " + totalDineroC);
	}
}