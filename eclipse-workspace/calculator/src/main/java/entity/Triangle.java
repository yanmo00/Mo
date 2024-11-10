package entity;

public class Triangle {
	private Double high;
	private Double bottom;
	private Double area;
	
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	public Double getHigh() {
		return high;
	}
	public void setHigh(Double high) {
		this.high = high;
	}
	public Double getBottom() {
		return bottom;
	}
	public void setBottom(Double bottom) {
		this.bottom = bottom;
	}
	public Triangle(Double high, Double bottom) {
		super();
		this.high = high;
		this.bottom = bottom;
	}
	
	public Triangle() {
		super();
	}
}
