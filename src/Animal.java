/**
 * This is a simple java bean class
 * @author Lavanya
 * @version 11
 */

public class Animal {
    //Field
    String name;

    /**
     * set the name of the animal
     * @param newName
     */
    public void setName(String newName){
        name=newName;
    }

    /**
     * get the name of animal
     * @return String Name of animal
     */

    public String getName() {
        return name;
    }

    /**
     * run the program
     * @param args
     */
    public static void main(String[] args){
        System.out.println("Welcome....");
    }
}
