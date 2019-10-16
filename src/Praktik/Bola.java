package praktik;

public class Bola{
    public double r;
    public void setJarijari(){
        r = 22;
    }
    
    public void showVolume(){
    System.out.println("Volume Bola = " + 4 * Math.PI * r * r * r / 3 );
    }
    
    public void showDiameter(){
        System.out.println("Diameter Bola = " + 2 * r);
    }
    
    public void showLuasPermukaan(){
        System.out.println("Luas Permukaan Bola = "+ 4 * Math.PI * r * r);
    }
}