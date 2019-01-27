package frc.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;

import frc.robot.Robot;

public class MotorDrive extends InstantCommand{

    @Override
    protected void execute() {
     
        Robot.mainMotorController.set(1);
       
    }
}