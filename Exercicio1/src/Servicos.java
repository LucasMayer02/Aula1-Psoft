
public class Servicos {
	
	Repositorio rep = new Repositorio();
	
	public void criarProduto(String nome, String fabricante, double preco) {
		Produto p1 = new Produto(nome, fabricante, preco);
		rep.adicionaProduto(p1.getId(), p1);
	}
	
	public void criarLote(Produto produto, int quantidade, int data) {
		Lote l1 = new Lote(produto, quantidade, data);
		rep.adicionaLote(l1.getId(), l1);
	}
}
