
public class RJFactory implements InterfaceFabrica {


	@Override
	public Pizza getPizza(String saborPizza) {
		Pizza p = null;
		if(saborPizza == "calabresa") {
			p = new PizzaCalabresaCarioca();
		} else if (saborPizza == "napolitana") {
			p = new PizzaNapolitanaCarioca();
		}
		return p;
	}

	@Override
	public Pizza criarPizza(String tipo) {
		Pizza p = null; 
		
		if(tipo == "calabresa") {
			p = new PizzaCalabresaCarioca();
			p.preparar();
			p.assar();
			p.cortar();
			p.embalar();
		} else if (tipo == "napolitana") {
			p = new PizzaNapolitanaCarioca();
			p.preparar();
			p.assar();
			p.cortar();
			p.embalar();
		}
		return p;
	}

}
