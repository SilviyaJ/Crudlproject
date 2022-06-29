package myspringboot.CrudlProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {
  @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="sys_ID")
	private int lapID;
    @Column(name="sys_generation")
	private String model;
    @Column(name="sys_brand")
	private String brand;
    @Column(name="sys_cost")
	private int cost;
    @Column(name="sys_size")
	private double size;
	
	
	
	@Override
	public String toString() {
		return "Laptop [lapID=" + lapID + ", model=" + model + ", brand=" + brand + ", cost=" + cost + ", size=" + size
				+ "]";
	}
	public Laptop(int lapID, String model, String brand, int cost, double size) {
		super();
		this.lapID = lapID;
		this.model = model;
		this.brand = brand;
		this.cost = cost;
		this.size = size;
	}
	public int getLapID() {
		return lapID;
	}
	public void setLapID(int lapID) {
		this.lapID = lapID;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
	
 
}
