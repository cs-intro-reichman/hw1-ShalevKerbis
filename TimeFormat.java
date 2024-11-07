// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) { 
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		
		String choosingFormat;
		if (hours <= 12){
			choosingFormat = "AM";
		} else {
			hours = hours - 12;
			choosingFormat = "PM";
		}


		if (minutes < 10){
			System.out.print(hours + ":" + "0" + minutes + " ");
		} else {
			System.out.print(hours + ":" + minutes + " ");	
		}

        System.out.println(choosingFormat);
	}
}