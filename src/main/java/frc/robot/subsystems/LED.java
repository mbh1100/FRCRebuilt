package frc.robot.subsystems;

import frc.robot.Constants;
import frc.robot.RobotMap;
import frc.robot.testingdashboard.SubsystemBase;
import frc.robot.utils.FieldUtils;
import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.util.Color;
import frc.robot.Constants;
import frc.robot.Constants.LEDConstants;

public class LED extends SubsystemBase{
    private static LED m_LEDLights = null;

    private AddressableLED m_LED;
    private AddressableLEDBuffer m_LEDBuffer;

    private LED() {
        super("LED");

        m_LED = new AddressableLED(cfgInt("LEDPort"));

        m_LEDBuffer = new AddressableLEDBuffer(cfgInt("LEDCount"));
        m_LED.setLength(cfgInt("LEDCount"));

        m_LED.start();
    }

    public static LED getInstance() {
        if (m_LEDLights == null) {
            m_LEDLights = new LED();
        }
        return m_LEDLights;
    }

    public void setLights(){
        FieldUtils.GameState gameState = FieldUtils.getInstance().getGameState();
        double currentMatchTime = FieldUtils.getInstance().stateTimeLeft();
        if (currentMatchTime < cfgDbl("stateChangeWarningTime")){
            //something to alter the existing colors
        }

        switch (gameState){
            case AUTO:
                break;
            case TRANSITION:
                break;
            case RED_START:
                break;
            case BLUE_START:
                break;
            case ENDGAME:
                break;
            default: 
                break;
        }
    }
    

    @Override
    public void periodic() {
        m_LED.setData(m_LEDBuffer);
        super.periodic();
    }
}
