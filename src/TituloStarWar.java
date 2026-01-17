public class TituloStarWar {

    private String nombre;
    private int numeroEpisodio;
    private String sinopsis;
    private String director;
    private String fechaDeLanzamiento;

    public String getNombre() {
        return nombre;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getDirector() {
        return director;
    }

    public String getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public TituloStarWar(tituloAPI miTituloAPI){
        this.nombre = miTituloAPI.title();
        this.numeroEpisodio = miTituloAPI.episode_id();
        this.director = miTituloAPI.director();
        this.sinopsis = miTituloAPI.opening_crawl();
        this.fechaDeLanzamiento = miTituloAPI.release_date();
    }

    @Override
    public String toString() {
        return "TituloStarWar{" +
                "nombre='" + nombre + '\'' +
                ", numeroEpisodio=" + numeroEpisodio +
                ", sinopsis='" + sinopsis + '\'' +
                ", director='" + director + '\'' +
                ", fechaDeLanzamiento='" + fechaDeLanzamiento + '\'' +
                '}';
    }
}
