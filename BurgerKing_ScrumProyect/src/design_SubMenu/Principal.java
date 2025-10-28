package design_SubMenu;

import utilidad_Leer.Leer;

public class Principal {

	public static void main(String[] args) {

		//Forma de hacer los cases de cada submenu (copiar y pegar el diseno) 
		
		//variables ejemplos
	
		int opcion;
		double [] ejemplo= {1,1,1,1};
		double cesta=0, cantidadMenu;

		
		
	//case 1:
		//Informacion Producto
		System.out.println("\n---------------------------------------------\n\t\tEjemplo 1\n---------------------------------------------");
		System.out.println("\n|Texto Texto Texto Texto Texto Texto Texto Texto|");
		System.out.println("|Texto Texto Texto Texto Texto Texto Texto Texto|");
		System.out.println("|Texto Texto Texto Texto Texto Texto Texto Texto|");
		System.out.println("|Texto Texto Texto Texto Texto Texto Texto Texto|");
		
		//Informacion Producto
		
			System.out.println("\n¿Deseas agregar (el ejemplo) a tu pedido?");
			System.out.println("-------------------------\nPulse 1 para agregar \n-------------------------\n-------------------------\nPulse 0 para volver atras\n-------------------------");
			opcion=Leer.datoInt();
			
			switch (opcion) {
			
				case 0: 
				System.out.println("\nVolviendo atras...");
				break; 
				
				case 1: 
					System.out.println("\n¿Podrías decirme la cantidad que deseas añadir?\nIndicar:");
					cantidadMenu=Leer.datoInt();
					
					cesta+=ejemplo[0]*cantidadMenu;
					
					System.out.println("Se ha agregado correctamente al pedido ("+(ejemplo[0]*cantidadMenu)+"€).");
					
					break;
				
				default:
					System.err.println("El valor introducido es incorrecto, vuelva a introducir su menu.");
					break;	
			}
			
			//break;
		
		
		
		
		
		}

	}

