public class Filme { // Classe que representa um filme
    // Atributos da classe 'Filme'
    private String nomefilm;  // Título do filme
    private int duraçãoMinuto; // Duração do filme em minutos
    private String gênerofilm;  // Gênero do filme
    private String result;  // Informações do filme

    public Filme(String titulo, int duração, String genero) {// Construtor da classe 'Filme'
        setTítulo(titulo); // Define o título usando o setter
        setDuraçãoMin(duração); // Define a duração usando o setter
        setGênero(genero); // Define o gênero usando o setter
        this.result = info(); // Armazena as informações do filme
    }

    public void setTítulo(String titulo) {// Setter para o título, garantindo que não seja vazio
        if (titulo == null || titulo.trim().isEmpty()) { // Verifica se o título é nulo ou vazio
            throw new IllegalArgumentException("O título não pode estar vazio."); // Lança exceção se inválido
        }
        this.nomefilm = titulo; // Atribui o título ao atributo
    }

    public void setDuraçãoMin(int duração) {// Setter para a duração, garantindo que seja maior que zero
        if (duração <= 0) { // Verifica se a duração é menor ou igual a zero
            throw new IllegalArgumentException("A duração do filme tem que ser maior que zero."); // Lança exceção se inválido
        }
        this.duraçãoMinuto = duração; // Atribui a duração ao atributo
    }

    public void setGênero(String genero) { // Setter para o gênero, garantindo que seja um dos gêneros válidos
        // Verifica se o gênero é um dos permitidos
        if (!genero.equalsIgnoreCase("Romance") && 
            !genero.equalsIgnoreCase("Terror") && 
            !genero.equalsIgnoreCase("Comédia")) {
            throw new IllegalArgumentException("O gênero deve ser Romance, Terror ou Comédia."); // Lança exceção se inválido
        }
        this.gênerofilm = genero; // Atribui o gênero ao atributo
    }

    public String getTítulo() {    // Getter para acessar o título do filme
        return nomefilm;
    }

    public int getDuraçãoMin() {    // Getter para acessar a duração do filme
        return duraçãoMinuto;
    }

    public String getGênero() {    // Getter para acessar o gênero do filme
        return gênerofilm;
    }

    public String info() {// Método que retorna uma descrição completa do filme
        return "Título: " + nomefilm + "\n" + 
               "Duração: " + duraçãoMinuto + " minutos.\n" + 
               "Gênero: " + gênerofilm + "\n";
    }

    public String getResult() {// Getter para acessar as informações do filme
        return result;
    }

    public static void main(String[] args) {// Método principal para executar o programa
        try { // Tenta executar o bloco de código
            Filme f1 = new Filme("Jumanji", 130, "Terror"); // Cria um objeto Filme
            System.out.println(f1.getResult()); // Exibe as informações do filme
        } catch (IllegalArgumentException e) { // Captura exceções de argumentos inválidos
            System.out.println("Ocorreu o seguinte erro: " + e.getMessage()); // Exibe a mensagem de erro
        }
    }
}

