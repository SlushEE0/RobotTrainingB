package frc.robot.commands.swerve;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Robot;
import frc.robot.utils.UtilityFunctions;
import java.util.function.Supplier;

/***
 * Default command to control the swerve subsystem with joysticks
 * 
 * @author Noah Simon
 * @author Raadwan Masum
 * @author Rohin Sood
 */

public class SwerveDefaultCommand extends Command {
  private boolean isFinished = false;

  public SwerveDefaultCommand() {

    super.addRequirements(Robot.swerve);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
  }

  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
    return isFinished;
  }
}
