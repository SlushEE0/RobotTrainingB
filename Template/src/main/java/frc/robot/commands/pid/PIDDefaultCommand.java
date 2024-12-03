package frc.robot.commands.pid;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.pid.PID;

public class PIDDefaultCommand extends Command {
  private boolean isFinished = false;

  private double WHEEL_DESIRED_ANGLE = Units.degreesToRadians(50);

  private PID wheel = Robot.pidExample;
  private PIDController controller = new PIDController(0, 0, 0);

  public PIDDefaultCommand() {
    super.addRequirements(Robot.pidExample);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    SmartDashboard.putNumber("Wheel Desired Angle", Units.radiansToDegrees(WHEEL_DESIRED_ANGLE));


  }

  @Override
  public void end(boolean interrupted) {
    wheel.setVoltage(0);
  }

  @Override
  public boolean isFinished() {
    return isFinished;
  }
}
