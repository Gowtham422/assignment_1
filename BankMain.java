package pkg_1;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;



public class BankMain {



	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);

		List<Bank> arr = new ArrayList<Bank>();

		Bank account;

		while (true) {

			account = new Bank();

			System.out.println("Enter Account Type (Saving or Current)");

			String accountType = s1.nextLine();

			if ((accountType.equalsIgnoreCase("Saving") || accountType.equalsIgnoreCase("Current"))) {

				System.out.println("You entered Account Type is:" + accountType);

				account.setAccountType(accountType);

			} else {

				System.out.println(" Invalied Accpunt type");

				continue;

			}



			System.out.println("Enter Account Holder Name");

			String Name = s1.nextLine();

			if (Name.length() > 0) {

				System.out.println("Account Holder Name is: " + Name);

				account.setAccountHolderName(Name);

			} else {

				System.out.println(" Invalied Name , please type Again ");

				continue;

			}


			System.out.println("Enter your 13 digit Account Number");

			String accountNumber = s1.nextLine();

			if (accountNumber.length() == 13) {

				System.out.println("Account Number is:" + accountNumber);

				try {

					account.setAccountNumber(Long.parseLong(accountNumber));

				} catch (NumberFormatException e) {

					System.out.println(" Invalied account number");

					continue;

				}

			} else {

				System.out.println(" Invalied Account Number");

				continue;

			}
			{


			System.out.println("Please Enter the Amount");

			String amount = s1.nextLine();

			System.out.println("Amount Entered is:" + amount);

			}



			System.out.println("Enter the Currency Type ");

			String currency = s1.nextLine();

			System.out.println("Currency Type:" + currency);

				account.setCurrency(currency);

			
			System.out.println("******************************************************");

			arr.add(account);

			System.out.println("Press Y to create next account");

			if (!s1.nextLine().equalsIgnoreCase("Y")) {

				break;

			}

		}
		

		System.out.println(" Number of accounts created:"+arr.size());



	}



}
