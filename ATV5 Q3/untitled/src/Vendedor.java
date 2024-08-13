public class Vendedor {
    private int idade;
    private String nome;
    public Vendedor(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }
    public void vender(){
        System.out.println(nome + " Vendeu com sucesso!");
    }
    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

}
