public Class Sugerencia implement GeneradorSugerencias{
	private AccuWeatherAPI clima = new AccuWeatherAPI();
	private List<Prenda> Guarropa;
	
	public static List<Prenda> prendaAcordeAlClima (String ciudad){	
		List<Prenda> prendasAptas = guardarropa.filter(laPrenda -> laPrenda.esAcordeAlClima(clima.temperaturaDe(ciudad)))
		return prendasAptas;
	}
	
	@override
	public List<Prenda> generarSugerenciaDesde{List<Prenda> prendaAcordeAlClima};
}

public Class Atuendo{
	List<Prenda> atuendo
}

public Class Prenda{
	private int temperaturaMax;
	
	public boolean esAcordeAlClima (int temperatura)
}
	
public interface GeneradorSugerencias {
	public List<Prenda> generarSugerenciaDesde{List<Prenda> prendasAptas}; //cmabié List<Sugerencia> por List<Prenda> ya que achiqué el alcance y mi solución solo sugiere prendas, no atuendos. No llegué.
//devuelve una lista de sugerencias a partir de una lista de prendas aptas. 
//Su trabajo es proporcionar esa lista de prendas aptas, excluyendo las que tengan una temperatura máxima menor a la actual.

}

public Interface Clima{ //esta sería mi Adaptador
	//climaDe(String ciudad){
	public int temperaturaDe(String ciudad){
		//llama a la API de AccuWeather resolviendo la adaptación acá mismo o bien llamando a una classe que haga de intermediaria entre la Facade y la API para ajustar los metodos
		//uno de los temas para pponerse de acuerdo es la escala a usar, ej. C o F
}

public Class AccuWeatherAPI implements Clima{
	@override
	public int temperaturaDe(String ciudad){	
		
	//List<Map<String, Object> getWeather(String ciudad);
}

public Class Usuarie{
	String Ciudad;
	// el usuarie es quien llama al método prendaAcordeAlClima de Sugerencia
}