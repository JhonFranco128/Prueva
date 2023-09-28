package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

public class Categorias {


	public class categorias {
		@Entity
		@Table(name = "tb_categorias")
		@Data
		public class Categoria {
			@Id
			private int idprovedor;
			private String descripcion;

		}
	}
}
