package l9q2_personprofile;

public class PersonProfile {
    
    //instance variable
    protected String NAME, DATEBIRTH;
    protected char GENDER;
    
    //Construcor
    public PersonProfile(String NAME, char GENDER, String DATEBIRTH){
        this.NAME = NAME;
        this.GENDER = GENDER;
        this.DATEBIRTH = DATEBIRTH;
    }
    
    //Methods
    public void displayProfile(){
        System.out.printf("Name: %s\nGender: %s\nDate of birth: %s\n", this.NAME, this.GENDER, this.DATEBIRTH);
    }
}
