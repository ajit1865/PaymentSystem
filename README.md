![Screenshot from 2023-03-04 09-55-40](https://user-images.githubusercontent.com/125342543/229130674-c73bb08d-1703-49ee-8e32-3180f133ea68.png)
# Payment System for E-commerce Website
This project is a payment system for an e-commerce website that allows users to make payments using different payment methods such as credit cards, PayPal, and bank transfers.

The payment system is modular and provides the following functionalities:

Add a new payment method with details.

Process a payment using the added payment method.

List all the added payment methods.

## Usage

The payment system can be used by creating an instance of the PaymentSystem class and calling its methods.

### Adding a new payment method
To add a new payment method, call the addPaymentMethod method of the PaymentSystem 

## Processing a payment

To process a payment, call the processPayment method of the payment method object with the payment amount as an argument.

## Listing all payment methods

To list all the added payment methods, call the listPaymentMethods method of the PaymentSystem class. 

### Exception Handling

The project implements appropriate exception handling in case of errors or invalid inputs. Exceptions are thrown for the following scenarios:

Invalid credit card number, 
expiry date or CVV.
Invalid PayPal email ID or password.
Invalid bank account number or PIN pass.
Insufficient balance for processing a payment.

### Unit Test Cases

Unit test cases are written using the ScalaTest library to ensure that the project works as expected. The test cases cover more than 90% of the code, ensuring high code coverage.

