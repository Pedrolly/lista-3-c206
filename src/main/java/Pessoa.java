public class Pessoa extends Endereço {
    public String nome;
    public int cpf;
    Endereço[] endereço = new Endereço[10];

    public void pessoa(String nome, int cpf, int qtdEnd) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void addEndereço(Endereço end) {
        for (int i = 0; i < endereço.length; i++) {
            if (endereço[i] == null) {
                endereço[i] = end;
            }
        }
    }

    public void mostrainfo() {
        for (int i = 0; i < endereço.length; i++) {
            if (endereço[i] != null) {
                System.out.println("nome: " + nome);
                System.out.println("cpf: " + cpf);
                System.out.println("bairro: " + getBairro());
                System.out.println("rua: " + rua);
                System.out.println("numero: " + num);
                break;
            }
        }
    }
}
