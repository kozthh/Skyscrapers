# Payment Gateway

This Java exercise models payment methods and notification providers behind interfaces and a factory. It is for practicing abstraction while keeping the application independent of concrete vendors.

## What you can learn

- How interfaces define stable contracts.
- How a factory selects an implementation.
- How multiple notification implementations can share one rule.
- Where abstraction reduces coupling and where it adds indirection.

Start at `src/PaymentGatewayApp.java`, then trace one payment into `src/payments` and one notification into `src/notifications`. Add a payment method without changing the caller.# payment-gateway

Abstraction practice project for payment and notification flows.