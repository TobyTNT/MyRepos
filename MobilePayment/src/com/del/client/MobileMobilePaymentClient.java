package com.del.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.del.exception.PaymentException;
import com.del.service.PaymentService;
import com.del.service.PaymentServiceImplementation;


public class MobileMobilePaymentClient {


		private PaymentService pService;

		public MobileMobilePaymentClient() {

			pService = new PaymentServiceImplementation();

			Scanner scan = new Scanner(System.in);
			int choice = 0;
			System.out.println("Mobile Payment System...");
			System.out.println("Enter login");
			String login = scan.nextLine();
			
			System.out.println("Enter Password");
			String password = scan.nextLine();
			
			boolean loginSuccess = pService.authenticate(login, password);

			if (loginSuccess) {

				System.out.println(" User is " + login);
				double bal = pService.getBalance();
				if (bal < 0) {
					System.out.println("Pending Amount is  Rs " + -(bal));
				} else {
					System.out.println("Balance is Rs " + bal);
				}

				while (true) {
					choice = getChoice(scan);
					switch (choice) {

					case 1:
						System.out.print("Enter payment ammount");
						double amount = 0;
						try {
							amount = scan.nextDouble();
							pService.payAmount(amount);
							System.out.println("Ammount of " + amount + " Recieved");
						} catch (PaymentException ee) {
							System.out.println(ee.getMessage());
						} catch (InputMismatchException e2) {
							System.out.println("Enter digits only");
							scan.nextLine();// consume the keyboard input
						}

					case 2:
						
						double balance = pService.getBalance();
						if (balance < 0) {
							System.out.println(" Pending Amount is Rs " + -balance + " debit");
						} else {
							System.out.println("Balance is Rs " + balance + " credit");
						}
						break;

					case 3:
						System.out.println("Terminated by User");
						scan.close();
						System.exit(0);
						break;

					default:
						System.out.println("Wrong choice");
						break;

					}
				}
			}else {
				System.out.println("login failed");
			}

			scan.close();

		}

		private int getChoice(Scanner scan) {

			int choice = 0;
			System.out.println("Mobile Payment System");
			System.out.println("1. Pay Amount");
			System.out.println("2. Check Pending Amount");
			System.out.println("3. Exit");
			System.out.println("Enter Choice: ");
			try {
				choice = scan.nextInt();
				
				
			} catch (InputMismatchException e1) {
				System.out.println("Input a number");
				scan.nextLine();

			}

			return choice;

		}

		public static void main(String[] args) {

			new MobileMobilePaymentClient();
		}

	

	}


