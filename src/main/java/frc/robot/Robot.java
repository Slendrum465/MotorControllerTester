/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.commands.MotorDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


/**
 * 
 */
public class Robot extends TimedRobot {

  public static WPI_TalonSRX mainMotorController;
  public static Joystick xboxController;

  /**
   * 
   */
  @Override
  public void robotInit() {

    mainMotorController = new WPI_TalonSRX(0);

  }

  /**
   * 
   */
  @Override
  public void robotPeriodic() {
  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {


    (new JoystickButton(xboxController, RobotMap.xboxButtons.A.button)).whileHeld(new MotorDrive());


  }

}
