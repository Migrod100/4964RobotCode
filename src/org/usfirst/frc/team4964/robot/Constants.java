package org.usfirst.frc.team4964.robot;

public class Constants {
	//Not a factory
	//Swerve
	
	// competition bot
	/*public final static double FL_ENC_OFFSET = 360-114;
	public final static double FR_ENC_OFFSET = 360-290+180;
	public final static double BL_ENC_OFFSET = 360-228;
	public final static double BR_ENC_OFFSET = 360-249+180;*/
	
	// practice bot
//	public final static double FL_ENC_OFFSET = -70;
//	public final static double FR_ENC_OFFSET = 10;
//	public final static double BL_ENC_OFFSET = -110;
//	public final static double BR_ENC_OFFSET = 1;
	
	public final static double BR_ENC_OFFSET = 360-(0.779*72);
	public final static double BL_ENC_OFFSET = 360-(2.137*72);
	public final static double FR_ENC_OFFSET = 360-(0.079*72);
	public final static double FL_ENC_OFFSET = 360-(1.165*72);



	
//	public final static double FL_ENC_OFFSET = 10;
//	public final static double FR_ENC_OFFSET = 15;
//	public final static double BL_ENC_OFFSET = -170;
//	public final static double BR_ENC_OFFSET = 10;

	public final static double WHEEL_BASE_WIDTH = 20;
	public final static double WHEEL_BASE_LENGTH = 20.5;


	//RobotMap
	public final static int FR_STEER = 4;
	public final static int BR_STEER = 0;
	public final static int BL_STEER = 2;
	public final static int FL_STEER = 6;

	public final static int FR_DRIVE = 5;
	public final static int BR_DRIVE = 1;
	public final static int BL_DRIVE = 3;
	public final static int FL_DRIVE = 7;

	public final static int FR_ENCODER = 2;
	public final static int BR_ENCODER = 0;
	public final static int FL_ENCODER = 3;
	public final static int BL_ENCODER = 1;

	public static class Steering {
		//Swerve
		public final static double SWERVE_STEER_CAP = 1; 
		public final static double SWERVE_STEER_P = 2; 
		public final static double SWERVE_STEER_I = 0; 
		public final static double SWERVE_STEER_D = 0;
		public final static double TURN_TOLERANCE = 0.5;

	}
}
