package org.usfirst.frc.team4964.robot.commands;

import org.usfirst.frc.team4964.robot.Robot;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;

public class SwerveRotate extends Command {
		double angle;
		double speed;
		double startTime;
	
		
		public SwerveRotate(double angle, double speed) {
			this.angle = Robot.gyro.getAngle() + angle;
			this.speed = speed;
		}
	
	public void initialize() {
		startTime = System.currentTimeMillis() / 1e3;
	}
	
	public void execute() {
	
		
		Robot.swerve.driveNormal(0, 0, speed);
		
//	    while (Math.abs(angle - Robot.gyro.getAngle()) > Steering.TURN_TOLERANCE)
//	    {
//	        Robot.swerve.driveNormal(0, 0, (angle < 0.0)? -speed: speed);
//	    }
	}
	
	protected boolean isFinished() {
	    //return (Math.abs(angle - Robot.gyro.getAngle()) < Steering.TURN_TOLERANCE);
		return Math.abs(Robot.gyro.getAngle()) > angle;
	}
	
	
	public void end() {
		Robot.swerve.driveNormal(0, 0, 0);
	}
}
