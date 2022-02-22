public class Principal {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();
        Empregado empregado2 = new Empregado();

        empregado.setNome("Éric");
        empregado.setEndereco("Rua tal");
        empregado.setTelefone("11-22222-3333");
        empregado.setSalario(1000);

        empregado2.setNome("Ruan");
        empregado2.setEndereco("Rua Barry Allen");
        empregado2.setTelefone("11-22222-3333");
        empregado2.setSalario(2000);

        System.out.println("Nome: "+empregado.getNome());
        System.out.println("Endereço: "+empregado.getEndereco());
        System.out.println("Telefone: "+empregado.getTelefone());
        System.out.println("Salário: "+empregado.getSalario());

        System.out.println("--------------------------------------------");

        System.out.println("Nome: "+empregado2.getNome());
        System.out.println("Endereço: "+empregado2.getEndereco());
        System.out.println("Telefone: "+empregado2.getTelefone());
        System.out.println("Salário: "+empregado2.getSalario());
    }
}
