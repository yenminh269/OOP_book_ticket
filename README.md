# 🎫 Event Booking System (Java)

An object-oriented event ticket booking system built in Java, designed with SOLID principles.  
This project demonstrates clean architecture, abstraction, extensibility, and a user account system for realistic event booking workflows.

---

## 📌 Features

- 👤 User account registration and login
- 🎟 Book tickets for various event types (Concerts, Workshops)
- 💳 Process payments via different methods (CreditCard, PayPal, VNPay)
- 📩 Send booking confirmations via Email or SMS
- 📊 Generate detailed ticket booking reports
- 🧱 Modular, SOLID-compliant Java architecture

---

## 🧱 SOLID Principles in Practice

| Principle | Implementation |
|----------|----------------|
| **S** - Single Responsibility | Separate classes for user management, event handling, booking, payment, and notifications |
| **O** - Open/Closed | Easily add new event/payment/notification/user features without modifying existing code |
| **L** - Liskov Substitution | `BaseEvent` replaced by `Concert`/`Workshop` subclasses without affecting program logic |
| **I** - Interface Segregation | Interfaces are focused and granular (e.g., `PaymentMethod`, `Notifier`, `UserManager`) |
| **D** - Dependency Inversion | High-level classes depend on interfaces, not concrete classes |

---

## 📁 Project Structure (Java Package Suggestion)
```bash
src/
└── com/
└── eventbooking/
├── main/
│ └── Main.java
│
├── model/
│ ├── Event.java
│ ├── Concert.java
│ ├── Workshop.java
│ ├── Ticket.java
│ └── User.java
│
├── service/
│ ├── BookingManager.java
│ ├── ReportGenerator.java
│ └── UserManager.java
│
├── payment/
│ ├── PaymentMethod.java
│ ├── CreditCardPayment.java
│ ├── PayPalPayment.java
│ └── VNPayPayment.java
│
└── notification/
│ ├── Notifier.java
│ ├── EmailNotifier.java
│ └── SMSNotifier.java
```
## 🧭 Application Flow (CLI Menu)

### Pre-Login Menu
```bash
[1] Register New Account
[2] Login
[3] Exit
```
### After Successful Login
```bash
[1] View All Events
[2] Book a Ticket
[3] View My Tickets
[4] Logout
```
### Detailed Steps
#### [1] View All Events
```bash
ID: E001 | Type: Concert | Name: Rock Night | Date: 2025-06-10 | Location: Hanoi | Price: 500000 VND
ID: E002 | Type: Workshop | Name: AI in Practice | Date: 2025-06-20 | Location: HCMC | Price: 300000 VND
```
#### [2] Book a Ticket
1. Select event by ID:
2. Confirm user name is auto-filled from logged-in user.
3. Select payment method:
```bash
[1] Credit Card
[2] PayPal
[3] VNPay
```
4. Select notification method:
```bash
[1] Email
[2] SMS
```
5. Confirmation message:
```bash
Booking successful!
Ticket ID: T1001
Event: Rock Night
Buyer: Alice Nguyen
Paid: 500,000 VND via VNPay
Notification sent via SMS
```
#### [3] View My Tickets
```bash
Ticket ID: T1001
Event: Rock Night
Buyer: Alice Nguyen
Paid: 500,000 VND via VNPay
Notification: SMS
```
#### [4] Logout
Returns user to the Pre-Login Menu.
