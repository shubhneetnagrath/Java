public class Logical_Operators_Ifelse {
public static void main(String[] args) {
// Variable of user inputs(Security Stages of User)
Boolean isLoggedin = true;
Boolean isAdmin = false;
var securityLevel = 3;
//If else loop using AND and OR Gate on variables
if(isLoggedin && (isAdmin || securityLevel<=2)){
System.out.println("Access granted");
}
else {
    System.out.println("Access denied");
}
}
}




