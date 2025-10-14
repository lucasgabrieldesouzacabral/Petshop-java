package model;

public class PetshopMain {
    public static void main(String[] args) {
        
        Petshop petshop = new Petshop("PetLovers", "Liberdade, 123");
        // ----------------------------------------------------------------
        Funcionario funcionario = new Funcionario("Nadir", "Atendente", 2500.0);
        Funcionario funcionario2 = new Funcionario("Albert Einstein", "Veterinário", 5000.0);
        // ----------------------------------------------------------------
        Cliente cliente = new Cliente("Juliete", "Rua dos Cuscuz, 456");
        Cliente cliente2 = new Cliente("Davi Brito", "Rua das Calabresas, 789");
        // ----------------------------------------------------------------
        Animal animal = new Animal(1, "Zaczinho", 5, "Cachorro", "Pitbull", cliente, 20.5);
        Animal animal2 = new Animal(2, "Mimo Pingo Fahrenheit Pessoa", 3, "Gato", "Siamês", cliente2, 10.0);
        // ----------------------------------------------------------------
        cliente.adicionarAnimal(animal);
        cliente2.adicionarAnimal(animal2);
        // ----------------------------------------------------------------
        funcionario.adicionarAnimalAtendido(animal);
        funcionario2.adicionarAnimalAtendido(animal2);
        // ----------------------------------------------------------------
        Item item = new Item(1,"Banho e Tosa", 150.0);
        Item item2 = new Item(2,"Consulta Veterinária", 200.0);
        Item item3 = new Item(3,"Bolinha de morder", 10.0);
        Item item4 = new Item(4,"Ração Premium 50kg", 150.0);
        // ----------------------------------------------------------------
        Servico servico = new Servico(1, animal, funcionario, item, "10:00 AM");
        Servico servico2 = new Servico(2, animal2, funcionario2, item2, "11:00 AM");
        // ----------------------------------------------------------------
        Produto produto = new Produto(1, "Bolinha de morder", 10.0);
        Produto produto2 = new Produto(2, "Ração Premium 50kg", 150.0);
        // ----------------------------------------------------------------
        
        System.out.println("=== Clientes ===");
        System.out.println("Nome: " + cliente.getNome() + " | Telefone: " + cliente.getTelefone() + " | Endereço: " + cliente.getEndereco());
        System.out.println("Nome: " + cliente2.getNome() + " | Telefone: " + cliente2.getTelefone() + " | Endereço: " + cliente2.getEndereco());

        System.out.println("\n=== Animais ===");
        System.out.println("ID: " + animal.getIdAnimal() + " | Nome: " + animal.getNomeAnimal() + " | Dono ID: " + animal.getIdDono() + " | Especie: " + animal.getEspecieAnimal() + " | Idade: " + animal.getIdadeAnimal() + " anos" + " | Raça: " + animal.getRacaAnimal() + " | Peso: " + animal.getPesoAnimal() + " kg");
        System.out.println("ID: " + animal2.getIdAnimal() + " | Nome: " + animal2.getNomeAnimal() + " | Dono ID: " + animal2.getIdDono() + " | Especie: " + animal2.getEspecieAnimal() + " | Idade: " + animal2.getIdadeAnimal() + " anos" + " | Raça: " + animal2.getRacaAnimal() + " | Peso: " + animal2.getPesoAnimal() + " kg");

        System.out.println("\n=== Funcionários ===");
        System.out.println("Nome: " + funcionario.getNomeFuncionario() + " | Função: " + funcionario.getfuncao() + " | Salário: R$" + funcionario.getsalario() + " | Animais Atendidos: " + funcionario.getAnimaisAtendidos().size());
        System.out.println("Nome: " + funcionario2.getNomeFuncionario() + " | Função: " + funcionario2.getfuncao() + " | Salário: R$" + funcionario2.getsalario() + " | Animais Atendidos: " + funcionario2.getAnimaisAtendidos().size());

        System.out.println("\n=== Serviços Disponíveis ===");
        System.out.println("Serviço ID: " + servico.getidItem() + " | Nome: " + servico.getnomeItem() + " | Preço: " + servico.getprecoItem() + " | Horário: " + servico.getservicoHorario());
        System.out.println("Serviço ID: " + servico2.getidItem() + " | Nome: " + servico2.getnomeItem() + " | Preço: " + servico2.getprecoItem() + " | Horário: " + servico2.getservicoHorario());

        System.out.println("\n=== Produtos Disponíveis ===");
        System.out.println("ID: " + produto.getidItem() + " | Nome: " + produto.getnomeItem() + " | Preço: " + produto.getprecoItem());
        System.out.println("ID: " + produto2.getidItem() + " | Nome: " + produto2.getnomeItem() + " | Preço: " + produto2.getprecoItem());

    }
}