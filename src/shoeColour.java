public class shoeColour {
    public static void main(String[] args) {
        System.out.println("Are the shoes black or brown?");

        String shoeColour = "grey";

        if(shoeColour.equals("black") || (shoeColour.equals("brown"))) {
            System.out.println("Yes, nice colour!");
        } else{
            System.out.println("No, I don't like that colour.");
        }
    }
}
