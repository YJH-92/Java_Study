public class Member {
    private String phoneNo;
    private String email;

    public Member(String phoneNo, String email) {
        this.phoneNo = phoneNo;
        this.email = email;
    }

    //getter/setter 생략




    @Override
    public String toString() {
        return "Member [phoneNo=" + phoneNo + ", email=" + email + "]";
    }  
}
