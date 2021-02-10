public class Animal {
    public Animal(){
    }

    public String eat(String food) {
        return String.format("Ate %s!", food);
    }

    public String breathe(){
        return "Is breathing";
    }
}
