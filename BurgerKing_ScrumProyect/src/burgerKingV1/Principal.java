package burgerKingV1;

import utilidad_Leer.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DEFINIR PORYECTO EXPLICACION
		//DEFINIR PARTES REALIZADAS POR CADA UNO
		

		// DECLARARACION DE VARIABLES
		int opcion;
		int cero = 0;
		double pedido; // cartera pedido
		int cantidadPedido;

		System.out.println("Bienvenido a BK");

		// MENÚS
		do {
			System.out.println("Inrouzca 0 para terminar su pedido");
			System.out.println("Introduzca 1 para ver las ofertas ");
			System.out.println("Introduzca 2 para ver las novedades ");
			System.out.println("Introduzca 3 para ver los menús completos"); // aquí van también los postres y las
																				// bebidas
			opcion = Leer.datoInt();

			switch (opcion) {

			case 0:
				System.out.println("Finalizando su pedido, gracias por su tiempo y por su buen gusto.");
				break;
			case 1:

				System.out.println("Usted ha seleccionado las ofertas");

				System.out.println("Introduzca 0 para volver atras");
				System.out.println("Introduzca 1 para ver '30% STEAKHOUSE' ");
				System.out.println("Introduzca 2 para ver '40% WHOPPER'");
				System.out.println("Introduzca 3 para ver '50% LONGCHIKEN'");
				System.out.println("Introduzca 4 para ver '50% WHOPPER VEGETAL'");

				do {
					switch (opcion) {
					case 0:
						System.out.println("Saliendo de ofertas...");
						break;

					case 1:
						System.out.println("Informacion menu");
						System.out.println("Deseas agregar la oferta a tu pedido");
						System.out.println("Pulse 1 para agregar\nPulse 2 para volver atras");
						opcion = Leer.datoInt();

						if (opcion == 1) {
							// añadir calculos pedidos preguntar cuantos menus quiere de esos
						} else {
							System.out.println("Volviendo al menú anterior...");
						}

					default:
						break;
					}
				} while (opcion != 0);

				break;

			case 2:

				System.out.println("Se encuentra en la sección de novedades");

				do {
					System.out.println("Introduzca 0 para salir");
					System.out.println("Introduzca 1 para ver 'Menú Grand BBQ' ");
					System.out.println("Introduzca 2 para ver 'Menú DOBLE WHISKEY'");
					System.out.println("Introduzca 3 para ver 'Menú KIRSSPER'");
					System.out.println("Introduzca 4 para ver 'Menú SPICY LONG CHICKEN'");
					opcion = Leer.datoInt();

					switch (opcion) {

					case 0:
						System.out.println("Saliendo de la sección de novedades...");
						break;

					case 1:
						System.out.println("Menú Grand BBQ");
						System.out.println("Este menú presenta la cantidad de info:");
						// poner precio, info producto,
						break;

					case 2:
						System.out.println("Menú DOBLE WHISKEY");
						System.out.println("Este menú presenta la cantidad de info:");
						break;

					case 3:
						System.out.println("Menú KIRSSPER");
						System.out.println("Este menú presenta la cantidad de info:");
						break;

					case 4:
						System.out.println("Menú SPICY LONG CHICKEN");
						System.out.println("Este menú presenta la cantidad de info:");
						break;

					default:
						System.out.println("Número incorrecto, introduzca un número válido");
						break;
					}

				} while (opcion != cero);

			}
			while (opcion != cero);

		} while (opcion != cero);
	}
}