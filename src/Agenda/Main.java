package Agenda;

public class Main {

	public static void main(String[] args) {
		//Realizamos ejemplos para ver el funcionamiento
		
		//Instanciamos
		Agenda contactos = new Agenda();
		Contacto persona1 = new Contacto("Martin",1130802312);
		Contacto persona2 = new Contacto("Lucas",1223345643);
		
		//Añadimos contactos y mostramos
		contactos.añadirContacto(persona1);
		contactos.añadirContacto(persona2);
		
		contactos.listarAgenda();
		
		System.out.println("--------------------------------------------------------------");
		//Verificamos si contiene un contacto 
		System.out.println(contactos.contieneContacto( new Contacto("Martin",1130802312)));
		
		System.out.println("--------------------------------------------------------------");
		//Verificamos si muestra telefono de un contacto "x"
		contactos.mostrarTelefonoDe("Martin");
		
		System.out.println("--------------------------------------------------------------");
		
		//Verificamos si elimina un elemento "x" de la lista
		contactos.eliminarContacto(persona1);
		contactos.listarAgenda();
		
		System.out.println("--------------------------------------------------------------");
		
		//Verificamos agenda llena
		System.out.println(contactos.agendaLlena());
		
		System.out.println("--------------------------------------------------------------");
		
		//Verificamos lugares libres
		
		System.out.println(contactos.espacioLibreDeAgenda());
	}
}
