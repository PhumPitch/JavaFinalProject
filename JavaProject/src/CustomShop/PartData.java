package CustomShop;

import java.util.Objects;

public class PartData {

	private  String bodyWood;
	private  String color;
	private  boolean relic;
	private  String neckWood;
	private  String neckShape;
	private  String neckRadius;
	private  String fretType;
	public String getBodyWood() {
		return bodyWood;
	}
	public void setBodyWood(String bodyWood) {
		this.bodyWood = bodyWood;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isRelic() {
		return relic;
	}
	public void setRelic(boolean relic) {
		this.relic = relic;
	}
	public String getNeckWood() {
		return neckWood;
	}
	public void setNeckWood(String neckWood) {
		this.neckWood = neckWood;
	}
	public String getNeckShape() {
		return neckShape;
	}
	public void setNeckShape(String neckShape) {
		this.neckShape = neckShape;
	}
	public String getNeckRadius() {
		return neckRadius;
	}
	public void setNeckRadius(String neckRadius) {
		this.neckRadius = neckRadius;
	}
	public String getFretType() {
		return fretType;
	}
	public void setFretType(String fretType) {
		this.fretType = fretType;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(bodyWood, color, fretType, neckRadius, neckShape, neckWood, relic);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PartData other = (PartData) obj;
		return Objects.equals(bodyWood, other.bodyWood) && Objects.equals(color, other.color)
				&& Objects.equals(fretType, other.fretType) && Objects.equals(neckRadius, other.neckRadius)
				&& Objects.equals(neckShape, other.neckShape) && Objects.equals(neckWood, other.neckWood)
				&& relic == other.relic;
	}
	@Override
	public String toString() {
		return "PartData [bodyWood=" + bodyWood + ", color=" + color + ", relic=" + relic + ", neckWood=" + neckWood
				+ ", neckShape=" + neckShape + ", neckRadius=" + neckRadius + ", fretType=" + fretType + "]";
	}
	
	
	
	


	
}
