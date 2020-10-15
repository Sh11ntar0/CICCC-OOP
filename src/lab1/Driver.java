package lab1;

public class Driver {
    public static void main(String[] args) {
        Model model = new Model( "Shintaro","Okamoto",50,100);
        System.out.println(model.getHeightInFeetAndInches());
    }
}
