package burgerKingV1;

import java.util.Random;
import utilidad_Leer.Leer;

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
		// para ruleta producto gratis
		int kingSupreme =0, BenYJerry = 0, goatBombs=0, menuCompWhop=0, menuComDuoBaChe=0;
		String codigoPoner;
		String codigo = "BKONFIRE";

		
		
		//BurgerDrop Variables
		int num1, num2, num3, resultado, intentos=0, limite=3; // he agregado limite
		int respuestaUsuario;
		int [] opcCatalogo= {1,4,5,7,8,12};
		double desc1=30, desc2=40, desc3=50, desc4=60;
		double descProducto;
		int den=100;

		//Random declarión
		Random r = new Random(System.nanoTime());
		int hasta = 10000; 
		int desde = 0;
		// String codigo = r.nextInt(hasta - desde + 1) + desde;

		//Variables case 6, trámite pago
		int pago, confirmarCancel;
		String codExtra;
		boolean pedidoConfirmado = false;  // Para saber si ya se tramitó
		String metodoPago = "";            // Para simular pago (efectivo/tarjeta)
		double totalFinal = 0;             // Copia de cesta + descuentos finales (si aplicas más)

		//Array novedades
		String [] nombresNovedades = {"Menú Grand BBQ", "Menú DOBLE WHISKEY", "Menú KIRSSPER", "Menú SPICY LONG CHICKEN"};
		double [] novedades = {7.30, 22.65, 13.20, 11.95};
		//Array menús completos
		String [] nombresMenusCompletos = {"Menú Whopper", "Menú Doble Whopper", "Menú Triple Whopper", "Menú Dúo Bacon Cheddar"};
		double [] menusCompletos = {12.50, 14.60, 16.10, 9.99};
		// Array Complementos
		String [] nombresComplementos = {"Goat Bombs X5", "King Supreme", "King Shake", "Ben & Jerry'S"};
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
			
			
		case 1:
				// SUB MENÚ BurgerDrop --- INICIO
				do {
					System.out.println("\n-----------------------------------------\nUsted se encuentra en BurguerDrop \n-----------------------------------------");
					System.out.println("En el BurgerDrop pondremos a prueba tu habilidad mental. Cada \nreto está liderada por nuestras hamburguesas más legendarias,\n"  //mejorar diseno
					+"y si logras superarlos, te ganarás descuentos jugosos y toda \nla gloria de un verdadero Rey del BurgerDrop. \n");

					if (intentos > limite) {
						
						System.out.println("Beep, beep... \n(Parece que la parrillada ha llegado al límite, vuelva a intentarlo en su proximo pedido).\n");
						opcion2=0;
					}else {
					System.out.println("Introduzca 1 para obtener un 30%");
					System.out.println("Introduzca 2 para obtener un 40%");
					System.out.println("Introduzca 3 para obtener un 50%");
					System.out.println("Introduzca 4 para obtener un 60%");
					System.out.println("Introduzca 0 para volver atrás");
					
					opcion2=Leer.datoInt();
					
					//Declaracion de limites aleatorios para reto
					desde = 1; //dejar en 1 para que no haya problema con la division
					hasta = 2; // cambiar rango antes de entregar al teacher

						switch (opcion2) {
						case 0:
							System.err.println("---------------------\nSaliendo de BurguerDrop...\n---------------------");
						
							break;

						case 1:
							//Informacion Producto
							System.out.println("╔══════════════════════════════════════════════╗");
							System.out.println("║       Desafio de Lady SteakHouse (30%)       ║");
							System.out.println("╠══════════════════════════════════════════════╣");
							System.out.println("║Bienvenido al BurgerCastle de la suma, donde  ║");
							System.out.println("║la protagonista es nuestra legendaria Lady    ║");
							System.out.println("║SteakHouse, quien defendera el trono con todo ║");
							System.out.println("║su honor...                                   ║");
							System.out.println("╚══════════════════════════════════════════════╝");
							
								System.out.println("\n¿Deseas batallar por el descuento?");
								System.out.println("-------------------------\nPulse 1 para participar \n-------------------------\n-------------------------\nPulse 0 para volver atrás\n-------------------------");
								opcion3=Leer.datoInt();
								
								switch (opcion3) {
								
									case 0: 
									System.out.println("\nVolviendo atrás...");
									break; 
									
									case 1: 
										System.out.println("\nParece que no eres cualquier semilla, interesante...\nPara poder recibir esta recompensa deberas pasar por el castigo de \nla suma: ");
										
										System.out.println("\n¡Qué comience la parrillada!");

										//Aleatorios
										num1 = r.nextInt(hasta - desde + 1) + desde;
										num2 = r.nextInt(hasta - desde + 1) + desde;
										resultado = num1 + num2;
										System.out.printf("\nIndiqueme el resultado de la siguiente suma: "+num1+" + "+num2+"\nIndicar resultado: ");
										respuestaUsuario = Leer.datoInt();
										if (resultado == respuestaUsuario) {
											

											System.out.printf("\n¡Wow! Has superado el reto y te has ganado el derecho de elegir entre nuestro catalogo un producto y descontarle un %.2f porciento.", desc1);
											System.out.println("¿A que producto deseas darle el descuento?");
											System.out.println("\n╔═════════════════════════════╗");
											System.out.println("║\tCatalogo\t      ║\n╚═════════════════════════════╝\n");
										
										//catalogo para descuento
											
										//Novedades Nombre y precios
											System.out.println("=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										System.out.print("Novedades: ");
										for (int i = 0; i < novedades.length; i++) 
											System.out.print((i+1)+". "+nombresNovedades[i]+"\t");
										System.out.print("\nPrecios: ");
										for (int i = 0; i < novedades.length; i++) {
											System.out.print("\t "+novedades[i]+"€\t \t");
										}
										System.out.println("\n=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										System.out.println("\n\n=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										
										//Menus completos nombre y precio
										System.out.print("Menús Completos: ");
										
										for (int i = 0; i < menusCompletos.length; i++) {
										System.out.print((i+5)+". "+nombresMenusCompletos[i]+"\t");
										}
										
										System.out.print("\nPrecios: ");
										for (int i = 0; i < menusCompletos.length; i++) {
										System.out.print("\t\t"+menusCompletos[i]+"€\t   ");
										}
										
										System.out.println("\n=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										System.out.println("\n\n=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										
										// complementos nombre y precio
										System.out.print("Lista Complementos: ");
										
										for (int i = 0; i < complementos.length; i++) {
										System.out.print((i+9)+". "+nombresComplementos[i]+"\t   ");
										}
										
										System.out.print("\nPrecios: ");
										for (int i = 0; i < complementos.length; i++) {
										System.out.print("\t\t  "+complementos[i]+"€\t");
										}
										System.out.println("\n=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										
										
										System.out.println("\nIndique el numero del producto: ");
										respuestaUsuario=Leer.datoInt();
										
										switch (respuestaUsuario) {
										
											case 1,2,3,4: 
												System.out.println("\nHas escogido el siguiente producto: "+nombresNovedades[respuestaUsuario]); 
											
												// CALCULOS DESCUENTOS
												descProducto=novedades[respuestaUsuario]-novedades[respuestaUsuario]*desc1/den;
												System.out.printf("Su precio es de: %.2f€; sin embargo al aplicarse el %.2f porciento se ha quedado reducido a %.2f€.",novedades[respuestaUsuario], desc1, descProducto);

												System.out.println("\n\n¿Que cantidad de veces vas a querer agregarlo al carrito?\nIndicar: ");
												cantidadMenu=Leer.datoInt();
												
												cesta+=descProducto*cantidadMenu;
												
												muestraAgr=descProducto*cantidadMenu;
												System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
												muestraAgr=0;
												
												intentos++;
												break;
											
											case 5,6,7,8: 
												respuestaUsuario=respuestaUsuario-5;
												
												System.out.println("\nHas escogido el siguiente producto: "+nombresMenusCompletos[respuestaUsuario]); 
											
												// CALCULOS DESCUENTOS
												descProducto=menusCompletos[respuestaUsuario]-menusCompletos[respuestaUsuario]*desc1/den;
												System.out.printf("Su precio es de: %.2f€; sin embargo al aplicarse el %.2f porciento se ha quedado reducido a %.2f€.",menusCompletos[respuestaUsuario], desc1, descProducto);
	
												System.out.println("\n\n¿Que cantidad de veces vas a querer agregarlo al carrito?\nIndicar: ");
												cantidadMenu=Leer.datoInt();
												
												cesta+=descProducto*cantidadMenu;
												
												muestraAgr=descProducto*cantidadMenu;
												System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
												muestraAgr=0;
												
												intentos++;
												break;
											
											case 9,10,11,12: 
												
												respuestaUsuario=respuestaUsuario-9;
												System.out.println("\nHas escogido el siguiente producto: "+nombresComplementos[respuestaUsuario]); 
											
												// CALCULOS DESCUENTOS
												descProducto=complementos[respuestaUsuario]-complementos[respuestaUsuario]*desc1/den;
												System.out.printf("Su precio es de: %.2f€; sin embargo al aplicarse el %.2f porciento se ha quedado reducido a %.2f€.",complementos[respuestaUsuario], desc1, descProducto);
	
												System.out.println("\n\n¿Que cantidad de veces vas a querer agregarlo al carrito?\nIndicar: ");
												cantidadMenu=Leer.datoInt();
												
												cesta+=descProducto*cantidadMenu;
												
												muestraAgr=descProducto*cantidadMenu;
												System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
												muestraAgr=0;
												
												intentos++;
												break;
											
											default:
												
												System.err.println("El valor introducido es erróneo, has desaprovechado una oportunidad.");
												intentos++;
												break;	
											
										}
										
										}else {
											System.out.println("\nVaya, parece que la parrillada ha sido demasiado dura para ti. No te preocupes, siempre puedes intentarlo de nuevo más tarde.");
											intentos++;
										}
										
										break;
									
									default:
										System.err.println("Número introducido es incorrecto, vuelva a elegir de nuevo.");
										break;	
								}
								
								break;
								
						case 2:
							//Informacion Producto
							
							

							System.out.println("╔══════════════════════════════════════════════╗");
							System.out.println("║       Desafio de Count Whopper (40%)         ║");
							System.out.println("╠══════════════════════════════════════════════╣");
							System.out.println("║Ha llegado el momento de enfrentarte al       ║");
							System.out.println("║clásico de clásicos: la Whopper. Esta bestia  ║");
							System.out.println("║no necesita presentación... pero tu sí        ║");
							System.out.println("║necesitas precisión.Si dominas la ecuacion del║");
							System.out.println("║sabor, el trono será tuyo... junto con un     ║");
							System.out.println("║descuento que sabrá mejor que cualquier       ║");
							System.out.println("║victoria.                                     ║");
							System.out.println("╚══════════════════════════════════════════════╝");

								
							System.out.println("\n¿Deseas participar por la oferta?");
							System.out.println("-------------------------\nPulse 1 para participar \n-------------------------\n-------------------------\nPulse 0 para volver atrás\n-------------------------");
							opcion3=Leer.datoInt();
								
								switch (opcion3) {
								
									case 0: 
									System.out.println("\nVolviendo atrás...");
									break; 
									
									case 1: 
										System.out.println("\nParece que no eres cualquier semilla, interesante...\nPara poder recibir esta recompensa deberas pasar por el castigo de \nla resta: ");
										
										System.out.println("\n¡Qué comience la parrillada!");

										//Aleatorios
										num1 = r.nextInt(hasta - desde + 1) + desde;
										num2 = r.nextInt(hasta - desde + 1) + desde;
										resultado = num1 - num2;
										System.out.printf("\nIndiqueme el resultado de la siguiente resta: "+num1+" - "+num2+"\nIndicar resultado: ");
										respuestaUsuario = Leer.datoInt();
										if (resultado == respuestaUsuario) {
											

											System.out.printf("\n¡Wow! Has superado el reto y te has ganado el derecho de elegir entre nuestro catalogo un producto y descontarle un %.2f porciento.", desc2);
											System.out.println("¿A que producto deseas darle el descuento?");
											System.out.println("\n╔═════════════════════════════╗");
											System.out.println("║\tCatalogo\t      ║\n╚═════════════════════════════╝\n");
										
										//catalogo para descuento
											
										//Novedades Nombre y precios
											System.out.println("=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										System.out.print("Novedades: ");
										for (int i = 0; i < novedades.length; i++) 
											System.out.print((i+1)+". "+nombresNovedades[i]+"\t");
										System.out.print("\nPrecios: ");
										for (int i = 0; i < novedades.length; i++) {
											System.out.print("\t "+novedades[i]+"€\t \t");
										}
										System.out.println("\n=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										System.out.println("\n\n=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										
										//Menus completos nombre y precio
										System.out.print("Menús Completos: ");
										
										for (int i = 0; i < menusCompletos.length; i++) {
										System.out.print((i+5)+". "+nombresMenusCompletos[i]+"\t");
										}
										
										System.out.print("\nPrecios: ");
										for (int i = 0; i < menusCompletos.length; i++) {
										System.out.print("\t\t"+menusCompletos[i]+"€\t   ");
										}
										
										System.out.println("\n=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										System.out.println("\n\n=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										
										// complementos nombre y precio
										System.out.print("Lista Complementos: ");
										
										for (int i = 0; i < complementos.length; i++) {
										System.out.print((i+9)+". "+nombresComplementos[i]+"\t   ");
										}
										
										System.out.print("\nPrecios: ");
										for (int i = 0; i < complementos.length; i++) {
										System.out.print("\t\t  "+complementos[i]+"€\t");
										}
										System.out.println("\n=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										
										
										System.out.println("\nIndique el numero del producto: ");
										respuestaUsuario=Leer.datoInt();
										
										switch (respuestaUsuario) {
										
											case 1,2,3,4: 
												System.out.println("\nHas escogido el siguiente producto: "+nombresNovedades[respuestaUsuario]); 
											
												// CALCULOS DESCUENTOS
												descProducto=novedades[respuestaUsuario]-novedades[respuestaUsuario]*desc2/den;
												System.out.printf("Su precio es de: %.2f€; sin embargo al aplicarse el %.2f porciento se ha quedado reducido a %.2f€.",novedades[respuestaUsuario], desc2, descProducto);

												System.out.println("\n\n¿Que cantidad de veces vas a querer agregarlo al carrito?\nIndicar: ");
												cantidadMenu=Leer.datoInt();
												
												cesta+=descProducto*cantidadMenu;
												
												muestraAgr=descProducto*cantidadMenu;
												System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
												muestraAgr=0;
												
												intentos++;
												break;
											
											case 5,6,7,8: 
												respuestaUsuario=respuestaUsuario-5;
												
												System.out.println("\nHas escogido el siguiente producto: "+nombresMenusCompletos[respuestaUsuario]); 
											
												// CALCULOS DESCUENTOS
												descProducto=menusCompletos[respuestaUsuario]-menusCompletos[respuestaUsuario]*desc2/den;
												System.out.printf("Su precio es de: %.2f€; sin embargo al aplicarse el %.2f porciento se ha quedado reducido a %.2f€.",menusCompletos[respuestaUsuario], desc2, descProducto);
	
												System.out.println("\n\n¿Que cantidad de veces vas a querer agregarlo al carrito?\nIndicar: ");
												cantidadMenu=Leer.datoInt();
												
												cesta+=descProducto*cantidadMenu;
												
												muestraAgr=descProducto*cantidadMenu;
												System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
												muestraAgr=0;
												
												intentos++;
												break;
											
											case 9,10,11,12: 
												
												respuestaUsuario=respuestaUsuario-9;
												System.out.println("\nHas escogido el siguiente producto: "+nombresComplementos[respuestaUsuario]); 
											
												// CALCULOS DESCUENTOS
												descProducto=complementos[respuestaUsuario]-complementos[respuestaUsuario]*desc2/den;
												System.out.printf("Su precio es de: %.2f€; sin embargo al aplicarse el %.2f porciento se ha quedado reducido a %.2f€.",complementos[respuestaUsuario], desc2, descProducto);
	
												System.out.println("\n\n¿Que cantidad de veces vas a querer agregarlo al carrito?\nIndicar: ");
												cantidadMenu=Leer.datoInt();
												
												cesta+=descProducto*cantidadMenu;
												
												muestraAgr=descProducto*cantidadMenu;
												System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
												muestraAgr=0;
												
												intentos++;
												break;
											
											default:
												
												System.err.println("El valor introducido es erróneo, has desaprovechado una oportunidad.");
												intentos++;
												break;	
											
										}
										
										}else {
											System.out.println("\nVaya, parece que la panaderia ha sido demasiado dura para ti. No te preocupes, siempre puedes intentarlo de nuevo más tarde.");
											intentos++;
										}
										
										break;
									
									default:
										System.err.println("Número introducido es incorrecto, vuelva a elegir de nuevo.");
										break;	
								}
								
								break;
						case 3:
							//Informacion Producto
							System.out.println("\n---------------------------------------------\n\t\tDesafio de Lord Chicken (50%)\n---------------------------------------------");
							System.out.println("Prepárate para la prueba del poder multiplicador del sabor, el desafío \ndel Long Chicken no es para cualquiera: su forma alargada es un homenaje al cálculo… y a los estómagos ambiciosos.");
							
							System.out.println("╔══════════════════════════════════════════════╗");
							System.out.println("║        Desafio de Lord Chicken (50%)         ║");
							System.out.println("╠══════════════════════════════════════════════╣");
							System.out.println("║Prepárate para la prueba del poder            ║");
							System.out.println("║multiplicador del sabor, el desafío del Lord  ║");
							System.out.println("║Chicken no es para cualquiera: su forma       ║");
							System.out.println("║alargada es un homenaje al cálculo... y a los ║");
							System.out.println("║estómagos ambiciosos.                         ║");
							System.out.println("╚══════════════════════════════════════════════╝");


								System.out.println("\n¿Deseas batallar por el descuento?");
								System.out.println("-------------------------\nPulse 1 para participar \n-------------------------\n-------------------------\nPulse 0 para volver atrás\n-------------------------");
								opcion3=Leer.datoInt();
								
								switch (opcion3) {
								
									case 0: 
									System.out.println("\nVolviendo atrás...");
									break; 
									
									case 1: 
										System.out.println("\nParece que no eres cualquier semilla, interesante...\nPara poder recibir esta recompensa deberas pasar por el castigo de \nla multiplicación: ");
										
										System.out.println("\n¡Qué comience la parrillada!");

										//Aleatorios
										num1 = r.nextInt(hasta - desde + 1) + desde;
										num2 = r.nextInt(hasta - desde + 1) + desde;
										resultado = num1 * num2;
										System.out.printf("\nIndiqueme el resultado de la siguiente suma: "+num1+" * "+num2+"\nIndicar resultado: ");
										respuestaUsuario = Leer.datoInt();
										if (resultado == respuestaUsuario) {
											

											System.out.printf("\n¡Wow! Has superado el reto y te has ganado el derecho de elegir entre nuestro catalogo un producto y descontarle un %.2f porciento.", desc3);
											System.out.println("¿A que producto deseas darle el descuento?");
											System.out.println("\n╔═════════════════════════════╗");
											System.out.println("║\tCatalogo\t      ║\n╚═════════════════════════════╝\n");
										
										//catalogo para descuento
											
										//Novedades Nombre y precios
											System.out.println("=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										System.out.print("Novedades: ");
										for (int i = 0; i < novedades.length; i++) 
											System.out.print((i+1)+". "+nombresNovedades[i]+"\t");
										System.out.print("\nPrecios: ");
										for (int i = 0; i < novedades.length; i++) {
											System.out.print("\t "+novedades[i]+"€\t \t");
										}
										System.out.println("\n=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										System.out.println("\n\n=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										
										//Menus completos nombre y precio
										System.out.print("Menús Completos: ");
										
										for (int i = 0; i < menusCompletos.length; i++) {
										System.out.print((i+5)+". "+nombresMenusCompletos[i]+"\t");
										}
										
										System.out.print("\nPrecios: ");
										for (int i = 0; i < menusCompletos.length; i++) {
										System.out.print("\t\t"+menusCompletos[i]+"€\t   ");
										}
										
										System.out.println("\n=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										System.out.println("\n\n=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										
										// complementos nombre y precio
										System.out.print("lista Complementos: ");
										
										for (int i = 0; i < complementos.length; i++) {
										System.out.print((i+9)+". "+nombresComplementos[i]+"\t   ");
										}
										
										System.out.print("\nPrecios: ");
										for (int i = 0; i < complementos.length; i++) {
										System.out.print("\t\t  "+complementos[i]+"€\t");
										}
										System.out.println("\n=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										
										
										System.out.println("\nIndique el numero del producto: ");
										respuestaUsuario=Leer.datoInt();
										
										switch (respuestaUsuario) {
										
											case 1,2,3,4: 
												System.out.println("\nHas escogido el siguiente producto: "+nombresNovedades[respuestaUsuario]); 
											
												// CALCULOS DESCUENTOS
												descProducto=novedades[respuestaUsuario]-novedades[respuestaUsuario]*desc3/den;
												System.out.printf("Su precio es de: %.2f€; sin embargo al aplicarse el %.2f porciento se ha quedado reducido a %.2f€.",novedades[respuestaUsuario], desc3, descProducto);

												System.out.println("\n\n¿Que cantidad de veces vas a querer agregarlo al carrito?\nIndicar: ");
												cantidadMenu=Leer.datoInt();
												
												cesta+=descProducto*cantidadMenu;
												
												muestraAgr=descProducto*cantidadMenu;
												System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
												muestraAgr=0;
												
												intentos++;
												break;
											
											case 5,6,7,8: 
												respuestaUsuario=respuestaUsuario-5;
												
												System.out.println("\nHas escogido el siguiente producto: "+nombresMenusCompletos[respuestaUsuario]); 
											
												// CALCULOS DESCUENTOS
												descProducto=menusCompletos[respuestaUsuario]-menusCompletos[respuestaUsuario]*desc3/den;
												System.out.printf("Su precio es de: %.2f€; sin embargo al aplicarse el %.2f porciento se ha quedado reducido a %.2f€.",menusCompletos[respuestaUsuario], desc3, descProducto);
	
												System.out.println("\n\n¿Que cantidad de veces vas a querer agregarlo al carrito?\nIndicar: ");
												cantidadMenu=Leer.datoInt();
												
												cesta+=descProducto*cantidadMenu;
												
												muestraAgr=descProducto*cantidadMenu;
												System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
												muestraAgr=0;
												
												intentos++;
												break;
											
											case 9,10,11,12: 
												
												respuestaUsuario=respuestaUsuario-9;
												System.out.println("\nHas escogido el siguiente producto: "+nombresComplementos[respuestaUsuario]); 
											
												// CALCULOS DESCUENTOS
												descProducto=complementos[respuestaUsuario]-complementos[respuestaUsuario]*desc3/den;
												System.out.printf("Su precio es de: %.2f€; sin embargo al aplicarse el %.2f porciento se ha quedado reducido a %.2f€.",complementos[respuestaUsuario], desc3, descProducto);
	
												System.out.println("\n\n¿Que cantidad de veces vas a querer agregarlo al carrito?\nIndicar: ");
												cantidadMenu=Leer.datoInt();
												
												cesta+=descProducto*cantidadMenu;
												
												muestraAgr=descProducto*cantidadMenu;
												System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
												muestraAgr=0;
												
												intentos++;
												break;
											
											default:
												
												System.err.println("El valor introducido es erróneo, has desaprovechado una oportunidad.");
												intentos++;
												break;	
											
										}
										
										}else {
											System.out.println("\nVaya, parece que la panaderia ha sido demasiado dura para ti. No te preocupes, siempre puedes intentarlo de nuevo más tarde.");
											intentos++;
										}
										
										break;
									
									default:
										System.err.println("Número introducido es incorrecto, vuelva a elegir de nuevo.");
										break;	
								}
								
								break;
								
						case 4:
							//Informacion Producto

							System.out.println("╔══════════════════════════════════════════════╗");
							System.out.println("║             Desafio del Chef (60%)           ║");
							System.out.println("╠══════════════════════════════════════════════╣");
							System.out.println("║Nadie conoce su verdadero rostro, solo el humo║");
							System.out.println("║que deja su parrilla. Si llegas hasta él,     ║");
							System.out.println("║habrás probado todos los sabores del          ║");
							System.out.println("║conocimiento... y del hambre.                 ║");
							System.out.println("╚══════════════════════════════════════════════╝");
							
							
								System.out.println("\n¿Deseas batallar por el descuento?");
								System.out.println("-------------------------\nPulse 1 para participar \n-------------------------\n-------------------------\nPulse 0 para volver atrás\n-------------------------");
								opcion3=Leer.datoInt();
								
								switch (opcion3) {
								
									case 0: 
									System.out.println("\nVolviendo atrás...");
									break; 
									
									case 1: 
										System.out.println("\nParece que no eres cualquier semilla, interesante...\nPara poder recibir esta recompensa deberas pasar por el castigo de \nla ecuación: ");
										
										System.out.println("\n¡Qué comience la parrillada!");

										//Aleatorios
										num1 = r.nextInt(hasta - desde + 1) + desde;
										num2 = r.nextInt(hasta - desde + 1) + desde;
										num3 = r.nextInt(hasta - desde + 1) + desde;

										resultado = num1 * num2 + num3;
										System.out.printf("\nIndiqueme el resultado de la siguiente división: "+num1+" * "+num2+"+"+num3+"\nIndicar resultado: ");
										respuestaUsuario = Leer.datoInt();
										if (resultado == respuestaUsuario) {
											

											System.out.printf("\n¡Wow! Has superado el reto y te has ganado el derecho de elegir entre nuestro catalogo un producto y descontarle un %.2f porciento.", desc4);
											System.out.println("¿A que producto deseas darle el descuento?");
											System.out.println("\n╔═════════════════════════════╗");
											System.out.println("║\tCatalogo\t      ║\n╚═════════════════════════════╝\n");
										
										//catalogo para descuento
											
										//Novedades Nombre y precios
											System.out.println("=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										System.out.print("Novedades: ");
										for (int i = 0; i < novedades.length; i++) 
											System.out.print((i+1)+". "+nombresNovedades[i]+"\t");
										System.out.print("\nPrecios: ");
										for (int i = 0; i < novedades.length; i++) {
											System.out.print("\t "+novedades[i]+"€\t \t");
										}
										System.out.println("\n=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										System.out.println("\n\n=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										
										//Menus completos nombre y precio
										System.out.print("Menús Completos: ");
										
										for (int i = 0; i < menusCompletos.length; i++) {
										System.out.print((i+5)+". "+nombresMenusCompletos[i]+"\t");
										}
										
										System.out.print("\nPrecios: ");
										for (int i = 0; i < menusCompletos.length; i++) {
										System.out.print("\t\t"+menusCompletos[i]+"€\t   ");
										}
										
										System.out.println("\n=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										System.out.println("\n\n=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										
										// complementos nombre y precio
										System.out.print("Lista Complementos: ");
										
										for (int i = 0; i < complementos.length; i++) {
										System.out.print((i+9)+". "+nombresComplementos[i]+"\t   ");
										}
										
										System.out.print("\nPrecios: ");
										for (int i = 0; i < complementos.length; i++) {
										System.out.print("\t\t  "+complementos[i]+"€\t");
										}
										System.out.println("\n=======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  =======  ======= ");
										
										
										System.out.println("\nIndique el numero del producto: ");
										respuestaUsuario=Leer.datoInt();
										
										switch (respuestaUsuario) {
										
											case 1,2,3,4: 
												System.out.println("\nHas escogido el siguiente producto: "+nombresNovedades[respuestaUsuario]); 
											
												// CALCULOS DESCUENTOS
												descProducto=novedades[respuestaUsuario]-novedades[respuestaUsuario]*desc4/den;
												System.out.printf("Su precio es de: %.2f€; sin embargo al aplicarse el %.2f porciento se ha quedado reducido a %.2f€.",novedades[respuestaUsuario], desc4, descProducto);

												System.out.println("\n\n¿Que cantidad de veces vas a querer agregarlo al carrito?\nIndicar: ");
												cantidadMenu=Leer.datoInt();
												
												cesta+=descProducto*cantidadMenu;
												
												muestraAgr=descProducto*cantidadMenu;
												System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
												muestraAgr=0;
												
												intentos++;
												break;
											
											case 5,6,7,8: 
												respuestaUsuario=respuestaUsuario-5;
												
												System.out.println("\nHas escogido el siguiente producto: "+nombresMenusCompletos[respuestaUsuario]); 
											
												// CALCULOS DESCUENTOS
												descProducto=menusCompletos[respuestaUsuario]-menusCompletos[respuestaUsuario]*desc4/den;
												System.out.printf("Su precio es de: %.2f€; sin embargo al aplicarse el %.2f porciento se ha quedado reducido a %.2f€.",menusCompletos[respuestaUsuario], desc4, descProducto);
	
												System.out.println("\n\n¿Que cantidad de veces vas a querer agregarlo al carrito?\nIndicar: ");
												cantidadMenu=Leer.datoInt();
												
												cesta+=descProducto*cantidadMenu;
												
												muestraAgr=descProducto*cantidadMenu;
												System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
												muestraAgr=0;
												
												intentos++;
												break;
											
											case 9,10,11,12: 
												
												respuestaUsuario=respuestaUsuario-9;
												System.out.println("\nHas escogido el siguiente producto: "+nombresComplementos[respuestaUsuario]); 
											
												// CALCULOS DESCUENTOS
												descProducto=complementos[respuestaUsuario]-complementos[respuestaUsuario]*desc4/den;
												System.out.printf("Su precio es de: %.2f€; sin embargo al aplicarse el %.2f porciento se ha quedado reducido a %.2f€.",complementos[respuestaUsuario], desc4, descProducto);
	
												System.out.println("\n\n¿Que cantidad de veces vas a querer agregarlo al carrito?\nIndicar: ");
												cantidadMenu=Leer.datoInt();
												
												cesta+=descProducto*cantidadMenu;
												
												muestraAgr=descProducto*cantidadMenu;
												System.out.printf("Se ha agregado correctamente al pedido %.2f€.",muestraAgr);
												muestraAgr=0;
												
												intentos++;
												break;
											
											default:
												
												System.err.println("El valor introducido es erróneo, has desaprovechado una oportunidad.");
												intentos++;
												break;	
											
										}
										
										}else {
											System.out.println("\nVaya, parece que la panaderia ha sido demasiado dura para ti. No te preocupes, siempre puedes intentarlo de nuevo más tarde.");
											intentos++;
										}
										
										break;
									
									default:
										System.err.println("Número introducido es incorrecto, vuelva a elegir de nuevo.");
										break;	
								}
								
								break;
								
						default:
							System.err.println("El valor introducido es incorrecto, vuelva a introducir su menú.");
							break;
						}
					}
						
					} while (opcion2 != 0);
					
					break;
				// SUB MENÚ OFERTAS --- FINAL
				
			case 2:


				// SUB MENÚ NOVEDADES --- INICIO
				do {
				System.out.println("\n-----------------------------------------\nUsted se encuentra en la sección de Novedades \n-----------------------------------------");

				
					
					System.out.println("Introduzca 1 para ver 'Menú Grand BBQ' ");
					System.out.println("Introduzca 2 para ver 'Menú DOBLE WHISKEY'");
					System.out.println("Introduzca 3 para ver 'Menú KIRSSPER'");
					System.out.println("Introduzca 4 para ver 'Menú SPICY LONG CHICKEN'");
					System.out.println("Introduzca 0 para volver atrás");
					opcion2 = Leer.datoInt();

					switch (opcion2) {
							case 0:
								System.err.println("---------------------\nSaliendo de complementos...\n---------------------");
								break;

							case 1:
								//Informacion Producto
								System.out.println("\n---------------------------------------------\n\t\tMenú Grand BBQ\n---------------------------------------------");
								System.out.println("╔══════════════════════════════════════════════╗");
								System.out.println("║            🔥 MENÚ GRAND BBQ 🔥               ║");
								System.out.println("╠══════════════════════════════════════════════╣");
								System.out.println("║ Doble carne a la parrilla con tomate, bacon,  ║");
								System.out.println("║ queso de cabra, cebolla caramelizada y Bull's ║");
								System.out.println("║ Eye BBQ. ¡Vuelve la grandeza!                 ║");
								System.out.println("║ Acompañado de patatas, bebida y Mini King.    ║");
								System.out.println("║ Fusión con sabor a elegir.                    ║");
								System.out.println("╚══════════════════════════════════════════════╝");
								
								
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
											
											cesta+=novedades[0]*cantidadMenu;
											muestraAgr=novedades[0]*cantidadMenu;
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
								System.out.println("\n---------------------------------------------\n\t\tMenú DOBLE WHISKEY\n---------------------------------------------");
								System.out.println("╔══════════════════════════════════════════════╗");
								System.out.println("║        🥃 MENÚ DOBLE WHISKEY 🥃               ║");
								System.out.println("╠══════════════════════════════════════════════╣");
								System.out.println("║ Doble carne flameada, lechuga, tomate, cebolla║");
								System.out.println("║ y salsa Whiskey BBQ ahumada. ¡Intensidad      ║");
								System.out.println("║ doble!                                        ║");
								System.out.println("║ Acompañado de patatas, bebida y Mini King.    ║");
								System.out.println("║ Fusión con sabor a elegir.                    ║");
								System.out.println("╚══════════════════════════════════════════════╝");
								
								
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
											
											cesta+=novedades[1]*cantidadMenu;
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
								System.out.println("╔══════════════════════════════════════════════╗");
								System.out.println("║             🐔 MENÚ KRISPER 🐔                ║");
								System.out.println("╠══════════════════════════════════════════════╣");
								System.out.println("║ Pollo doble crujiente por fuera, jugoso por   ║");
								System.out.println("║ dentro, con lechuga, queso y salsa Krisper en ║");
								System.out.println("║ pan brioche. ¡MMMHHH de sabor!                ║");
								System.out.println("║ Acompañado de patatas, bebida y Mini King.    ║");
								System.out.println("║ Fusión con sabor a elegir.                    ║");
								System.out.println("╚══════════════════════════════════════════════╝");
								
								
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
											
											cesta+=novedades[2]*cantidadMenu;
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
								System.out.println("╔══════════════════════════════════════════════╗");
								System.out.println("║       🌶️ MENÚ SPICY LONG CHICKEN 🌶️         ║");
								System.out.println("╠══════════════════════════════════════════════╣");
								System.out.println("║ Pollo alargado spicy, crujiente con lechuga,  ║");
								System.out.println("║ tomate y salsa picante en pan suave. ¡Fuego   ║");
								System.out.println("║ controlado!                                   ║");
								System.out.println("║ Acompañado de patatas, bebida y Mini King.    ║");
								System.out.println("║ Fusión con sabor a elegir.                    ║");
								System.out.println("╚══════════════════════════════════════════════╝");
								
								
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
											
											cesta+=novedades[3]*cantidadMenu;
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
								System.out.println("╔══════════════════════════════════════════════╗");
								System.out.println("║           🍔 MENÚ WHOPPER GRANDE 🍔           ║");
								System.out.println("╠══════════════════════════════════════════════╣");
								System.out.println("║ Siempre #1: carne jugosa a la parrilla,       ║");
								System.out.println("║ lechuga fresca, tomate, pepinillos, mayonesa  ║");
								System.out.println("║ y kétchup en pan sésamo. ¡Sabor único!        ║");
								System.out.println("║ Acompañado de patatas, bebida y Mini King.    ║");
								System.out.println("║ Fusión con sabor a elegir.                    ║");
								System.out.println("╚══════════════════════════════════════════════╝");
								
								
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
											
											cesta+=menusCompletos[0]*cantidadMenu;
											muestraAgr=menusCompletos[0]*cantidadMenu;
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
								System.out.println("╔══════════════════════════════════════════════╗");
								System.out.println("║        🍔 MENÚ DOBLE WHOPPER GRANDE 🍔        ║");
								System.out.println("╠══════════════════════════════════════════════╣");
								System.out.println("║ Doble carne flameada, lechuga, tomate y       ║");
								System.out.println("║ extras en pan esponjoso. ¡Doble gloria!       ║");
								System.out.println("║ Reconocerás su sabor icónico.                 ║");
								System.out.println("║ Acompañado de patatas, bebida y Mini King.    ║");
								System.out.println("║ Fusión con sabor a elegir.                    ║");
								System.out.println("╚══════════════════════════════════════════════╝");
								
								
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
											
											cesta+=menusCompletos[1]*cantidadMenu;
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
								System.out.println("\n---------------------------------------------\n\t\tMenú Completo Triple Whopper\n---------------------------------------------");
								System.out.println("╔══════════════════════════════════════════════╗");
								System.out.println("║       🍔 MENÚ TRIPLE WHOPPER GRANDE 🍔        ║");
								System.out.println("╠══════════════════════════════════════════════╣");
								System.out.println("║ Triple carne a la parrilla, veggies frescas   ║");
								System.out.println("║ y salsas clásicas en pan reforzado. ¡Épico!   ║");
								System.out.println("║ Para reyes del hambre.                        ║");
								System.out.println("║ Acompañado de patatas, bebida y Mini King.    ║");
								System.out.println("║ Fusión con sabor a elegir.                    ║");
								System.out.println("╚══════════════════════════════════════════════╝");
								
								
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
											
											cesta+=menusCompletos[2]*cantidadMenu;
											muestraAgr=menusCompletos[2]*cantidadMenu;
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
								System.out.println("╔══════════════════════════════════════════════╗");
								System.out.println("║     🥓 MENÚ DÚO BACON CHEDDAR GRANDE 🥓       ║");
								System.out.println("╠══════════════════════════════════════════════╣");
								System.out.println("║ Dúo de patties con bacon crujiente, cheddar   ║");
								System.out.println("║ derretido y salsa especial. ¡Ahumado y        ║");
								System.out.println("║ fundente!                                     ║");
								System.out.println("║ Acompañado de patatas, bebida y Mini King.    ║");
								System.out.println("║ Fusión con sabor a elegir.                    ║");
								System.out.println("╚══════════════════════════════════════════════╝");
								
								
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
											
											cesta+=menusCompletos[3]*cantidadMenu;
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
								System.out.println("╔══════════════════════════════════════════════╗");
								System.out.println("║            🐐 GOAT BOMBS X5 🐐                ║");
								System.out.println("╠══════════════════════════════════════════════╣");
								System.out.println("║ 5 nuggets de pollo jugosos y crujientes, con  ║");
								System.out.println("║ salsa BBQ para mojar. ¡Bombas de sabor!       ║");
								System.out.println("║ Perfecto side picante.                        ║");
								System.out.println("╚══════════════════════════════════════════════╝");
								
								
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
											muestraAgr=complementos[0]*cantidadMenu;
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
								System.out.println("╔══════════════════════════════════════════════╗");
								System.out.println("║             👑 KING SUPREME 👑                ║");
								System.out.println("╠══════════════════════════════════════════════╣");
								System.out.println("║ Burger suprema: carne premium, queso, bacon   ║");										
								System.out.println("║ y veggies en pan gourmet. ¡Realeza en cada    ║");
								System.out.println("║ bocado!                                       ║");
								System.out.println("╚══════════════════════════════════════════════╝");
								
								
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
								System.out.println("\n---------------------------------------------\n\t\tKing Shake\n---------------------------------------------");
								System.out.println("╔══════════════════════════════════════════════╗");
								System.out.println("║             🥛 KING SHAKE 🥛                  ║");
								System.out.println("╠══════════════════════════════════════════════╣");
								System.out.println("║ Batido cremoso de vainilla o chocolate, con   ║");
								System.out.println("║ trozos reales. ¡Refrescante y adictivo!       ║");
								System.out.println("║ El postre perfecto.                           ║");
								System.out.println("╚══════════════════════════════════════════════╝");
								
								
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
											muestraAgr=complementos[2]*cantidadMenu;
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
								System.out.println("╔══════════════════════════════════════════════╗");
								System.out.println("║         🍦 BEN & JERRY'S 🍦                   ║");
								System.out.println("╠══════════════════════════════════════════════╣");
								System.out.println("║ Helado artesanal en sabores locos: chunks de  ║");
								System.out.println("║ chocolate, caramel o frutas. ¡Pura felicidad! ║");
								System.out.println("║ Endulza tu pedido.                            ║");
								System.out.println("╚══════════════════════════════════════════════╝");
								
								
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
				System.err.println("El valor introducido es incorrecto, vuelva a introducir su número.");
				break;

							}
						} while (opcion2 != 0);

						break;

						// SUB MENÚ COMPLEMENTOS --- FINAL
						
						
			case 5:
					// SUBMENÚ Código de promoción --- Inicio
					System.out.println("\n-----------------------------------------\nUsted se encuentra en los códigos de descuento \n-----------------------------------------");
					System.out.println("\n¿Presenta usted un código de descuento?");

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
							
							if (codigoPoner.equals(codigo)) {
								System.out.println("¡¡Enhorabuena!! \n Ahora dispone de una tirada de la Ruleta de la Suerte");
								System.out.println("-_-_-_--_-_-_--_-_-_--_-_-_- En esta ruleta de la suerte, usted va a ganar un producto TOTALMENTE GRATUITO de forma aleatoria. -_-_-_--_-_-_--_-_-_--_-_-_-");

								System.out.println("Introduzca un número del 1 al 5:");
								opcion3=Leer.datoInt();

								switch (opcion3) {
									case 1:
										System.out.println("-->-->--> Ha ganado el producto: King Supreme <--<--<--");
								    	kingSupreme ++;
										break;
										
									case 2:
										System.out.println("-->-->--> Ha ganado el producto: Ben & Jerry'S <--<--<--");
										BenYJerry ++;
										break;
									case 3:
										System.out.println("-->-->--> Ha ganado el producto: Goat Bombs X5 <--<--<--");
										goatBombs ++;
										break;
									case 4:
										System.out.println("-->-->--> Ha ganado el producto: Menú Completo Whopper <--<--<--");
										menuCompWhop++;
										break;
									case 5:
										System.out.println("-->-->--> Ha ganado el producto: Menú Completo Dúo Bacon Cheddar <--<--<--");
										menuComDuoBaChe++;
										break;
									default:
										System.err.println("Número inválido");
										break;
								}
							} else {
								System.err.println("Código erróneo, buen intento");
							}
						break;
					}
					
						break;
					// SUBMENÚ Código de promoción --- Final

			case 6:
					// SUBMENÚ Tramitar pedido --- Inicio
    if (cesta == 0) {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║ ¡Ups! Tu cesta está vacía. 😅         ║");
        System.out.println("║ Agrega algo delicioso antes. 🍔      ║");
        System.out.println("╚══════════════════════════════════════╝");
        break; // Vuelve al menú principal
    }

    do {
        System.out.println("\n-----------------------------------------\n¡Hora de tramitar tu pedido real! 💳\n-----------------------------------------");
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║        📋 RESUMEN DE TU CESTA         ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.printf("║ Total actual: %.2f€                  ║\n", cesta);
        System.out.println("║ (Incluye IVA. Envío gratis >15€)      ║");
        System.out.println("╚══════════════════════════════════════╝");

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║ 1. Ver detalles del pedido            ║");
        System.out.println("║ 2. Confirmar y pagar                  ║");
        System.out.println("║ 3. Aplicar descuento extra            ║");
        System.out.println("║ 4. Cancelar todo                      ║");
        System.out.println("║ 0. Volver al menú                     ║");
        System.out.println("╚══════════════════════════════════════╝");

        opcion2 = Leer.datoInt();

        switch (opcion2) {
        case 0:
            System.out.println("Volviendo al menú... ¡No te vayas sin pedir! 🍟");
            break;

        case 1: // Ver detalles (simple por ahora)
            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║           📝 DETALLES DEL PEDIDO      ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.printf("║ Subtotal: %.2f€                      ║\n", cesta * 0.84); // Ej: sin IVA
            System.out.printf("║ IVA (21%%): %.2f€                    ║\n", cesta * 0.16);
            System.out.printf("║ Total: %.2f€                         ║\n", cesta);
            System.out.println("║ Tiempo estimado: 15-20 min 🚀         ║");
            System.out.println("╚══════════════════════════════════════╝");
            break;

        case 2: // Confirmar y pagar
            System.out.println("¡Excelente elección! Vamos a confirmar.");
            
            // APLICA GRATIS DE RULETA
            double gratisTotal = 0;
            if (kingSupreme > 0) { 
                gratisTotal += 3.50 * kingSupreme; 
                System.out.println("🎁 +" + kingSupreme + "x King Supreme GRATIS! (-" + (3.50 * kingSupreme) + "€)");
            }
            if (BenYJerry > 0) { 
                gratisTotal += 7.75 * BenYJerry; 
                System.out.println("🎁 +" + BenYJerry + "x Ben & Jerry's GRATIS! (-" + (7.75 * BenYJerry) + "€)");
            }
            if (goatBombs > 0) { 
                gratisTotal += 2.50 * goatBombs; 
                System.out.println("🎁 +" + goatBombs + "x Goat Bombs X5 GRATIS! (-" + (2.50 * goatBombs) + "€)");
            }
            if (menuCompWhop > 0) { 
                gratisTotal += 12.50 * menuCompWhop; 
                System.out.println("🎁 +" + menuCompWhop + "x Menú Whopper GRATIS! (-" + (12.50 * menuCompWhop) + "€)");
            }
            if (menuComDuoBaChe > 0) { 
                gratisTotal += 9.99 * menuComDuoBaChe; 
                System.out.println("🎁 +" + menuComDuoBaChe + "x Dúo Bacon Cheddar GRATIS! (-" + (9.99 * menuComDuoBaChe) + "€)");
            }
            
            totalFinal = cesta - gratisTotal;
            System.out.printf("Ahorro por gratis: %.2f€\n", gratisTotal);

            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║ ¿Método de pago?                      ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║ 1. Efectivo (al recoger) 💵           ║");
            System.out.println("║ 2. Tarjeta de crédito/débito 💳       ║");
            System.out.println("║ 3. Bizum/PayPal 📱                    ║");
            System.out.println("╚══════════════════════════════════════╝");
            pago = Leer.datoInt();

            switch (pago) {
                case 1:
                    metodoPago = "Efectivo";
                    break;
                case 2:
                    metodoPago = "Tarjeta";
                    break;
                case 3:
                    metodoPago = "Bizum";
                    break;
                default:
                    System.out.println("Opción inválida, usando Efectivo.");
                    metodoPago = "Efectivo";
                    break;
            }

            System.out.println("\n⏳ Procesando tu pedido...");

            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║           🎉 PEDIDO CONFIRMADO!       ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.printf("║ Total a pagar: %.2f€                 ║\n", totalFinal);
            System.out.println("║ Pago con: " + metodoPago + "               ║");
            System.out.println("║ Tu código de recogida: BK" + r.nextInt(10000) + " 🏷️║");
            System.out.println("║ ¡Gracias por elegir Burger King! 👑   ║");
            System.out.println("╚══════════════════════════════════════╝");
            pedidoConfirmado = true;
            cesta = 0; // Reset
            kingSupreme = 0; BenYJerry = 0; goatBombs = 0; menuCompWhop = 0; menuComDuoBaChe = 0;  // Reset ruleta
            break; // Sal del sub-bucle

        case 3: // Descuento extra (simple, sin código)
            System.out.println("Introduce código de descuento:");
            codExtra = Leer.dato();
            if (codExtra.equals("BK10")) {
                cesta *= 0.9;
                System.out.println("¡Descuento aplicado! -10% 💸");
            } else {
                System.out.println("Código inválido. 😔");
            }
            break;

        case 4: // Cancelar
            System.out.println("¿Seguro que quieres cancelar? (1=Sí / 0=No)");
            confirmarCancel = Leer.datoInt();
            if (confirmarCancel == 1) {
                cesta = 0;
                System.out.println("Pedido cancelado. ¡Vuelve pronto! 👋");
            } else {
                System.out.println("¡Bien! Sigamos con tu pedido.");
            }
            break;

        default:
            System.out.println("Opción inválida. Elige del 0-4.");
            break;
        }
    } while (opcion2 != 0 && !pedidoConfirmado);

    if (pedidoConfirmado) {
        System.out.println("\n¡Pedido tramitado exitosamente! Fin del programa. 😊");
        // Aquí puedes salir del main: System.exit(0); o break outer loop
    }
    break;

    // SUBMENÚ Tramitar
					default:
					System.err.println("El valor introducido es incorrecto, vuelva a introducir un número.");
					break;	
				
				}

				} while (opcion != cero);

				System.out.println("\n\n");
				
				System.out.println("⠀⠀⠀⠀⠀ ⣀⡤⠄⠒⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
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
		}
	}