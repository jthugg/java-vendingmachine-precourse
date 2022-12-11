package vendingmachine;

import vendingmachine.controllers.MachineController;

public class Application {

	public static void main(String[] args) {
		MachineController controller = new MachineController();
		controller.runMachine();
	}
}
