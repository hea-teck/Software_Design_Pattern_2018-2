package hansung.designpatterns.command.party;

import java.util.Scanner;

public class RemoteLoader {

	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl();

		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();

		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);


		LightDimUpCommand dimUp = new LightDimUpCommand(light); //추가
		LightDimDownCommand dimDown = new LightDimDownCommand(light); //추가

		Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn, dimUp }; // 추가
		Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff, dimDown }; //추가

		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);

		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
		remoteControl.setCommand(1, lightOn, lightOff);
		remoteControl.setCommand(2, stereoOn, stereoOff);
		remoteControl.setCommand(3, tvOn, tvOff);
		remoteControl.setCommand(4, hottubOn, hottubOff);
		remoteControl.setCommand(5, dimUp, dimDown); //추가

		do {
			System.out.println(remoteControl);
			Scanner scan = new Scanner(System.in);
			System.out.print("괄호 안의 버튼 번호를 입력하시오:");
			String input = scan.next();
			switch (input) {
				case "0":
					System.out.println("--- Pushing Macro On---");
					remoteControl.onButtonWasPushed(0);
					break;
				case "1":
					System.out.println("--- Pushing Macro Off---");
					remoteControl.offButtonWasPushed(0);
					break;
				case "2":
					System.out.println("--- Pushing Light On---");
					remoteControl.onButtonWasPushed(1);
					break;
				case "3":
					System.out.println("--- Pushing Light Off---");
					remoteControl.offButtonWasPushed(1);
					break;
				case "4":
					System.out.println("--- Pushing Stereo On---");
					remoteControl.onButtonWasPushed(2);
					break;
				case "5":
					System.out.println("--- Pushing Stereo Off---");
					remoteControl.offButtonWasPushed(2);
					break;
				case "6":
					System.out.println("--- Pushing TV On---");
					remoteControl.onButtonWasPushed(3);
					break;
				case "7":
					System.out.println("--- Pushing TV Off---");
					remoteControl.offButtonWasPushed(3);
					break;
				case "8":
					System.out.println("--- Pushing Hot Tub On---");
					remoteControl.onButtonWasPushed(4);
					break;
				case "9":
					System.out.println("--- Pushing Hot Tub Off---");
					remoteControl.offButtonWasPushed(4);
					break;




				case "10": //추가
					if(light.getLevel() != 0) { //불이 켜있으면 작동해라
						System.out.println("--- Pushing Dim Up---");
						remoteControl.onButtonWasPushed(5);
					}
					else  //불이 0이라면 즉 꺼져있다면 동작하지 않는다.
						System.out.println("It can not work. Please turn on the light.");
					break;

				case "11": //추가
					if(light.getLevel() != 0) { //불이 켜있으면 작동해라
						System.out.println("--- Pushing Dim Down---");
						remoteControl.offButtonWasPushed(5);
					}
					else  //불이 0이라면 즉 꺼져있다면 동작하지 않는다.
						System.out.println("It can not work. Please turn on the light.");
					break;



				case "14":
					System.out.println("--- Undo ---");
					remoteControl.undoButtonWasPushed();
					break;
			}
		} while (true);

	}
}
