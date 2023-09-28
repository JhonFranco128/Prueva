package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


public class Productos {
	@Entity
	@Table(name = "tb_productos")
	@Data
	public class Usuario {
		@Id
		private int id_prod;
		private String des_prod;
		private String stk_prod;
		private String pre_prod ;
		private String idcategoria;
		private String est_prod;
		private int idproveedor;
		
		@ManyToOne
		@JoinColumn(name ="id_prod",
				insertable = false ,
				updatable =false)
		private proveedor objproveedor;
}
}
