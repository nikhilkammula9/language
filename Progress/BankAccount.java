public class BankAccount {
  	public static void main(String[] args){
      double balance = 25000;
      double amountToWithdraw = 500;
      double updatedBalance = balance - amountToWithdraw;
      double amountForEachFriend = updatedBalance/3;
      double ticketAmount = 500;
      boolean canPurchaseTicket = amountForEachFriend >= ticketAmount;
    
      String message = " I gave each friend" + " " +amountForEachFriend + "...";
      System.out.println(message);
    }       
}
