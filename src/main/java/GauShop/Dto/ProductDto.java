package GauShop.Dto;

import java.sql.Date;

public class ProductDto {
	private long id_product;
	private int id_category;
	private String size;
	private String name;
	private double price;
	private int sale;
	private String title;
	private boolean highlight;
	private boolean new_product;
	private String detail;
	private int id_colors;
	private String name_color;
	private String code_color;
	private String img;
	private Date created_at;
	private Date updated_at;
	public ProductDto() {
		super();
	}
	public long getId_product() {
		return id_product;
	}
	public void setId_product(long id_product) {
		this.id_product = id_product;
	}
	public int getId_category() {
		return id_category;
	}
	public void setId_category(int id_category) {
		this.id_category = id_category;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isHighlight() {
		return highlight;
	}
	public void setHighlight(boolean highlight) {
		this.highlight = highlight;
	}
	public boolean isNew_product() {
		return new_product;
	}
	public void setNew_product(boolean new_product) {
		this.new_product = new_product;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public int getId_colors() {
		return id_colors;
	}
	public void setId_colors(int id_colors) {
		this.id_colors = id_colors;
	}
	public String getName_color() {
		return name_color;
	}
	public void setName_color(String name_color) {
		this.name_color = name_color;
	}
	public String getCode_color() {
		return code_color;
	}
	public void setCode_color(String code_color) {
		this.code_color = code_color;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
}
