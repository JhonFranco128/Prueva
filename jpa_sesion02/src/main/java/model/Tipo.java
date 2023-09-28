package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

public class Tipo {
	@Entity
	@Table(name = "tb_tipos")
	@Data
	public class Tipos {
		@Id
		private int idtipo;
		private String descripcion;

	}
}