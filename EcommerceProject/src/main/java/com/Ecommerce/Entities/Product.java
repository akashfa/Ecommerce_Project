package com.Ecommerce.Entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
	@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int pId;
    private String pTitle;
    private String pDec;
    private String pPhoto;
    private int pPrice;
    private int pdiscount;
    private int pQuantity;
    @ManyToOne
    private Category category;
    
	public Product(String pTitle, String pDec, String pPhoto, int pPrice, int pdiscount, int pQuantity,Category category) {

		this.pTitle = pTitle;
		this.pDec = pDec;
		this.pPhoto = pPhoto;
		this.pPrice = pPrice;
		this.pdiscount = pdiscount;
		this.pQuantity = pQuantity;
		this.category = category;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpTitle() {
		return pTitle;
	}

	public void setpTitle(String pTitle) {
		this.pTitle = pTitle;
	}

	public String getpDec() {
		return pDec;
	}

	public void setpDec(String pDec) {
		this.pDec = pDec;
	}

	public String getpPhoto() {
		return pPhoto;
	}

	public void setpPhoto(String pPhoto) {
		this.pPhoto = pPhoto;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public int getPdiscount() {
		return pdiscount;
	}

	public void setPdiscount(int pdiscount) {
		this.pdiscount = pdiscount;
	}

	public int getpQuantity() {
		return pQuantity;
	}

	public void setpQuantity(int pQuantity) {
		this.pQuantity = pQuantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pTitle=" + pTitle + ", pDec=" + pDec + ", pPhoto=" + pPhoto + ", pPrice="
				+ pPrice + ", pdiscount=" + pdiscount + ", pQuantity=" + pQuantity + ", category=" + category + "]";
	}
    
    
	
	
    
}
