package burgerKingV1;

import utilidad_Leer.Leer;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DEFINIR PORYECTO EXPLICACION
		//DEFINIR PARTES REALIZADAS POR CADA UNO, happy wheel, diseño, aleatorio, recibir codes tras superar precio compras
		
//PARA MEJORAR ---------------------------------------------> PONER IF PARA QUE EL USUARIO NO PUEDA PONER AÑADIR 0 A LA CESTA, poner nombre usuario antes de bucle para indicar en todo el programa

		// VARIABLES
		int opcion, opcion2, opcion3, tam=4;
		int cero = 0;
		double pedido, cesta=0, muestraAgr=0; // cartera pedido
		int cantidadPedido;
		int cantidadMenu;
		String codigoPoner;

		//Random declarión
		Random r = new Random(System.nanoTime());
		int hasta = 10000; 
		int desde = 0;
		String codigo = r.nextInt(hasta - desde + 1) + desde;
		

		//Array novedades
		double [] novedades = {7.30, 22.65, 13.20, 11.95};
		//Array menús completos
		double [] menusCompletos = {12.50, 14.60, 16.10, 9.99};
		//Array Ofertas
		double [] ofertas= {8.30,6.90,7.45,70};
		// Array Complementos
		double [] complementos= {2.50,3.50,4.99,7.75};
		
		

		System.out.println("⠀⠀⠀⠀⠀⠀     ⠀⠀⢀⣀⡤⠄⠒⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
								"⠀⠀⠀⠀⠀⣀⣴⠞⠋⢀⣠⣤⣴⣶⣶⣾⡿⠶⣶⣤⡀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
								"⠀⠀⠀⣠⡾⠋⠀⢀⣴⠟⢉⣾⣿⣿⣿⡿⠿⠗⠀⠘⠉⠀⠀⠀⠀⠀⠀⠀\r\n" + //
								"⠀⢀⣾⠟⠀⠀⠀⠸⠏⠀⠛⠉⠉⠁⠀⠀⣀⣤⡀⣴⠶⢶⣶⣲⡶⠀⠀⠀\r\n" + //
								"⢀⣾⡟⠀⠀⠀⠀⠀⢀⡀⢰⡄⣶⢻⡷⣾⡏⢶⡆⣿⣋⣹⡿⠻⡦⠀⠀⠀\r\n" + //
								"⣸⣿⠀⠀⠀⣶⣟⡿⢸⡇⣸⡇⣿⠻⠷⠙⠛⠛⠁⠉⠁⠀⣀⣤⣤⣤⠀⠀\r\n" + //
								"⣿⣿⠀⠀⠀⣿⣯⡿⠘⠛⠛⠀⠀⣀⢀⣤⣄⠀⢰⣿⣦⣾⡿⢋⣉⣉⠀⠀\r\n" + //
								"⣿⣿⠀⠀⠀⠉⠁⢀⠀⢀⣶⡆⣾⣿⢸⣿⣿⣷⣼⣿⣿⣿⣧⣈⣹⣿⠀⠀\r\n" + //
								"⢸⣿⡆⠀⠀⠀⢸⣿⣰⣿⠏⠀⣿⣿⢸⣿⡇⠙⢿⣿⠇⠉⠛⠛⠛⠉⠀⠀\r\n" + //
								"⠈⢿⣿⠀⠀⠀⢸⣿⠻⣿⣷⡄⣿⠟⠘⠛⠁⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀\r\n" + //
								"⠀⠈⢿⠀⠀⠀⢸⠿⠀⠈⠉⠁⢀⣀⣀⣠⣤⣴⣶⣾⠆⣴⡿⠁⠀⣠⣄⡀\r\n" + //
								"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠺⢿⣿⣿⣿⣿⣿⣿⣿⣿⠾⠋⠀⢀⣴⣿⣿⠋\r\n" + //
								"⠀⠀⠀⠀⠀⠀⣤⣴⣤⡀⠀⠀⠈⠉⠙⠛⠉⠉⠉⠀⠀⣠⣴⣿⣿⠟⠁⠀\r\n" + //
								"⠀⠀⠀⠀⠀⠀⠈⠛⢿⣿⣿⣶⣤⣤⣤⣤⣤⣤⣶⣾⣿⣿⡿⠛⠁⠀⠀⠀\r\n" + //
								"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠛⠿⠿⠿⠿⠿⠛⠋⠉⠀⠀⠀⠀⠀⠀⠀\n");

		// MENÚS
		do {


			System.out.println("╔══════════════════════════════════════╗");
			System.out.println("║           🍔 BURGER King 🍔            ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║ 1. BurgerDrop                        ║");
			System.out.println("║ 2. Novedades                         ║");
			System.out.println("║ 3. Menús completos                   ║");	
			System.out.println("║ 4. Complementos                      ║");
			System.out.println("║ 5. Código de promoción               ║");
			System.out.println("║ 6. Tramitar su pedido                ║");
			System.out.println("║ 0. Cancelar pedido                   ║");
			System.out.println("╚══════════════════════════════════════╝");

			System.out.println("╔═════════════════════════════╗");
			System.out.printf("║\tCesta: %.2f€\t      ║\n╚═════════════════════════════╝\n",cesta);    
			

			opcion = Leer.datoInt();

			switch (opcion) {

			case 0:
				System.out.println("Finalizando su pedido, gracias por su tiempo y por su buen gusto.");
				break;
			
			
			// SUB MENÚ OFERTAS --- INICIO
			case 1:
				do {
				System.out.println("\n-----------------------------------------\nUsted se encuentra en BurguerDrop \n-----------------------------------------");
				System.out.println("En el BurgerDrop pondremos a prueba tu habilidad mental. Cada \nreto está inspirado en nuestras hamburguesas más legendarias,\n"  //mejorar diseno
				+"y si logras superarlos, te ganarás descuentos jugosos y toda \nla gloria de un verdadero Rey del BurgerDrop. \n");

				System.out.println("Introduzca 1 para ver '30% STEAKHOUSE' ");
				System.out.println("Introduzca 2 para ver '40% WHOPPER'");
				System.out.println("Introduzca 3 para ver '50% LONGCHIKEN'");
				System.out.println("Introduzca 4 para ver '60% KING WHOPER'");
				System.out.println("Introduzca 0 para volver atrás");
				
				opcion2=Leer.datoInt();
				
				
					switch (opcion2) {
					case 0:
						System.err.println("---------------------\nSaliendo de BurguerDrop...\n---------------------");
						
						break;

					case 1:
						//Informacion Producto
						System.out.println("\n---------------------------------------------\n\t\t30% STEAKHOUSE\n---------------------------------------------");
						System.out.println("Bienvenido al BurgerDrop de la Suma, donde la \nprotagonista es nuestra legendaria SteakHouse. Esta hamburguesa\nes la definición de abundancia:"
						+"carne doble a la parrilla, cebolla crujiente, bacon ahumado,\nqueso fundido y una salsa BBQ tan intensa \nque podrías hacerle una oda.");
						
						
							System.out.println("\n¿Deseas participar por la oferta?");
							System.out.println("-------------------------\nPulse 1 para participar \n-------------------------\n-------------------------\nPulse 0 para volver atrás\n-------------------------");
							opcion3=Leer.datoInt();
							
							switch (opcion3) {
							
								case 0: 
								System.out.println("\nVolviendo atrás...");
								break; 
								
								case 1: 
									System.out.println("\nParece que no eres cualquier semilla, interesante...\nPara poder recibir esta recompensa deberas pasar por el castigo de \nla suma: ");
									
									System.out.println("Que comience la panaderia!");

									//Aleatorios
								

									System.out.println("\nIndiqueme el resultado de la siguiente suma");
									
									cantidadMenu=Leer.datoInt();
									
									
									cesta+=ofertas[0]*cantidadMenu;
									muestraAgr=ofertas[0]*cantidadMenu;
									System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
									muestraAgr=0;

									break;
								
								default:
									System.err.println("Número introducido es incorrecto, vuelva a introducir su men.");
									break;	
							}
							
							break;
							
					case 2:
						//Informacion Producto
						System.out.println("\n---------------------------------------------\n\t\t40% WHOPPER\n---------------------------------------------");
						System.out.println("Informacion 'oferta 1'");
						
						
							System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
							System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atrás\n-------------------------");
							opcion2=Leer.datoInt();
							
							switch (opcion2) {
							
								case 0: 
								System.out.println("\nVolviendo atrás...");
								break; 
								
								case 1: 
									System.out.println("\nIntroduzca la cantidad menú");
									cantidadMenu=Leer.datoInt();
									
									cesta+=ofertas[1]*cantidadMenu;
									muestraAgr=ofertas[1]*cantidadMenu;
									System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
									muestraAgr=0;
									
									break;
								
								default:
									System.err.println("El valor introducido es incorrecto, vuelva a introducir su menú.");
									break;	
							}
							
							break;
							
					case 3:
						//Informacion Producto
						System.out.println("\n---------------------------------------------\n\t\t50% LONGCHIKEN\n---------------------------------------------");
						System.out.println("Informacion 'oferta 1'");
						
						//Informacion Producto
						
							System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
							System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atrás\n-------------------------");
							opcion2=Leer.datoInt();
							
							switch (opcion2) {
							
								case 0: 
								System.out.println("\nVolviendo atrás...");
								break; 
								
								case 1: 
									System.out.println("\nIntroduzca la cantidad menú");
									cantidadMenu=Leer.datoInt();
									
									cesta+=ofertas[2]*cantidadMenu;
									muestraAgr=ofertas[2]*cantidadMenu;
									System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
									muestraAgr=0;
									
									break;
								
								default:
									System.err.println("El valor introducido es incorrecto, vuelva a introducir su menú.");
									break;	
							}
							
							break;
							
					case 4:
						//Informacion Producto
						System.out.println("\n---------------------------------------------\n\t\t60% KING WHOPER\n---------------------------------------------");
						System.out.println("Informacion 'oferta 1'");
						
						//Informacion Producto
						
							System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
							System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atrás\n-------------------------");
							opcion2=Leer.datoInt();
							
							switch (opcion2) {
							
								case 0: 
								System.out.println("\nVolviendo atrás...");
								break; 
								
								case 1: 
									System.out.println("\nIntroduzca la cantidad menú");
									cantidadMenu=Leer.datoInt();
									
									cesta+=ofertas[3]*cantidadMenu;
									muestraAgr=ofertas[3]*cantidadMenu;
									System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
									muestraAgr=0;
									
									break;
								
								default:
									System.err.println("El valor introducido es incorrecto, vuelva a introducir su menú.");
									break;	
							}
							
							break;
							
					default:
						System.err.println("El valor introducido es incorrecto, vuelva a introducir su menú.");
						break;
					}
				} while (opcion2 != 0);
				break;

				// SUB MENÚ OFERTAS --- FINAL
				
			case 2:


				// SUB MENÚ NOVEDADES --- INICIO
				System.out.println("\n-----------------------------------------\nUsted se encuentra en la sección de Novedades \n-----------------------------------------");

				do {
					
					System.out.println("Introduzca 1 para ver 'Menú Grand BBQ' ");
					System.out.println("Introduzca 2 para ver 'Menú DOBLE WHISKEY'");
					System.out.println("Introduzca 3 para ver 'Menú KIRSSPER'");
					System.out.println("Introduzca 4 para ver 'Menú SPICY LONG CHICKEN'\n");
					System.out.println("Introduzca 0 para volver atrás");
					opcion2 = Leer.datoInt();

					switch (opcion2) {
							case 0:
								System.err.println("---------------------\nSaliendo de complementos...\n---------------------");
								break;

							case 1:
								//Informacion Producto
								System.out.println("\n---------------------------------------------\n\t\tMenú Grand BBQ\n---------------------------------------------");
								System.out.println("Informacion 'Complemento  1'");
								
								
									System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
									System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atras\n-------------------------");
									opcion3=Leer.datoInt();
									
									switch (opcion3) {
									
										case 0: 
										System.out.println("\nVolviendo atras...");
										break; 
										
										case 1: 
											System.out.println("\nIntroduzca la cantidad menÚ");
											cantidadMenu=Leer.datoInt();
											
											cesta+=novedades[0]*cantidadMenu;
											muestraAgr=novedades[0]*cantidadMenu;
											System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
											muestraAgr=0;
											
											break;
										
										default:
											System.err.println("El valor introducido es incorrecto, vuelva a introducir su menÚ.");
											break;	
									}
									
									break;
									
							case 2:
								//Informacion Producto
								System.out.println("\n---------------------------------------------\n\t\tMenú DOBLE WHISKEY\n---------------------------------------------");
								System.out.println("Informacion 'Complemento 1'");
								
								
									System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
									System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atras\n-------------------------");
									opcion3=Leer.datoInt();
									
									switch (opcion3) {
									
										case 0: 
										System.out.println("\nVolviendo atras...");
										break; 
										
										case 1: 
											System.out.println("\nIntroduzca la cantidad menÚ");
											cantidadMenu=Leer.datoInt();
											
											cesta+=complementos[1]*cantidadMenu;
											muestraAgr=novedades[1]*cantidadMenu;
											System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
											muestraAgr=0;
											
											break;
										
										default:
											System.err.println("El valor introducido es incorrecto, vuelva a introducir su menú.");
											break;	
									}
									
									break;
									
							case 3:
								//Informacion Producto
								System.out.println("\n---------------------------------------------\n\t\tMenú KIRSSPER\n---------------------------------------------");
								System.out.println("Informacion 'oferta 1'");
								
								
									System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
									System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atrás\n-------------------------");
									opcion3=Leer.datoInt();
									
									switch (opcion3) {
									
										case 0: 
										System.out.println("\nVolviendo atrás...");
										break; 
										
										case 1: 
											System.out.println("\nIntroduzca la cantidad menú");
											cantidadMenu=Leer.datoInt();
											
											cesta+=complementos[2]*cantidadMenu;
											muestraAgr=novedades[2]*cantidadMenu;
											System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
											muestraAgr=0;
											
											break;
										
										default:
											System.err.println("El valor introducido es incorrecto, vuelva a introducir su menú.");
											break;	
									}
									
									break;
									
							case 4:
								//Informacion Producto
								System.out.println("\n---------------------------------------------\n\t\tMenú SPICY LONG CHICKEN\n---------------------------------------------");
								System.out.println("Informacion 'oferta 1'");
								
								
									System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
									System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atraá\n-------------------------");
									opcion3=Leer.datoInt();
									
									switch (opcion3) {
									
										case 0: 
										System.out.println("\nVolviendo atrás...");
										break; 
										
										case 1: 
											System.out.println("\nIntroduzca la cantidad menú");
											cantidadMenu=Leer.datoInt();
											
											cesta+=complementos[3]*cantidadMenu;
											muestraAgr=novedades[3]*cantidadMenu;
											System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
											muestraAgr=0;
											
											break;
										
										default:
											System.err.println("El valor introducido es incorrecto, vuelva a introducir su menú.");
											break;	
									}
									
									break;
									
							default:
								System.err.println("El valor introducido es incorrecto, vuelva a introducir su menú.");
								break;
							}
						} while (opcion2 != 0);

						break;
						// SUB MENÚ COMPLEMENTOS --- FINAL

			
			case 3: 
					// SUB MENÚ Completos --- INICIO
					do {
						System.out.println("\n-----------------------------------------\nUsted se encuentra en la sección de Menús Completos \n-----------------------------------------");

						System.out.println("Introduzca 1 para ver 'Menú Completo Whopper' ");
						System.out.println("Introduzca 2 para ver 'Menú Completo Doble Whopper'");
						System.out.println("Introduzca 3 para ver 'Menú Completo Triple Whopper'");
						System.out.println("Introduzca 4 para ver 'Menú Completo Dúo Bacon Cheddar'");
						System.out.println("Introduzca 0 para volver atrás");
						
						opcion2=Leer.datoInt();
						
						
						
							switch (opcion2) {
							case 0:
								System.err.println("---------------------\nSaliendo de menú completo...\n---------------------");
								break;

							case 1:
								//Información Producto
								System.out.println("\n---------------------------------------------\n\t\tMenú Completo Whopper\n---------------------------------------------");
								System.out.println("Información 'Complemento  1'");
								
								
									System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
									System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atrás\n-------------------------");
									opcion3=Leer.datoInt();
									
									switch (opcion3) {
									
										case 0: 
										System.out.println("\nVolviendo atrás...");
										break; 
										
										case 1: 
											System.out.println("\nIntroduzca la cantidad menú");
											cantidadMenu=Leer.datoInt();
											
											cesta+=complementos[0]*cantidadMenu;
											muestraAgr=complementos[0]*cantidadMenu;
											System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
											muestraAgr=0;
											
											break;
										
										default:
											System.err.println("El valor introducido es incorrecto, vuelva a introducir su menú.");
											break;	
									}
									
									break;
									
							case 2:
								//Informacion Producto
								System.out.println("\n---------------------------------------------\n\t\tMenú Completo Doble Whopper\n---------------------------------------------");
								System.out.println("Informacion 'Complemento 1'");
								
								
									System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
									System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atras\n-------------------------");
									opcion3=Leer.datoInt();
									
									switch (opcion3) {
									
										case 0: 
										System.out.println("\nVolviendo atrás...");
										break; 
										
										case 1: 
											System.out.println("\nIntroduzca la cantidad menú");
											cantidadMenu=Leer.datoInt();
											
											cesta+=complementos[0]*cantidadMenu;
											muestraAgr=complementos[1]*cantidadMenu;
											System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
											muestraAgr=0;
											
											break;
										
										default:
											System.err.println("El valor introducido es incorrecto, vuelva a introducir su menú.");
											break;	
									}
									
									break;
									
							case 3:
								//Informacion Producto
								System.out.println("\n---------------------------------------------\n\t\tMenú Completo Triple Whopper\n---------------------------------------------");
								System.out.println("Informacion 'oferta 1'");
								
								
									System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
									System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atrás\n-------------------------");
									opcion3=Leer.datoInt();
									
									switch (opcion3) {
									
										case 0: 
										System.out.println("\nVolviendo atrás...");
										break; 
										
										case 1: 
											System.out.println("\nIntroduzca la cantidad menú");
											cantidadMenu=Leer.datoInt();
											
											cesta+=complementos[2]*cantidadMenu;
											muestraAgr=complementos[2]*cantidadMenu;
											System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
											muestraAgr=0;
											
											break;
										
										default:
											System.err.println("El valor introducido es incorrecto, vuelva a introducir su menú.");
											break;	
									}
									
									break;
									
							case 4:
								//Informacion Producto
								System.out.println("\n---------------------------------------------\n\t\tMenú Completo Dúo Bacon Cheddar\n---------------------------------------------");
								System.out.println("Informacion 'oferta 1'");
								
								
									System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
									System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atrás\n-------------------------");
									opcion3=Leer.datoInt();
									
									switch (opcion3) {
									
										case 0: 
										System.out.println("\nVolviendo atrás...");
										break; 
										
										case 1: 
											System.out.println("\nIntroduzca la cantidad menú");
											cantidadMenu=Leer.datoInt();
											
											cesta+=complementos[3]*cantidadMenu;
											muestraAgr=complementos[3]*cantidadMenu;
											System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
											muestraAgr=0;
											
											break;
										
										default:
											System.err.println("El valor introducido es incorrecto, vuelva a introducir su menú.");
											break;	
									}
									
									break;
									
							default:
								System.err.println("El valor introducido es incorrecto, vuelva a introducir su menú.");
								break;
							}
						} while (opcion2 != 0);
						break;
						// SUBMENÚ Menu Completo --- FINAL
					
			case 4: 
					// SUB MENÚ COMPLEMENTOS --- INICIO
					do {
						System.out.println("\n-----------------------------------------\nUsted se encuentra en la sección de complementos \n-----------------------------------------");

						System.out.println("Introduzca 1 para ver 'Goat Bombs X5' ");
						System.out.println("Introduzca 2 para ver 'King Supreme'");
						System.out.println("Introduzca 3 para ver 'King Shake'");
						System.out.println("Introduzca 4 para ver 'Ben & Jerry'S'");
						System.out.println("Introduzca 0 para volver atrás");
						
						opcion2=Leer.datoInt();
						
						
							switch (opcion2) {
							case 0:
								System.err.println("---------------------\nSaliendo de complementos...\n---------------------");
								break;

							case 1:
								//Informacion Producto
								System.out.println("\n---------------------------------------------\n\t\tGoat Bombs X5\n---------------------------------------------");
								System.out.println("Informacion 'Complemento  1'");
								
								
									System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
									System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atras\n-------------------------");
									opcion3=Leer.datoInt();
									
									switch (opcion3) {
									
										case 0: 
										System.out.println("\nVolviendo atras...");
										break; 
										
										case 1: 
											System.out.println("\nIntroduzca la cantidad menÚ");
											cantidadMenu=Leer.datoInt();
											
											cesta+=complementos[0]*cantidadMenu;
											muestraAgr=menusCompletos[0]*cantidadMenu;
											System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
											muestraAgr=0;
											
											break;
										
										default:
											System.err.println("El valor introducido es incorrecto, vuelva a introducir su menÚ.");
											break;	
									}
									
									break;
									
							case 2:
								//Informacion Producto
								System.out.println("\n---------------------------------------------\n\t\tKing Supreme\n---------------------------------------------");
								System.out.println("Informacion 'Complemento 1'");
								
								
									System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
									System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atras\n-------------------------");
									opcion3=Leer.datoInt();
									
									switch (opcion3) {
									
										case 0: 
										System.out.println("\nVolviendo atras...");
										break; 
										
										case 1: 
											System.out.println("\nIntroduzca la cantidad menu");
											cantidadMenu=Leer.datoInt();
											
											cesta+=complementos[1]*cantidadMenu;
											muestraAgr=menusCompletos[1]*cantidadMenu;
											System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
											muestraAgr=0;
											
											break;
										
										default:
											System.err.println("El valor introducido es incorrecto, vuelva a introducir su menú.");
											break;	
									}
									
									break;
									
							case 3:
								//Informacion Producto
								System.out.println("\n---------------------------------------------\n\t\tKing Shake\n---------------------------------------------");
								System.out.println("Informacion 'oferta 1'");
								
								
									System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
									System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atras\n-------------------------");
									opcion3=Leer.datoInt();
									
									switch (opcion3) {
									
										case 0: 
										System.out.println("\nVolviendo atras...");
										break; 
										
										case 1: 
											System.out.println("\nIntroduzca la cantidad menu");
											cantidadMenu=Leer.datoInt();
											
											cesta+=complementos[2]*cantidadMenu;
											muestraAgr=menusCompletos[2]*cantidadMenu;
											System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
											muestraAgr=0;
											
											break;
										
										default:
											System.err.println("El valor introducido es incorrecto, vuelva a introducir su menÚ.");
											break;	
									}
									
									break;
									
							case 4:
								//Informacion Producto
								System.out.println("\n---------------------------------------------\n\t\tBen & Jerry'S\n---------------------------------------------");
								System.out.println("Informacion 'oferta 1'");
								
								
									System.out.println("\n¿Deseas agregar la oferta a tu pedido?");
									System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atrás\n-------------------------");
									opcion3=Leer.datoInt();
									
									switch (opcion3) {
									
										case 0: 
										System.out.println("\nVolviendo atras...");
										break; 
										
										case 1: 
											System.out.println("\nIntroduzca la cantidad menú");
											cantidadMenu=Leer.datoInt();
											
											cesta+=complementos[3]*cantidadMenu;
											muestraAgr=menusCompletos[3]*cantidadMenu;
											System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
											muestraAgr=0;
											
											break;
										
										default:
											System.err.println("El valor introducido es incorrecto, vuelva a introducir su menú.");
											break;	
									}
									
									break;
							
			
				
			
				default:
				System.err.println("El valor introducido es incorrecto, vuelva a introducir su men.");
				break;

							}
						} while (opcion2 != 0);

						break;

						// SUB MENÚ COMPLEMENTOS --- FINAL
						
						
			
			
			
			
			
			
			
			
			
			
			
			

					
			case 5:
					System.out.println("\n-----------------------------------------\nUsted se encuentra en los códigos de descuento \n-----------------------------------------");
					System.out.println("\n¿Presena usted un código de descuento?");

					System.out.println("Introduzca 0 para salir");
					System.out.println("Introduzca 1 para introducir el código de descuento");
					opcion2=Leer.datoInt();

					switch (opcion2) {
						case 0:
							System.out.println("Saliendo con éxito...");
							break;

						case 1:
							System.out.println("Introduzca el código promocional que se le ha sido facilitado: ");
							codigoPoner=Leer.dato();
							
						break;
					}
					
						break;


			default:
					System.err.println("El valor introducido es incorrecto, vuelva a introducir un número.");
						break;	

					
				
				}

				} while (opcion != cero);
		}
	}