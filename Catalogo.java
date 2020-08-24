//teste aaaaaaaaaaaaaaaaaa
public class Catalogo
{
    String Id;
    String cor;
    int Ano;
    String Pais;

    public Catalogo(String id, String cor, int Ano, String pais)
    {
        this.Id = id;
        this.cor =  cor;
        this.Ano = Ano;
        this.Pais = pais;
    }
    public String getId()
    {
        return Id;
    }
    public String getCor()
    {
        return cor;
    }
    public int getAno()
    {
        return Ano;
    }
    public String getPais()
    {
        return Pais;
    }
}