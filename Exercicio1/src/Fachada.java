
public class Fachada {
	
	Servicos sv = new Servicos();

	public void criaProduto(String nome, String fabri, int prec) {
		sv.criarProduto(nome, fabri, prec);
	}
	
	public void criaLote(Produto prod, int quant, int data ) {
		sv.criarLote(prod, quant, data);
	}

}
