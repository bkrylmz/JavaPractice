package day31_Constructors;

public class Offer {
    public String location;
    public String companyName;
    public String jobTitle;
    public double salary;
    public boolean hasBenefit;
    public boolean hasPTO;
    public boolean hasWFH;
    public boolean isFullTime;

    public void setInfo(String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean hasWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.hasWFH = hasWFH;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", hasWFH=" + hasWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }

}


