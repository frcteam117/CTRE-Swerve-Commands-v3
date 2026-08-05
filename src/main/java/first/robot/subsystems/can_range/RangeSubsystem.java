package first.robot.subsystems.can_range;

import org.wpilib.command3.Mechanism;

import first.robot.subsystems.can_range.RangeIO.RangeIOInputs;

public class RangeSubsystem extends Mechanism {
  RangeIO rangeIO = null;

  public RangeSubsystem(RangeIO rangeIO) {
    this.rangeIO = rangeIO;
  }

  public void periodic() {
    RangeIOInputs inputs = new RangeIOInputs();
    rangeIO.updateInputs(inputs);
  }
}
