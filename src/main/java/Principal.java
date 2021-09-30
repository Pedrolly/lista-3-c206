public class Principal {
    public static void main(String[] args) {
        Pessoa person = new Pessoa();
        Endereço[] end1 = new Endereço[10];
        person.cpf = 192;
        person.setBairro("Bela vista");
        person.nome = "pedro";
        person.num = 12;
        person.rua = "carlos cordeiro";
        end1[0] = person;
        for (int i = 0; i < end1.length; i++) {
            if (end1[i] != null) {
                person.addEndereço(end1[i]);
                break;
            }
        }
        person.mostrainfo();
    }
}
