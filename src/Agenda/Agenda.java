package Agenda;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Agenda {
	private List<Contacto> agenda = new ArrayList<Contacto>();
	
	public void añadirContacto(Contacto contacto){
		if(!this.contieneNombre(contacto)) {
			agenda.add(contacto);
		}
	}
	
	public List<String> nombresDeAgenda(){
		 return agenda.stream().map(Contacto::getNombre).collect(Collectors.toList());
		
	}
	
	public List<Integer> numerosDeAgenda(){
		return agenda.stream().map(Contacto::getTelefono).collect(Collectors.toList());
	}
	
	public boolean contieneNombre(Contacto contacto) {
		return  this.nombresDeAgenda().contains(contacto.getNombre());
	}
	
	public boolean contieneNumero(Contacto contacto) {
		return this.numerosDeAgenda().contains(contacto.getTelefono());
	}
	
	
	public boolean contieneContacto(Contacto contacto){
		return this.contieneNumero(contacto) && this.contieneNombre(contacto);
	}
     
    public void mostrarTelefonoDe(String nombre) {
    	for(int i=0;i<agenda.size();i++) {
    		if(agenda.get(i).getNombre()==nombre) {
    		  System.out.println(agenda.get(i).getTelefono());
    		}
    	}
    }
    
    public void eliminarContacto(Contacto contacto) {
    	agenda.remove(contacto);
    }
    
    public boolean agendaLlena(){
    	if(agenda.size()>10) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    public int espacioLibreDeAgenda() {
    	return 10-agenda.size();
    }
    
    public void listarAgenda(){
    	System.out.println("Lista de Agenda");
    	for(int i=0;i<agenda.size();i++) {
    		System.out.println(agenda.get(i));
    	}
    }
	@Override
	public String toString() {
		return "Agenda [agenda=" + agenda + "]";
	}

}
