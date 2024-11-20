package gdu.k16.demobackend.API_221404.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int ProductID;
	
	@Column(name ="productname")	
	private String ProductName;
	private Integer SupplierID;
	private Integer  CategoryID;
	@Column(name ="quantityperunit")
	private String QuantityPerUnit;
	
	@Column(name ="Unitprice")
	private double UnitPrice;
	
	@Column(name ="Unitsinstock")
	private Integer UnitsInStock;
	
	@Column(name ="unitsonorder")
	private Integer UnitsOnOrder;
	
	@Column(name ="reorderlevel")
	private Integer ReorderLevel;

	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public Integer getSupplierID() {
		return SupplierID;
	}
	public void setSupplierID(Integer supplierID) {
		SupplierID = supplierID;
	}
	public Integer getCategoryID() {
		return CategoryID;
	}
	public void setCategoryID(Integer categoryID) {
		CategoryID = categoryID;
	}
	public String getQuantityPerUnit() {
		return QuantityPerUnit;
	}
	public void setQuantityPerUnit(String quantityPerUnit) {
		QuantityPerUnit = quantityPerUnit;
	}
	public double getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		UnitPrice = unitPrice;
	}
	public Integer getUnitsInStock() {
		return UnitsInStock;
	}
	public void setUnitsInStock(Integer unitsInStock) {
		UnitsInStock = unitsInStock;
	}
	public Integer getUnitsOnOrder() {
		return UnitsOnOrder;
	}
	public void setUnitsOnOrder(Integer unitsOnOrder) {
		UnitsOnOrder = unitsOnOrder;
	}
	public Integer getReorderLevel() {
		return ReorderLevel;
	}
	public void setReorderLevel(Integer reorderLevel) {
		ReorderLevel = reorderLevel;
	}
	
	

}
