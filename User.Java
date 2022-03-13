public class User{
    private String name, id, userType;

    public User(String initName, String initID, int initType){
        name = initName;
        id = initID;
        setUserType(initType);
    }
    public String getName(){
        return name;
    }
    public void setName(String value){
        name = value;
    }
    public String getID(){
        return id;
    }
    public void setID(String value){
        id = value;
    }
    public String getUserType(){
        return userType;
    }
    public void setUserType(int choice){
        if (choice == 1){
            userType = "owner";
        }
        else if (choice == 2){
            userType = "employee";
        }
        else if (choice == 3){
            userType = "member";
        }
        else if (choice == 4){
            userType = "guest";
        }
    }
}
