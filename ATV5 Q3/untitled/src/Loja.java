public class Loja {
    private String nome, ramo, fundacao;
    public Vendedor vendedor;
    public Loja(String nome, String ramo, String fundacao) {
        this.nome = nome;
        this.ramo = ramo;
        this.fundacao = fundacao;
    }
    public void admitirVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
        System.out.println("Vendedor contratado");
    }
    public void demitirVendedor(){
        this.vendedor = null;
        System.out.println("Vendedor Demitido");
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRamo(){
        return ramo;
    }
    public void setRamo(String ramo){
        this.ramo = ramo;
    }
    public String getFundacao(){
        return fundacao;
    }
    public void setFundacao(String fundacao){
        this.fundacao = fundacao;
    }
}


