public class Getraenk extends Lebensmittel {

    public Getraenk(String name, int menge) {
        super(name, menge);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean essen() {
        return false;
    }

    @Override
    public boolean trinken() {
        if (menge < 0) {
            menge = 0;
            return false;
        } else {
            if (name.equals("Mate")) menge -= 100;
            else if (name.equals("Wasser")) menge -= 200;
        }
        return true;
    }
    
}
