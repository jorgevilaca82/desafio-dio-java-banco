## Desafio Java Banco

Output do projeto

```
ContaCorrente [Ag: 00001 Número: 1]
ContaCorrente [Ag: 00001 Número: 2]
ContaCorrente [Ag: 00001 Número: 1]: O saldo atual da conta é -> 0.0
ContaCorrente [Ag: 00001 Número: 2]: O saldo atual da conta é -> 0.0
ContaCorrente [Ag: 00001 Número: 1]: Foi realizado um depósito na conta no valor de 1000.0
ContaCorrente [Ag: 00001 Número: 1]: O saldo atual da conta é -> 1000.0
ContaCorrente [Ag: 00001 Número: 2]: Foi realizado um depósito na conta no valor de 1000.0
ContaCorrente [Ag: 00001 Número: 2]: O saldo atual da conta é -> 1000.0
ContaCorrente [Ag: 00001 Número: 1]: Foi realizado um saque na conta no valor de 50.0
ContaCorrente [Ag: 00001 Número: 1]: O saldo atual da conta é -> 950.0
ContaCorrente [Ag: 00001 Número: 2]: Foi realizado um saque na conta no valor de 25.0
ContaCorrente [Ag: 00001 Número: 2]: O saldo atual da conta é -> 975.0
Foi realizado uma transferência: ContaCorrente [Ag: 00001 Número: 1] para ContaCorrente [Ag: 00001 Número: 2] no valor de 100.0
ContaCorrente [Ag: 00001 Número: 1]: O saldo atual da conta é -> 850.0
ContaCorrente [Ag: 00001 Número: 2]: O saldo atual da conta é -> 1075.0

---Extrato Conta 1---
ContaMovimentacao [operacao=DEPOSITO, valor=1000.0, origem=null, destino=null]
ContaMovimentacao [operacao=SAQUE, valor=50.0, origem=null, destino=null]
ContaMovimentacao [operacao=TRANSFERENCIA, valor=100.0, origem=null, destino=ContaCorrente [Ag: 00001 Número: 2]]

---Extrato Conta 2---
ContaMovimentacao [operacao=DEPOSITO, valor=1000.0, origem=null, destino=null]
ContaMovimentacao [operacao=SAQUE, valor=25.0, origem=null, destino=null]
ContaMovimentacao [operacao=DEPOSITO, valor=100.0, origem=ContaCorrente [Ag: 00001 Número: 1], destino=null]
---
```
