## Desafio Java Banco

Output do projeto

```
ContaCorrente [Ag: 00001 Número: 1]
ContaCorrente [Ag: 00001 Número: 2]
ContaCorrente [Ag: 00001 Número: 1]: O saldo atual da conta é -> R$ 0,00
ContaCorrente [Ag: 00001 Número: 2]: O saldo atual da conta é -> R$ 0,00
ContaCorrente [Ag: 00001 Número: 1]: Foi realizado um depósito na conta no valor de R$ 1.000,00
ContaCorrente [Ag: 00001 Número: 1]: O saldo atual da conta é -> R$ 1.000,00
ContaCorrente [Ag: 00001 Número: 2]: Foi realizado um depósito na conta no valor de R$ 1.000,00
ContaCorrente [Ag: 00001 Número: 2]: O saldo atual da conta é -> R$ 1.000,00
ContaCorrente [Ag: 00001 Número: 1]: Foi realizado um saque na conta no valor de R$ 50,00
ContaCorrente [Ag: 00001 Número: 1]: O saldo atual da conta é -> R$ 950,00
ContaCorrente [Ag: 00001 Número: 2]: Foi realizado um saque na conta no valor de R$ 25,00
ContaCorrente [Ag: 00001 Número: 2]: O saldo atual da conta é -> R$ 975,00
Foi realizado uma transferência: ContaCorrente [Ag: 00001 Número: 1] para ContaCorrente [Ag: 00001 Número: 2] no valor de R$ 100,00
ContaCorrente [Ag: 00001 Número: 1]: O saldo atual da conta é -> R$ 850,00
ContaCorrente [Ag: 00001 Número: 2]: O saldo atual da conta é -> R$ 1.075,00

---Extrato Conta 1---
ContaMovimentacao [operacao=DEPOSITO, valor=R$ 1.000,00, origem=null, destino=null]
ContaMovimentacao [operacao=SAQUE, valor=R$ 50,00, origem=null, destino=null]
ContaMovimentacao [operacao=TRANSFERENCIA, valor=R$ 100,00, origem=null, destino=ContaCorrente [Ag: 00001 Número: 2]]

---Extrato Conta 2---
ContaMovimentacao [operacao=DEPOSITO, valor=R$ 1.000,00, origem=null, destino=null]
ContaMovimentacao [operacao=SAQUE, valor=R$ 25,00, origem=null, destino=null]
ContaMovimentacao [operacao=DEPOSITO, valor=R$ 100,00, origem=ContaCorrente [Ag: 00001 Número: 1], destino=null]
---
```
