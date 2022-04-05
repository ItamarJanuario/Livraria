public class Ebook extends Livro {

    private String waterMark;


    public Ebook(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDesconteDe(double porcentagem) {

        if(porcentagem > 0.15){
            return false;
        }

        return super.aplicaDesconteDe(porcentagem);
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    public String getWaterMark() {
        return this.waterMark;
    }
}
