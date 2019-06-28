package exercicio1;

public class Info {

	private String nome;
	private String nomePai;
	private String nomeMae;
	private int dia;
	private int mes;
	private int ano;
	private String nacionalidade;
	private String sexo;
	private String estadoCivil;
	private int altura;
	private double peso;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		if (dia > 0)
			this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		if (mes > 0)
			this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		if (ano > 0)
		this.ano = ano;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		if (sexo == "Masculino" || sexo == "Feminino")
			this.sexo = sexo;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		
		this.estadoCivil = estadoCivil;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		if (altura > 0)
			this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if (peso > 0)
			this.peso = peso;
	}
	
}
