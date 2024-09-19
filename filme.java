package filme;

public class filme {
	

	    private String titulo;
	    private int duracao; // em minutos
	    private String genero;

	    // Construtor
	    public filme(String titulo, int duracao, String genero) {
	        setTitulo(titulo);
	        setDuracao(duracao);
	        setGenero(genero);
	    }

	    // Getter e Setter para título
	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        if (titulo.isEmpty()) {
	            throw new IllegalArgumentException("O título não pode estar vazio.");
	        }
	        this.titulo = titulo;
	    }

	    // Getter e Setter para duração
	    public int getDuracao() {
	        return duracao;
	    }

	    public void setDuracao(int duracao) {
	        if (duracao <= 0) {
	            throw new IllegalArgumentException("A duração deve ser maior que zero.");
	        }
	        this.duracao = duracao;
	    }

	    // Getter e Setter para gênero
	    public String getGenero() {
	        return genero;
	    }

	    public void setGenero(String genero) {
	        if (!genero.equalsIgnoreCase("Terror")) {
	            throw new IllegalArgumentException("O gênero deve ser 'Terror'.");
	        }
	        this.genero = genero;
	    }

	    @Override
	    public String toString() {
	        return "Filme: " + titulo + ", Duração: " + duracao + " minutos, Gênero: " + genero;
	    }

	    public static void main(String[] args) {
	        try {
	            filme filme = new filme("Um lugar silencioso", 139, "Terror");
	            System.out.println(filme);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}


