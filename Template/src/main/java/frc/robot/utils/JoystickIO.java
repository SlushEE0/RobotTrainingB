package frc.robot.utils;

import edu.wpi.first.wpilibj.DataLogManager;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Robot;
import frc.robot.commands.pid.PIDDefaultCommand;

/**
 * @author Neel Adem
 */
public class JoystickIO {

    private static final CommandXboxController pilot = new CommandXboxController(0);
    private static final CommandXboxController operator = new CommandXboxController(1);

    /**
     * Calls binding methods according to the joysticks connected
     */
    public static void getButtonBindings() {
        SmartDashboard.putString("[Runner]", "Set Button Bindings");

        if (DriverStation.isJoystickConnected(1)) {
            // if both xbox controllers are connected
            pilotAndOperatorBindings();
        } else if (DriverStation.isJoystickConnected(0)) {
            // if only one xbox controller is connected
            pilotBindings();
        } else if (Robot.isSimulation()) {
            // if in simulation
            simBindings();
        } else {
            pilotAndOperatorBindings();
        }

        setDefaultCommands();
    }

    public static void pilotAndOperatorBindings() {
    }

    public static void pilotBindings() {
        pilot.x().onTrue(Commands.runOnce(() -> System.out.println("hello")));
    }

    public static void simBindings() {
        pilotBindings();
    }

    public static void setDefaultCommands() {
        if (Robot.isSimulation()) {
            setSimDefaultCommands();
        } else {
            setRealDefaultCommands();
        }
    }

    private static void setRealDefaultCommands() {

    }

    private static void setSimDefaultCommands() {
        SmartDashboard.putString("[Runner]", "Set Sim Default Commands");
        // Robot.swerve
        // .setDefaultCommand(Commands.runOnce(() -> System.out.println("Set Swerve
        // Default Command")));
        Robot.pidExample.setDefaultCommand(new PIDDefaultCommand());
    }

}
