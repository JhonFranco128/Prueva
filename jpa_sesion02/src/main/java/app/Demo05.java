package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import model.Usuario;

public class Demo05 {
	// Listado de los usuarios
	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpa_sesion_01");
		EntityManager manager = fabrica.createEntityManager();

		// select * from tb_xx
		String sql = "select u from Usuario u"; // jpa
		List<Usuario> lstUsuarios = manager.createQuery(sql, Usuario.class).getResultList();
		

		// recorre el listado y lo muestra
		for (Usuario u : lstUsuarios) {
			System.out.println("Codigo...:" + u.getCod_usua());
			System.out.println("Nombre...:" + u.getNom_usua() + " " + u.getApe_usua());
			System.out.println("Tipo...:" + u.getIdtipo().getDescripcion();
			System.out.println("----------------");
		}
		manager.close();
	}
}
