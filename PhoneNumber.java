public class PhoneNumber {
    private int CountryCode;
    private String phoneNumber;

    public PhoneNumber(String phoneNumber){
      
        if(phoneNumber.length()>10){
            this.CountryCode=Integer.parseInt(phoneNumber
            .substring(0,phoneNumber.length()-10));
            this.phoneNumber=phoneNumber
            .substring(phoneNumber.length()-10);
        }
        else{
            this.CountryCode =1;
            this.phoneNumber=phoneNumber;
        }

    }

    public PhoneNumber(int CountryCode,String PhoneNumber){
        this.CountryCode=CountryCode;
        this.phoneNumber=phoneNumber;
    }


    @Override
    public String toString() {
        return "PhoneNumber [CountryCode=" + CountryCode + ", phoneNumber=" + phoneNumber + ", toString=" + toString()
                + "]";
    }
    
}
