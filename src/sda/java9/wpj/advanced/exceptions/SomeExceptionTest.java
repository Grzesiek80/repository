package sda.java9.wpj.advanced.exceptions;

public class SomeExceptionTest {
    
    public static void main(String[] args) {
        SomeExceptionTest myObject = new SomeExceptionTest();
        try {
            myObject.firstTestMethod();
        }
        catch (NumberIsNotReachableException nexc) {
            nexc.printStackTrace();
            System.err.println("No ale cóż, idę dalej...");
        }
        
        try {
            myObject.secondTestMethod();
        } catch (FileNotFoundException f) {
            System.err.println("Wystąpił wyjątek! Wiadomość: " + f.getMessage());
           // System.err.println(f.getPath() != null ? f.getPath() : "");
            
            if (f.getPath() != null) {
                System.err.println("Nie udało się otworzyć pliku: " + f.getPath());
            }
        }
    }
    
    public void firstTestMethod() {
        if (Math.random() >= 0.5) {
            throw new NumberIsNotReachableException();
        }
    }
    
    public void secondTestMethod() throws FileNotFoundException {
        throw new FileNotFoundException("Nie ma takiego pliku!", "jakis_plik_ktorego_nie_ma.txt");
    }
    
}