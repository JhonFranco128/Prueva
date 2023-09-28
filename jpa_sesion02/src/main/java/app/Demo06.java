package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import model.Productos;

public class Demo06 {
	// Listado de los usuarios
	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpa_sesion_01");
		EntityManager manager = fabrica.createEntityManager();

		// select * from tb_xx
		String sql = "select p from Productos p"; // jpa
		List<Productos> lstProductos = manager.createQuery(sql, Productos.class).getResultList();
		

		// recorre el listado y lo muestra
		for (Productos u : lstProductos) {
			System.out.println("Codigo...:" + u.getid_prod());
			System.out.println("Nombre...:" + u.getdes_prod() + " " + u.getstk_prod());
			System.out.println("Tipo...:" + u.getpre_prod().getDescripcion();
			System.out.println("----------------");
		}
		manager.close();
	}
}
