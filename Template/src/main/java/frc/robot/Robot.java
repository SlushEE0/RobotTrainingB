package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.pid.PIDDefaultCommand;
import frc.robot.subsystems.pid.PID;
import frc.robot.subsystems.swerve.Swerve;

public class Robot extends TimedRobot {
  // public static final CommandXboxController pilot = new
  // CommandXboxController(0);
  // public static final CommandXboxController operator = new
  // CommandXboxController(1);

  public static Swerve swerve = new Swerve();
  public static PID pidExample = new PID();

  private RobotContainer m_robotContainer;

  @Override
  public void robotInit() {
    m_robotContainer = new RobotContainer();
  }

  @Override
  public void robotPeriodic() {
    CommandScheduler.getInstance().run();
  }

  @Override
  public void disabledInit() {

  }

  @Override
  public void disabledPeriodic() {
  }

  @Override
  public void disabledExit() {
  }

  @Override
  public void autonomousInit() {

  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void autonomousExit() {
  }

  @Override
  public void teleopInit() {

  }

  @Override
  public void teleopPeriodic() {
    SmartDashboard.putBoolean("[PID Default Command].isScheduled",
        CommandScheduler.getInstance().isScheduled(new PIDDefaultCommand()));
  }

  @Override
  public void teleopExit() {
  }

  @Override
  public void testInit() {
    CommandScheduler.getInstance().cancelAll();
  }

  @Override
  public void testPeriodic() {
  }

  @Override
  public void testExit() {
  }
}