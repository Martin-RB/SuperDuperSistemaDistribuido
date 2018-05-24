package Distribuidos;

public class Osote {
	private String IP;
	private double calificacion;

	public Osote(String IP, double calificacion) {
		this.IP = IP;
		this.calificacion = calificacion;

	}

	public String getIP() {
		return IP;
	}

	public void setIP(String iP) {
		IP = iP;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

}
