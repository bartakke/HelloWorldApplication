package training.yugenspark.com.helloworldapplication;

/**
 * Created by root on 17/7/16.
 */
public class Student {
    String name, collage, emailId, contactNo, dateOfBirth;

    /*
        this is a constructor
     */

    public Student() {
    }

    public Student(String name, String collage, String emailId, String contactNo, String dateOfBirth) {
        this.name = name;
        this.collage = collage;
        this.emailId = emailId;
        this.contactNo = contactNo;
        this.dateOfBirth = dateOfBirth;
    }

    /*
    these are getter and setter methods
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



}
