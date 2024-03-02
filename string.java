
public class string {
    //Created by Dallin Lyman, uses code from Kim Gross
    //non=number of names
    int cy=2024;//current year used in finding the age
    String name;
    int birthYear;
    String[] names; //array of old names of the horse
    int non=0; //how many old names are there.
    public string(String horseName, int year){ //horse constructor needs its name and birth year.
        name=horseName; //assigns the name of the horse to the horseName which was sent in the construtor.
        birthYear=year; //assigns the year to the birthYear that was sent in the constructor;
    };
    public void age (int age){
        age = cy - birthYear;
    }; 
    public void changeName (String newName){//changes the name and saves the old name
        names[non]=name;
        non++;
        name=newName;
    };
    public String toString (){
        return name;
    };
    public static void main(String[] args) {
        string horse1 = new string("Tricky",2015);
        string horse2 = new string("Clove",2013);
        string horse3 = new string("Hopper",2018);
            print(horse1);
            print(horse2);
            print(horse3);
        }
        public static void print(string horse) {
            System.out.println("Name: " + horse.name);
            System.out.println("Birth Year: " + horse.birthYear);
            System.out.println();
        }
    } 


