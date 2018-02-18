/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4964.robot;

import org.usfirst.frc.team4964.robot.commands.TestCommand;
import org.usfirst.frc.team4964.robot.subsystems.Swerve;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;

//import com.team254.frc2016.vision.TargetInfo;
//import com.team254.frc2016.vision.VisionServer;
//import com.team254.frc2016.vision.VisionUpdate;
//import com.team254.frc2016.vision.VisionUpdateReceiver;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	public static Robot robot;
	public static Joystick joy1, joy2;
	public static Swerve swerve;
	public static ADXRS450_Gyro gyro;

	Command autoCommand;
	SendableChooser<Command> autoChooser;
	double test;

	public void robotInit() {
	    SmartDashboard.putNumber("Speed", .5);
	    SmartDashboard.putNumber("x", -15);
	    SmartDashboard.putNumber("y", 75);
	    SmartDashboard.putNumber("driveSpeed", .5);
        SmartDashboard.putNumber("angle", 60);
        SmartDashboard.putNumber("duration", 3);
		test = 0;
		robot = this;
		System.out.println("robot init");
		joy1 = new Joystick(0);
		joy2 = new Joystick(1);
		gyro = new ADXRS450_Gyro();
		//		fancygyro = new DOF9(edu.wpi.first.wpilibj.I2C.Port.kOnboard,0,-1);
		swerve = new Swerve(joy1, gyro);
		
	
		
		autoChooser = new SendableChooser<Command>();
		autoChooser.addDefault("TestCommand", new TestCommand());
		
		SmartDashboard.putData("Autonomous mode chooser", autoChooser);
		SmartDashboard.putNumber("Gyro angle", gyro.getAngle());
	}


	public void autonomousInit() {
		gyro.reset();

		if (autoCommand != null) autoCommand.cancel();
		autoCommand = (Command) autoChooser.getSelected();
		autoCommand.start();
	}

	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during operator control
	 */
	public void teleopInit(){
		//gyro.reset();   
		//swerve.setPivot(0, 0);
		
	}
	
	Talon frontLeft = new Talon(9);
	
	public void teleopPeriodic() {
		
		frontLeft.setSpeed(joy1.getY());
		
		//swerve.move();
		SmartDashboard.putNumber("Gyro angle", gyro.getAngle());
	}
	public void disabledInit() {
		if (autoCommand != null) autoCommand.cancel();
	}
	public void disabledPeriodic(){
		swerve.smartDash();
	}
	/**
	 * This function is called periodically during test mode
	 */
	public void testPeriodic() {

	}

}