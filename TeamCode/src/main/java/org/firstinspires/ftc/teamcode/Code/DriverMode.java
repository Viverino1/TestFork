package org.firstinspires.ftc.teamcode.Code;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.VergeTools.*;

public class DriverMode {
    Motor motor;
    public void Init(HardwareMap hardwareMap){
        motor = new Motor("Vivek's Fork", hardwareMap);
    }
    public void Loop() throws InterruptedException {
        motor.move(1);
    }
}