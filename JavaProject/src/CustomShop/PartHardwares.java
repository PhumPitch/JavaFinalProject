package CustomShop;

import java.util.Objects;

public class PartHardwares {
	private String pickUps;
	private String saddle;
	private String tuner;
	private String handside;
	private String pickguard;
	private String plasticColor;
	private String hardwareColor;
	private boolean hardCase;
	
	
	public String getPickUps() {
		return pickUps;
	}

	public void setPickUps(String pickUps) {
		this.pickUps = pickUps;
	}

	public String getSaddle() {
		return saddle;
	}

	public void setSaddle(String saddle) {
		this.saddle = saddle;
	}

	public String getTuner() {
		return tuner;
	}

	public void setTuner(String tuner) {
		this.tuner = tuner;
	}

	public String getHandside() {
		return handside;
	}

	public void setHandside(String handside) {
		this.handside = handside;
	}

	public String getPickguard() {
		return pickguard;
	}

	public void setPickguard(String pickguard) {
		this.pickguard = pickguard;
	}

	public String getPlasticColor() {
		return plasticColor;
	}

	public void setPlasticColor(String plasticColor) {
		this.plasticColor = plasticColor;
	}

	public String getHardwareColor() {
		return hardwareColor;
	}

	public void setHardwareColor(String hardwareColor) {
		this.hardwareColor = hardwareColor;
	}

	public boolean isHardCase() {
		return hardCase;
	}

	public void setHardCase(boolean hardCase) {
		this.hardCase = hardCase;
	}

	@Override
	public int hashCode() {
		return Objects.hash(handside, hardCase, hardwareColor, pickUps, pickguard, plasticColor, saddle, tuner);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PartHardwares other = (PartHardwares) obj;
		return Objects.equals(handside, other.handside) && hardCase == other.hardCase
				&& Objects.equals(hardwareColor, other.hardwareColor) && Objects.equals(pickUps, other.pickUps)
				&& Objects.equals(pickguard, other.pickguard) && Objects.equals(plasticColor, other.plasticColor)
				&& Objects.equals(saddle, other.saddle) && Objects.equals(tuner, other.tuner);
	}

}
