package task4;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String n, String e, char g){
        this.name = n;
        this.email = e;
        this.gender = g;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public char getGender(){
        return this.gender;
    }

    @Override
    public String toString() {
        return "Author @ ("+this.name+", "+this.email+", "+this.gender+").";
    }

}
