package pt.upacademy.ModelProduct;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private long id;
	private List<Long> shelvesIds = new ArrayList<Long>();
	private int discount;
	private int iva;
	private float pvp;

	@Override
	public String toString() {
		return "Product [shelvesIds=" + shelvesIds + ", discount=" + discount + ", iva=" + iva + ", pvp=" + pvp + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Long> getShelvesIds() {
		return shelvesIds;
	}

	public void addShelfId(long id) {
		this.shelvesIds.add(id);
	}

	public void removeShelfId(long id) {
		this.shelvesIds.remove(id);
	}

	public void setShelvesIds(List<Long> shelvesIds) {
		this.shelvesIds = shelvesIds;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public float getPvp() {
		return pvp;
	}

	public void setPvp(float pvp) {
		this.pvp = pvp;
	}

}
