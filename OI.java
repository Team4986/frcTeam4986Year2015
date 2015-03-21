package org.usfirst.frc.team4986.robot;

import org.usfirst.frc.team4986.robot.commands.elevatorDown;
import org.usfirst.frc.team4986.robot.commands.elevatorUp;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    Joystick left = new Joystick(0);
    Joystick right = new Joystick(1);
    // this creates a joystick in the code and sets them up with a port value
	//// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    public Joystick getLeft(){
    	return left;
    }
   public Joystick getRight(){
	   return right;
   }
   
   Button rightTrigger = new JoystickButton(right, 1);
   Button rightTwo = new JoystickButton(right, 2);
   public OI() {
   rightTrigger.whileHeld(new elevatorUp());
   rightTwo.whileHeld(new elevatorDown());
   }
   // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

