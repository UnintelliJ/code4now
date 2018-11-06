package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.*;
import com.qualcomm.robotcore.hardware.*;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.robotcore.internal.opmode.AnnotatedOpModeClassFilter;
@TeleOp(name="Servo", group="Teleop")

public class Servo extends OpMode{
    private CRServo bs;

    public void init(){
        bs = hardwareMap.crservo.get("crservo");

    }

    public void loop(){
        double drive = gamepad1.left_stick_y;
        double power;
        power    = Range.clip(drive,-1.0, 1.0) ;
        bs.setPower(power);

    }

}
