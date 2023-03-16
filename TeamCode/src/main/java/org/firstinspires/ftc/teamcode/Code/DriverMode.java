package org.firstinspires.ftc.teamcode.Code;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.VergeTools.*;

public class DriverMode {
    static Motor motor;
    public void Init(HardwareMap hardwareMap){
        motor = new Motor("motor", hardwareMap);
    }
    public void Loop() throws InterruptedException {
        motor.hold(0.2);
        motor.move(1);
        Thread.sleep(500);
        motor.stop();
        Thread.sleep(500);
    }
}