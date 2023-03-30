
package newRoughWork

import scala.io.StdIn

sealed trait PaymentMethod {
  def processPayment(amount: Double): Unit
}

//CreditCard class contains functionality for Credit Card
case class CreditCard(cardNumber: Long, expiryDate: String, cvv: Int) extends PaymentMethod {
  //override method processPayment with details of Creditcard
  override def processPayment(amount: Double): Unit = {
    println("CreditCard payment mode added successfully")
    println(s"Processing Credit card Payment of rs 4500 with card number : $cardNumber")
    println(s"Now available balance is : ${amount - 4500}")
  }
}

//CreditCard class contains functionality for Paypal
case class Paypal(emailId: String, password: String) extends PaymentMethod {
  //override method processPayment with details of Paypal
  override def processPayment(amount: Double = 9000.0): Unit = {
    println("Paypal payment mode added successfully")
    println(s"An amount of 3500 is debited from PayPal id : $emailId ")
    println(s"Available amount is ${amount - 3500.0}")
  }
}

//CreditCard class contains functionality for Paypal
case class Banktransfer(accountNumber: Long, pinPass: Int) extends PaymentMethod {
  //override method processPayment with details of BankTransfer
  override def processPayment(amount: Double = 12000.0): Unit = {
    println("Banktransfer payment mode added successfully")
    println(s"An amount of 5400 is debited from account number : $accountNumber ")
    println(s"Available balance is ${amount - 6000}")
  }
}


