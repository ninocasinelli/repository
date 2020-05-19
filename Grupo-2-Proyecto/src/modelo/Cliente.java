package modelo;

public class Cliente
{

	private String nombreCompleto;
	private String fechaNacimiento;
	private String ciudadResidencia;
	
	
	public Cliente()
	{
		super();

	}

	public Cliente(String nombreCompleto, String fechaNacimiento, String ciudadResidencia) 
	{
		this.nombreCompleto=nombreCompleto;
		this.fechaNacimiento=fechaNacimiento;
		this.ciudadResidencia=ciudadResidencia;
	}

	public String getNombreCompleto()
	{
		return nombreCompleto;
	}


	public void setNombreCompleto(String nombreCompleto)
	{
		this.nombreCompleto = nombreCompleto;
	}


	public String getFechaNacimiento() {
		
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento)
	{
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getCiudadResidencia() 
	{
		return ciudadResidencia;
	}


	public void setCiudadResidencia(String ciudadResidencia) 
	{
		this.ciudadResidencia = ciudadResidencia;
	}


	@Override
	public String toString() 
	{
		return "Cliente [nombreCompleto=" + nombreCompleto + ", fechaNacimiento=" + fechaNacimiento
				+ ", ciudadResidencia=" + ciudadResidencia + "]";
	}
	
	
}
