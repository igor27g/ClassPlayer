public class Player {
    private String name;
    private String lastName;
    private String country;
    private int goals;
    private int assists;


    public void setName(String name) {
        String validName = name.substring(0,1).toUpperCase()+ name.substring(1).toLowerCase();
        if (validName.equals("Alvaro")){
            this.name = name;
        } else{
            this.name = "Unknown name player";
        }
    }

    public void setlastName(String lastName) {
        String validlastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        if (validlastName.equals("Morata")) {
            this.lastName = lastName;
        } else{
            this.lastName = "Unknown lastName player";
        }
    }

    public void setCountry(String country) {
        String validCountry = country.substring(0,1).toUpperCase() + country.substring(1).toLowerCase() ;
        if (validCountry.equals("Spain")) {
            this.country = country;
        } else {
            this.country = "Unknown country";
        }
    }

    public int setGoals(int goals) {
        return this.goals = goals;
    }


    public int setAssists(int assists) {
        return this.assists = assists;
    }


    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getCountry() {
        return this.country;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }


}