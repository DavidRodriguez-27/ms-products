package com.bootcamp.ms.models.documents;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection="productos")
public class Products {
	
	@Id
	private String id;
	
	@NotNull
	private String producto;
	
	@NotNull
	private String tipoProducto;
	
	@NotEmpty
	private String comision;
	
	@NotEmpty
	private String limiteMovimiento;
	
	@NotEmpty
	private String lineaCredito;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createAt;
	

	public Products() {}

	public Products(String producto, String tipoProducto, String comision, String limiteMovimiento, String lineaCredito, Date createAt) {
		this.producto = producto;
		this.tipoProducto = tipoProducto;
		this.comision = comision;
		this.limiteMovimiento = limiteMovimiento;
		this.lineaCredito = lineaCredito;
		this.createAt = createAt;
		
	}
		
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	

	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	
	public String getComision() {
		return comision;
	}

	public void setComision(String comision) {
		this.comision = comision;
	}

	public String getLimiteMovimiento() {
		return limiteMovimiento;
	}

	public void setLimiteMovimiento(String limiteMovimiento) {
		this.limiteMovimiento = limiteMovimiento;
	}

	public String getLineaCredito() {
		return lineaCredito;
	}

	public void setLineaCredito(String lineaCredito) {
		this.lineaCredito = lineaCredito;
	}

	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	
	
	

}
