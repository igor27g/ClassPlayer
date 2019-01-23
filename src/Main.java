public class Main {

    public static void main(String[] args) {

       Player forward = new Player();

       forward.setName("Alvaro");
       forward.setlastName("Morata");
       forward.setCountry("Spain");
       forward.setGoals(15);
       forward.setAssists(10);
       System.out.println("Forward is " + forward.getName() + " " +  forward.getLastName() + " from " +  forward.getCountry()
               + ", he scored "  +  forward.getGoals() +  " and had " + forward.getAssists() + " assists.");
    }
}
