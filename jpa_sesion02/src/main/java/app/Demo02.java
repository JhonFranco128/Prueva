package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo02 {
	//actualizar los datos de un usuario 
public static void main(String[] args) {
		//llamar ala conexión
	EntityManagerFactory fabrica = 
			Persistence.createEntityManagerFactory("jpa_sesion01");
	//crear un manejador de las entidades
	EntityManager manager = fabrica.createEntityManager();
	
	Usuario u = new Usuario();
	u.setCod_usua(3);
	u.setNom_usua("zoila");
	u.setApe_usua("Toro");
	u.setUsr_usua("mperez");
	u.setCla_usua("21341");
	u.setFna_usua("2000/10/07");
	u.setIdtipo(1);
	u.setEst_usua(1);
	//si queremos abar registrar , actualizar o eliminar -> trasactiom
	try {
		manager.getTransaction().begin();
		//UPDATE TB_XX SET CAMPO
		manager.merge(u);
		manager.getTransaction().commit();

		System.out.println("Actalización ok");
	} catch (Exception e) {
		System.out.println("Error : " + e.getCause().getMessage());

	}	
	manager.close();
}
}
