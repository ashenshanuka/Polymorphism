public class Main {

    public static void main(String[] args) {
        
        Contact contactOne = new Contact("Sally", new PhoneNumber("+94767620534"));

        Contact contactTwo = new Contact("Harry", new PhoneNumber(41,"+94767620534"));

        Contact contactThree = new Contact("Jimmy", new PhoneNumber("+94767621234"));

        Contact contactFour = new Contact("Jimmy", "jimmy@gmail.com");

        Contact contactfive = new Contact("Sammy", new PhoneNumber("+94766535294"), "sammy@gmail.com");


        System.err.println(contactOne);
        System.err.println(contactTwo);
        System.err.println(contactThree);
        System.err.println(contactFour);
        System.err.println(contactfive);






    }
    
}
