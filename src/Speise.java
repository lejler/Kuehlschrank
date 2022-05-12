public class Speise extends Lebensmittel {

    public Speise(String name, int menge) {
        super(name, menge);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean essen() {
        if (menge < 0) {
            menge = 0;
            return false;
        } else {
            if (name.equals("Brot")) menge -= 50;
        else if (name.equals("Wurst")) menge -= 10;
        }
        return true;
    }

    @Override
    public boolean trinken() {
        return false;
    }
    
}
