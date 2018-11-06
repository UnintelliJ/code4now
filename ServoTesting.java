package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;

/**
 * A simple test of a continuous rotation servo
 */
@Autonomous(name="Test CR Servo", group ="Tests")
//@Disabled
public class ServoTesting extends LinearOpMode
{
    @Override
    public void runOpMode() throws InterruptedException
    {
        CRServo servo = this.hardwareMap.crservo.get("crservo");

        waitForStart();

        servo.setPower(1.0);
        Thread.sleep(4000);

        servo.setPower(0.0);
        Thread.sleep(1000);

        servo.setPower(-1.0);
        Thread.sleep(4000);
    }
}