package burgerKingV1;

import utilidad_Leer.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DEFINIR PORYECTO EXPLICACION
		//DEFINIR PARTES REALIZADAS POR CADA UNO
		

		// VARIABLES
		int opcion, tam=4;
		int cero = 0;
		double pedido, cesta=0; // cartera pedido
		int cantidadPedido;
		int cantidadMenu;
		
		//Array Ofertas
		double [] ofertas= {1,1,1,1};
		
		// Array Complementos
		
		double [] complementos= {1,1,1,1};
		

		System.out.println("Bienvenido a BK");

		// MENÚS
		do {
			System.out.println("Introduzca 0 para terminar su pedido");
			System.out.println("Introduzca 1 para ver las ofertas");
			System.out.println("Introduzca 2 para ver las novedades");
			System.out.println("Introduzca 3 para ver los menús completos"); 
			System.out.println("Introduzca 4 para ver complementos");
			System.out.println("Introduzca 5 para ver codigo promocional");
			
			// aquí van también los postres y las // bebidas
			opcion = Leer.datoInt();

			switch (opcion) {

			case 0:
				System.out.println("Finalizando su pedido, gracias por su tiempo y por su buen gusto.");
				break;
			
			
			// SUB MENU OFERTAS --- INICIO
			case 1:
				do {
				System.out.println("\n-----------------------------------------\nUsted se encuentra en las ofertas \n-----------------------------------------");

				System.out.println("Introduzca 1 para ver '30% STEAKHOUSE' ");
				System.out.println("Introduzca 2 para ver '40% WHOPPER'");
				System.out.println("Introduzca 3 para ver '50% LONGCHIKEN'");
				System.out.println("Introduzca 4 para ver '50% WHOPPER VEGETAL'");
				System.out.println("Introduzca 0 para volver atras");
				
				opcion=Leer.datoInt();
				
				//bucle de ofertas
				
				
					switch (opcion) {
					case 0:
						System.err.println("---------------------\nSaliendo de ofertas...\n---------------------");
						break;

					case 1:
						//Informacion Producto
						System.out.println("\n---------------------------------------------\n\t\toferta 1\n---------------------------------------------");
						System.out.println("Informacion 'oferta 1'");
						
						//Informacion Producto
						
							System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
							System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atras\n-------------------------");
							opcion=Leer.datoInt();
							
							switch (opcion) {
							
								case 0: 
								System.out.println("\nVolviendo atras...");
								break; 
								
								case 1: 
									System.out.println("\nIntroduzca la cantidad menu");
									cantidadMenu=Leer.datoInt();
									
									cesta+=ofertas[0]*cantidadMenu;
									
									System.out.println("Se ha agregado correctamente al pedido ("+(ofertas[0]*cantidadMenu)+"€).");
									
									break;
								
								default:
									System.err.println("El valor introducido es incorrecto, vuelva a introducir su menu.");
									break;	
							}
							
							break;
							
					case 2:
						//Informacion Producto
						System.out.println("\n---------------------------------------------\n\t\toferta 1\n---------------------------------------------");
						System.out.println("Informacion 'oferta 1'");
						
						//Informacion Producto
						
							System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
							System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atras\n-------------------------");
							opcion=Leer.datoInt();
							
							switch (opcion) {
							
								case 0: 
								System.out.println("\nVolviendo atras...");
								break; 
								
								case 1: 
									System.out.println("\nIntroduzca la cantidad menu");
									cantidadMenu=Leer.datoInt();
									
									cesta+=ofertas[1]*cantidadMenu;
									
									System.out.println("Se ha agregado correctamente al pedido ("+(ofertas[1]*cantidadMenu)+"€).");
									
									break;
								
								default:
									System.err.println("El valor introducido es incorrecto, vuelva a introducir su menu.");
									break;	
							}
							
							break;
							
					case 3:
						//Informacion Producto
						System.out.println("\n---------------------------------------------\n\t\toferta 1\n---------------------------------------------");
						System.out.println("Informacion 'oferta 1'");
						
						//Informacion Producto
						
							System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
							System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atras\n-------------------------");
							opcion=Leer.datoInt();
							
							switch (opcion) {
							
								case 0: 
								System.out.println("\nVolviendo atras...");
								break; 
								
								case 1: 
									System.out.println("\nIntroduzca la cantidad menu");
									cantidadMenu=Leer.datoInt();
									
									cesta+=ofertas[3]*cantidadMenu;
									
									System.out.println("Se ha agregado correctamente al pedido ("+(ofertas[1]*cantidadMenu)+"€).");
									
									break;
								
								default:
									System.err.println("El valor introducido es incorrecto, vuelva a introducir su menu.");
									break;	
							}
							
							break;
							
					case 4:
						//Informacion Producto
						System.out.println("\n---------------------------------------------\n\t\toferta 1\n---------------------------------------------");
						System.out.println("Informacion 'oferta 1'");
						
						//Informacion Producto
						
							System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
							System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atras\n-------------------------");
							opcion=Leer.datoInt();
							
							switch (opcion) {
							
								case 0: 
								System.out.println("\nVolviendo atras...");
								break; 
								
								case 1: 
									System.out.println("\nIntroduzca la cantidad menu");
									cantidadMenu=Leer.datoInt();
									
									cesta+=ofertas[3]*cantidadMenu;
									
									System.out.println("Se ha agregado correctamente al pedido ("+(ofertas[3]*cantidadMenu)+"€).");
									
									break;
								
								default:
									System.err.println("El valor introducido es incorrecto, vuelva a introducir su menu.");
									break;	
							}
							
							break;
							
					default:
						System.err.println("El valor introducido es incorrecto, vuelva a introducir su menu.");
						break;
					}
				} while (opcion != 0);

				// SUB MENU OFERTAS --- FINAL
				
				

			case 2:


				System.out.println("Se encuentra en la sección de novedades");

				do {
					System.out.println("Introduzca 0 para salir");
					System.out.println("Introduzca 1 para ver 'Menú Grand BBQ' ");
					System.out.println("Introduzca 2 para ver 'Menú DOBLE WHISKEY'");
					System.out.println("Introduzca 3 para ver 'Menú KIRSSPER'");
					System.out.println("Introduzca 4 para ver 'Menú  SPICY LONG CHICKEN'");
					System.out.println("Hola hola");
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

			
			case 3: 
					
					
				
				
			case 4: 
					// SUB MENU COMPLEMENTOS --- INICIO
					do {
						System.out.println("\n-----------------------------------------\nUsted se encuentra en la seccion de complementos \n-----------------------------------------");

						System.out.println("Introduzca 1 para ver 'complemento 1' ");
						System.out.println("Introduzca 2 para ver 'complemento 2'");
						System.out.println("Introduzca 3 para ver 'complemento 3'");
						System.out.println("Introduzca 4 para ver 'complemento 4'");
						System.out.println("Introduzca 0 para volver atras");
						
						opcion=Leer.datoInt();
						
						//bucle de ofertas
						
						
							switch (opcion) {
							case 0:
								System.err.println("---------------------\nSaliendo de complementos...\n---------------------");
								break;

							case 1:
								//Informacion Producto
								System.out.println("\n---------------------------------------------\n\t\tComplemento 1\n---------------------------------------------");
								System.out.println("Informacion 'Complemento  1'");
								
								//Informacion Producto
								
									System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
									System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atras\n-------------------------");
									opcion=Leer.datoInt();
									
									switch (opcion) {
									
										case 0: 
										System.out.println("\nVolviendo atras...");
										break; 
										
										case 1: 
											System.out.println("\nIntroduzca la cantidad menu");
											cantidadMenu=Leer.datoInt();
											
											cesta+=complementos[0]*cantidadMenu;
											
											System.out.println("Se ha agregado correctamente al pedido ("+(complementos[0]*cantidadMenu)+"€).");
											
											break;
										
										default:
											System.err.println("El valor introducido es incorrecto, vuelva a introducir su menu.");
											break;	
									}
									
									break;
									
							case 2:
								//Informacion Producto
								System.out.println("\n---------------------------------------------\n\t\toferta 1\n---------------------------------------------");
								System.out.println("Informacion 'Complemento 1'");
								
								//Informacion Producto
								
									System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
									System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atras\n-------------------------");
									opcion=Leer.datoInt();
									
									switch (opcion) {
									
										case 0: 
										System.out.println("\nVolviendo atras...");
										break; 
										
										case 1: 
											System.out.println("\nIntroduzca la cantidad menu");
											cantidadMenu=Leer.datoInt();
											
											cesta+=complementos[1]*cantidadMenu;
											
											System.out.println("Se ha agregado correctamente al pedido ("+(complementos[1]*cantidadMenu)+"€).");
											
											break;
										
										default:
											System.err.println("El valor introducido es incorrecto, vuelva a introducir su menu.");
											break;	
									}
									
									break;
									
							case 3:
								//Informacion Producto
								System.out.println("\n---------------------------------------------\n\t\toferta 1\n---------------------------------------------");
								System.out.println("Informacion 'oferta 1'");
								
								//Informacion Producto
								
									System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
									System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atras\n-------------------------");
									opcion=Leer.datoInt();
									
									switch (opcion) {
									
										case 0: 
										System.out.println("\nVolviendo atras...");
										break; 
										
										case 1: 
											System.out.println("\nIntroduzca la cantidad menu");
											cantidadMenu=Leer.datoInt();
											
											cesta+=complementos[2]*cantidadMenu;
											
											System.out.println("Se ha agregado correctamente al pedido ("+(complementos[2]*cantidadMenu)+"€).");
											
											break;
										
										default:
											System.err.println("El valor introducido es incorrecto, vuelva a introducir su menu.");
											break;	
									}
									
									break;
									
							case 4:
								//Informacion Producto
								System.out.println("\n---------------------------------------------\n\t\toferta 1\n---------------------------------------------");
								System.out.println("Informacion 'oferta 1'");
								
								//Informacion Producto
								
									System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
									System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atras\n-------------------------");
									opcion=Leer.datoInt();
									
									switch (opcion) {
									
										case 0: 
										System.out.println("\nVolviendo atras...");
										break; 
										
										case 1: 
											System.out.println("\nIntroduzca la cantidad menu");
											cantidadMenu=Leer.datoInt();
											
											cesta+=complementos[3]*cantidadMenu;
											
											System.out.println("Se ha agregado correctamente al pedido ("+(complementos[3]*cantidadMenu)+"€).");
											
											break;
										
										default:
											System.err.println("El valor introducido es incorrecto, vuelva a introducir su menu.");
											break;	
									}
									
									break;
									
							default:
								System.err.println("El valor introducido es incorrecto, vuelva a introducir su menu.");
								break;
							}
						} while (opcion != 0);

						// SUB MENU COMPLEMENTOS --- FINAL
						
						
			
			
			
			
			
			
			
			
			
			
			
			}
			

			while (opcion != cero);

		} while (opcion != cero);
	}
}