package package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import NumberService.NumberService;

public class MainService extends NumberService {

	public MainService(int number) {
		super(number);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int value;
		NumberService service = new NumberService(1);

		System.out.print("Enter a FileName  : ");
		String fileName = sc.nextLine();
	
		if (fileName.trim().equals("")) {
			do {
				
				System.out.print("Enter a number : ");
				value = sc.nextInt();
				service.evaluateNumber(value);
			} while (value != 0);

		}
		else
		{
			try {
				int number ;
				sc = new Scanner(new File("numbers.txt"));
				System.out.println("Reading values from the file.");
				while(sc.hasNext())
				{
					number = sc.nextInt();
					service.evaluateNumber(number);
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}


