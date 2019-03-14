
public class SPFactory implements InterfaceFabrica {


	@Override
	public Pizza getPizza(String saborPizza) {
		Pizza p = null; 
		
		if(saborPizza == "calabresa") {
			p = new PizzaCalabresaPaulista();
		} else if (saborPizza == "napolitana") {
			p = new PizzaNapolitanaPaulista();
		}
		return p;
	}

	@Override
	public Pizza criarPizza(String tipo) {
		Pizza p = null; 
		
		if(tipo == "calabresa") {
			p = new PizzaCalabresaPaulista();
			p.preparar();
			p.assar();
			p.cortar();
			p.embalar();
		} else if (tipo == "napolitana") {
			p = new PizzaNapolitanaPaulista();
			p.preparar();
			p.assar();
			p.cortar();
			p.embalar();
		}
		return p;
	}
}
