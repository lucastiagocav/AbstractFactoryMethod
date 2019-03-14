
public class Pizzaria {
	private String saborPizza;
	private InterfaceFabrica fabrica;
	private Pizza pizza;
	
	public Pizzaria(InterfaceFabrica intfab) {
		this.fabrica = intfab;
	}
	
	public InterfaceFabrica getFabrica() {
		return fabrica;
	}

	public void setFabrica(InterfaceFabrica fabrica) {
		this.fabrica = fabrica;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	
	public String getPizza() {
		return saborPizza;
	}
	
	
	
}
