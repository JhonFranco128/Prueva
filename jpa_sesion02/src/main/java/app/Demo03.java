package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo03 {
	//Encontrar y mostrar los datos
public static void main(String[] args) {
		//llamar ala conexión
	EntityManagerFactory fabrica = 
			Persistence.createEntityManagerFactory("jpa_sesion01");
	//crear un manejador de las entidades
	EntityManager manager = fabrica.createEntityManager();
	//objeto A modificar
	Usuario u = new Usuario();
	//si queremos abar registrar , actualizar o eliminar -> trasactiom
	try {
		//SELECT * FROM TB_XX WHERE ....
		u = manager.find(Usuario.class,1);
		if (u == null) {
			System.out.println("Usuario no existe");
		}else {
			System.out.println(u);
		}

	} catch (Exception e) {
		System.out.println("Error : " + e.getCause().getMessage());

	}	
	manager.close();
}
}
