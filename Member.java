import java.util.*;
import java.io.*;

public class Member { //declare a class

    private String name;
    private String cpr;
    private String memberType;
    private int fee;
    
    public Member() {} //constructor 1

    public Member(String name, String cpr, String memberType, int fee) { // constructor 2
        this.name = name;
        this.cpr = cpr;
        this.memberType = memberType;
        this.fee = fee;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    //to string method
    public String toString() {
        return name + "\t\t" +
               cpr + "\t\t" +
               memberType + "\t\t" +
               fee;   
    }
}
