package org.usfirst.frc.team4964.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class TestCommand extends CommandGroup{
	public TestCommand() {
		// DriveForward(Duration, Speed)
		addSequential(new DriveForward(2, 0.25));
		addSequential(new SwerveRotate(90, 0.25));
		addSequential(new DriveForward(2, 0.25));
		addSequential(new SwerveRotate(90, 0.25));
//		addSequential(new DriveForward(2, 0.5));
//		addSequential(new SwerveRotate(90, 0.25));
//		addSequential(new DriveForward(2, 0.5));
//		addSequential(new SwerveRotate(90, 0.25));
//		addSequential(new DriveForward(2, 0.5));
//		addSequential(new SwerveRotate(90, 0.25));
		
	}

}