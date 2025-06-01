# 🎫 Event Booking System (Java)

An object-oriented event ticket booking system built in Java, designed with SOLID principles.  
This project demonstrates clean architecture, abstraction, extensibility, and a user account system for realistic event booking workflows.

---

## 📌 Features

- 👤 User account registration and login
- 🎟 Book tickets for various event types (Concerts, Workshops)
- 💳 Process payments via different methods (CreditCard, DebitCard, Paypal)
- 📩 Send booking confirmations via Email or SMS
- 📊 Generate detailed ticket booking reports
- 🧱 Modular, SOLID-compliant Java architecture

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
Event name: Astro Game| Date: July 7, 2025| Location: Texas| Price: $80| ID: 147
Event name: Elsa Movie| Date: Sep 26, 2025| Location: Florida| Price: $10| ID: 146
Event name: BTS Concert| Date: May 2, 2025| Location: New York| Price: $200| ID: 145
```
#### [2] Book a Ticket
1. Select event by ID:
2. Confirm user name is auto-filled from logged-in user.
3. Select payment method:
```bash
[1] Credit Card/Debit
[2] PayPal
```
4. Select notification method:
```bash
[1] Email
[2] SMS
```
5. Confirmation message:
```bash
***Your ticket has been booked sucessfully***
----Event Details----
Event name: Elsa Movie| Date: Sep 26, 2025| Location: Florida| Price: 10| ID: 146
---Billing Information---
Customer name: mincy
Payment method: Payment Method: Credit/Debitcard
The notification sent via: 456-789-7299
```
#### [3] View My Tickets
```bash
Event name: Elsa Movie| Date: Sep 26, 2025| Location: Florida| Price: 10| ID: 146
```
#### [4] Logout
Returns user to the Pre-Login Menu.
