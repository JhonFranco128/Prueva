package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo01 {
	//registro de un nuevo usuariousando valores fijos
public static void main(String[] args) {
		//llamar ala conexión
	EntityManagerFactory fabrica = 
			Persistence.createEntityManagerFactory("jpa_sesion01");
	//crear un manejador de las entidades
	EntityManager manager = fabrica.createEntityManager();
	
	Usuario u = new Usuario();
	u.setCod_usua(162);
	u.setNom_usua("maria");
	u.setApe_usua("diego");
	u.setUsr_usua("mperez");
	u.setCla_usua("5463524");
	u.setFna_usua("2003/10/12");
	u.setIdtipo(1);
	u.setEst_usua(1);
	//si queremos abar registrar , actualizar o eliminar -> trasactiom
	manager.getTransaction().begin();
	//INSERT INTO TB_XX VALUES (?,?.......
	manager.persist(u);
	manager.getTransaction().commit();

	System.out.println("Registro ok");	
	manager.close();
}
}
