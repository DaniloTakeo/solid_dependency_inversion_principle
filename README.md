# Princípio da Inversão de Dependência (DIP) - Estudos em Java

Este repositório contém estudos sobre o **Princípio da Inversão de Dependência (DIP)** utilizando Java. Os exemplos demonstram cenários que violam o princípio e como podemos refatorá-los para seguir as boas práticas da programação orientada a objetos.

## Estrutura do Repositório

Cada caso de estudo é organizado da seguinte forma:

```
├── case1
│   ├── problem   # Código que viola o DIP
│   ├── solution  # Código refatorado aplicando o DIP
├── case2
│   ├── problem   # Código que viola o DIP
│   ├── solution  # Código refatorado aplicando o DIP
├── case3
│   ├── problem   # Código que viola o DIP
│   ├── solution  # Código refatorado aplicando o DIP
```

---

## 📌 Case 1 - Repositório de Pedidos

### **Problema** (Violação do DIP)
A classe `OrderService` depende diretamente da implementação concreta `MySQLOrderRepository`, o que causa alto acoplamento e dificulta mudanças no sistema.

### **Solução** (Aplicação do DIP)
Criamos uma abstração `OrderRepository` para que `OrderService` dependa de uma interface em vez de uma implementação concreta.

✅ **Benefícios**: Código desacoplado, testável e pronto para futuras extensões.

---

## 📌 Case 2 - Sistema de Notificações

### **Problema** (Violação do DIP)
A classe `NotificationService` depende diretamente da implementação `EmailNotifier`, tornando difícil a adição de novos tipos de notificação.

### **Solução** (Aplicação do DIP e Strategy Pattern)
Criamos a interface `Notifier` para permitir múltiplas implementações e aplicamos o **Strategy Pattern**.

✅ **Benefícios**: Código flexível, extensível e pronto para suportar múltiplos canais de notificação sem modificar `NotificationService`.

---

## 📌 Case 3 - Processamento de Pagamentos

### **Problema** (Violação do DIP)
A classe `PaymentProcessor` depende diretamente da implementação concreta `CreditCardPayment`, dificultando a adição de novos métodos de pagamento como boleto, PayPal ou Pix.

### **Solução** (Aplicação do DIP e Strategy Pattern)
Criamos a interface `PaymentMethod`, implementada por várias classes como `CreditCardPayment`, `BoletoPayment` e `PayPalPayment`. A classe `PaymentProcessor` passa a depender da abstração, e não de uma implementação específica.

✅ **Benefícios**: Facilita a expansão do sistema de pagamentos, reduz acoplamento e melhora a testabilidade do código.

---

## 📌 Conclusão

O DIP nos ajuda a construir sistemas mais flexíveis e desacoplados, permitindo mudanças sem impactar a estrutura do código. Além disso, a aplicação do **Strategy Pattern** facilita a expansão do sistema sem modificar as classes existentes.

Se quiser contribuir, sinta-se à vontade para adicionar novos exemplos e melhorias! 🚀

---

## 👨‍💻 Autor
Danilo Takeo Kanizawa

