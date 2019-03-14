
public class PizzaCalabresaPaulista extends Pizza {

	@Override
	public void preparar() {
		System.out.println("Colocando Calabresa");

	}

	@Override
	public void assar() {
		System.out.println("Assando a pizza");

	}

	@Override
	public void cortar() {
		System.out.println("Cortando em 8 fatias");
	}

	@Override
	public void embalar() {
		System.out.println("Embalando para viagem");
	}

}
