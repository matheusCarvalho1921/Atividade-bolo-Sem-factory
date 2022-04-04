
public abstract class Bolo {
	
	private String Nome ; 
	private String Tipo ; 
	private double  Preco ;
	
	
	
	public void sobreoBolo() {	
		
		System.out.println(getNome());
		System.out.println(getPreco());
		System.out.println(getTipo());
		
		
	}
	
	public abstract void receita();
	
	
	public String getNome() {
		return Nome;
		
		}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
		
	}
		

	public double getPreco() {
		return Preco;
		
		}
	
	public void setPreco(double Preco) {
		this.Preco = Preco;
		
	}
	public String getTipo() {
		return Tipo;
		
		}
	
	public void setTipo(String Tipo) {
		this.Tipo = Tipo;
		
	}

}
