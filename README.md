# Java Challenge DIO

In this repository I created a Digital Bank-like system using Oriented-Object Programming principles.

- [x] Encapsulation
- [x] Abstraction
- [x] Inheritance
- [x] Polymorphism

## Features

- Create a Bank and set the name of it.
```
  Banco banco = new Banco();
  banco.setNome("Meu Banco");
```

- Create an instance of a client and choose between two types of accounts or both.
```
  Cliente paulo = new Cliente();
  paulo.setNome("Paulo");
  paulo.setCpf("02214534341");

  Conta cc = new ContaCorrente(paulo);
  ContaPoupanca poupanca = new ContaPoupanca(paulo);
```

- Add accounts to bank account list.
```
  List<Conta> contas = new ArrayList<>();
  contas.add(cc);
  contas.add(poupanca);

  banco.setContas(contas);
```

- Print account data.
```
  cc.impprimirDados();
  poupanca.impprimirDados();
```

- Deposit, Withdraw and Tranfer funds.
```
  cc.depositar(1000);
  cc.sacar(300);
  cc.transferir(500, poupanca);
```

- Print account balance.
```
  cc.imprimirExtrato();
  poupanca.imprimirExtrato();
```

- Register a unique Pix key for each account.
```
  poupanca.cadastrarChavePix("email", "paulo.sales@outlook.com", contas);
  cc.cadastrarChavePix("email", "paulo.sales@outlook.com", contas);
```

- Generate a random Credit Card and visualize it.
```
  Cartao cartao = new Cartao(paulo);
  cartao.impprimirDados();
```

## Output Example

```
===   Conta-Corrente   ===
=== Dados Titular ===
Titular: Paulo
CPF: 02214534341
=== Dados Bancários ===
Agencia: 1
Numero: 1
=========================

// Registrando chave pix na conta poupança
Chave 'paulo.sales@outlook.com' registrada com sucesso!

===   Conta-Poupança   ===
=== Dados Titular ===
Titular: Paulo
CPF: 02214534341
=== Dados Bancários ===
Agencia: 1
Numero: 2
Chave Pix: paulo.sales@outlook.com
=========================

// Tentando registrar a mesma chave pix na conta corrente
Chave Pix em uso!

=== Dados do Cartão de Crédito ===
Titular: Paulo
Numero: 9907899313953924
Validade: JULY/2027
CV: 146
=========================
```


## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
