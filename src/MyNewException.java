public class MyNewException {
    public static void main(String[] args) {
        UserDefinedException udf=new UserDefinedException();
        try{
            udf.validation(12);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
