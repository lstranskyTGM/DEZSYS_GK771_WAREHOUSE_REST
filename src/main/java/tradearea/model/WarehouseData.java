package tradearea.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WarehouseData {
	
	private String warehouseID;
	private String warehouseName;
	private String warehouseAddress;
	private String warehousePostalCode ;
	private String warehouseCity;
	private String warehouseCountry;
	private String timestamp;
	private ProductData productData;


	/**
	 * Constructor
	 */
	public WarehouseData() {
		warehouseID = "001";
		warehouseName = "Linz Bahnhof";
		warehouseAddress = "Bahnhofsstrasse 27/9";
		warehousePostalCode = "Linz";
		warehouseCity = "Linz";
		warehouseCountry = "Austria";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		this.timestamp = dateFormat.format(new Date());
		this.productData = new ProductData(4);
	}

	/**
	 * Setter and Getter Methods
	 */
	public void setWarehouseID(String warehouseID) {
		this.warehouseID = warehouseID;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public void setWarehouseAddress(String warehouseAddress) {
		this.warehouseAddress = warehouseAddress;
	}

	public void setWarehousePostalCode(String warehousePostalCode) {
		this.warehousePostalCode = warehousePostalCode;
	}

	public void setWarehouseCity(String warehouseCity) {
		this.warehouseCity = warehouseCity;
	}

	public void setWarehouseCountry(String warehouseCountry) {
		this.warehouseCountry = warehouseCountry;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public void setProductData(ProductData productData) {
		this.productData = productData;
	}

	public String getWarehouseID() {
		return warehouseID;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public String getWarehouseAddress() {
		return warehouseAddress;
	}

	public String getWarehousePostalCode() {
		return warehousePostalCode;
	}

	public String getWarehouseCity() {
		return warehouseCity;
	}

	public String getWarehouseCountry() {
		return warehouseCountry;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public ProductData getProductData() {
		return productData;
	}

	/**
	 * Methods
	 */
	@Override
	public String toString() {
		String info = String.format("Warehouse Info: ID = %s, timestamp = %s", warehouseID, timestamp );
		return info;
	}
}
