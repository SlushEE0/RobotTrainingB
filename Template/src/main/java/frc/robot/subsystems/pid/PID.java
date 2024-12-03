// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.pid;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.math.system.plant.DCMotor;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.simulation.FlywheelSim;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class PID extends SubsystemBase {
  private double MaxMotorVolts = 12;

  private FlywheelSim wheel = new FlywheelSim(DCMotor.getNEO(1), 6.75, 0.04);

  public double wheelAppliedVolts = 0;
  public double wheelAngleRads = 0;

  @Override
  public void periodic() {
    wheel.update(0.020);


    SmartDashboard.putNumber("Wheel Voltage", wheelAppliedVolts);
    SmartDashboard.putNumber("Wheel Angle Deg", Units.radiansToDegrees(wheelAngleRads));
  }

  public void setVoltage(double volts) {
  }
}