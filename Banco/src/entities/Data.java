package entities;

public class Data {

    private int password;
    private String name;
    public double initial_deposit;
    public double new_deposit;
    public double withdraw;

    public Data(int password, String name, double initial_deposit){
        this.password = password;
        this.name = name;
        this.initial_deposit = initial_deposit;
    }

    /*public Data(int password, String name, double initial_deposit){
        this.password = password;
        this.name = name;
        this.initial_deposit = initial_deposit;
    }*/

    public int getPassword(){
        return password;
    }

    public String getName(){
        return name;
    }

    public double total_deposit(){
        return initial_deposit + new_deposit;
    }

    public double remaining_balance(){
        return (total_deposit() - withdraw) - 5 ;
    }


}
