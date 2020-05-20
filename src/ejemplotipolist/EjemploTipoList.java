package ejemplotipolist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class EjemploTipoList {
public EjemploTipoList(){
    principal();
        
}
public void principal(){
List<Datos> lista = new ArrayList<>();
Datos datos = new Datos();

datos.setNombre("Miguel");
datos.setEdad(19);
lista.add(datos);
datos = new Datos();
datos.setNombre("Fernando");
datos.setEdad(25);
lista.add(datos);
datos = new Datos();
datos.setNombre("Javier");
datos.setEdad(30);
lista.add(datos);
lista.forEach(elemento ->{
   System.out.println("Nombre "+elemento.getNombre());
   System.out.println("Edad "+ elemento.getEdad());
});
System.out.println("\n\nOtra forma de recorrer los datos");
for(Datos contenido : lista){
    System.out.println("Nombre "+ contenido.getNombre());
    System.out.println("Edad "+ contenido.getEdad());
}
datos = new Datos();
datos.setNombre("Gustavo");
datos.setEdad(19);
lista.add(datos);
    System.out.println("\n\n tercer formar de visualizar el contenido");
lista.stream().forEach((valores) ->{
    System.out.println("Nombre "+ valores.getNombre());
    System.out.println("Edad "+ valores.getEdad());

    if(valores.getNombre().equals("Miguel")){
        System.out.println("Se encontro el dato...");  
    }
});
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new EjemploTipoList();
    }
    
}
