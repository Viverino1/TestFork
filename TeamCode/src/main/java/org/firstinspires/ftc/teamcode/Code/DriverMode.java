package org.firstinspires.ftc.teamcode.Code;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.VergeTools.*;

public class DriverMode {
    Motor motor;
    Chassis chassis;
    public void Init(HardwareMap hardwareMap){
        motor = new Motor("motor", hardwareMap);
        chassis = new Chassis("1", "2", "3", "4", hardwareMap);
    }
    public void Loop() throws InterruptedException {
        motor.move(1);
        chassis.x.move(1);
    }
}