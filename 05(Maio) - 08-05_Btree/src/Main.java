
public class Main {

	public static void main(String[] args) {

		
		Btree<Integer> tree = new Btree<>();
		tree.inserir(50);
		tree.inserir(75);
		tree.inserir(90);
		tree.inserir(63);
		tree.inserir(35);
		tree.inserir(23);
		tree.inserir(45);
		
		//System.out.println("Pré Ordem");
		//System.out.println(tree.preOrdem());
		
		//System.out.println("Em Ordem");
		//System.out.println(tree.emOrdem());
		
		System.out.println("Pós Ordem");
		System.out.println(tree.posOrdem());
		
		


	}

}
