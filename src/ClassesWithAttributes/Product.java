package ClassesWithAttributes;

public class Product {
	
	public Product() {
		System.out.println("Yapıcı blok çalıştı");
	}
	
	public Product(int _id, String _name, String _description, double _price, int _stockAmount, String _color) {
		System.out.println("Yapıcı blok çalıştı");
		this._id = _id;
		this._name = _name;
		this._description = _description;
		this._price = _price;
		this._stockAmount = _stockAmount;
		this._color = _color;
	}
	
	// attribute | field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _color;
	private String _kod;
	

	public int getId(){
		return _id;
	}
	
	public void setId(int id){
		this._id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		this._description = description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		this._price = price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}

	public String getColor() {
		return _color;
	}

	public void setColor(String color) {
		this._color = color;
	}

	public String getKod() {
		return this._name.substring(0,1) + _id;
	}
	
	
}
