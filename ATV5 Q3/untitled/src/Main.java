public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja ("Livraria", "Livros", "2004");
        Vendedor vendedor = new Vendedor (30, "João");
        loja.admitirVendedor(vendedor);
        vendedor.vender();
        loja.demitirVendedor();
        System.out.println(loja.getNome() + " São José" );
    }

}