package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

public class OI {
    private static OI m_OI;

    private XboxController m_driverXboxController;
    private XboxController m_operatorXboxController;

    public static OI getInstance() {
        if (m_OI == null) m_OI = new OI();
        return m_OI;
    }

    private OI() {
        m_driverXboxController = new XboxController(RobotMap.U_DRIVER_XBOX_CONTROLLER);
        m_operatorXboxController = new XboxController(RobotMap.U_OPERATOR_XBOX_CONTROLLER);
    }

    public void bindControls() {
        
    }

    public XboxController getDriverController() {
        return m_driverXboxController;
    }

    public XboxController getOperatorController() {
        return m_operatorXboxController;
    }
}
