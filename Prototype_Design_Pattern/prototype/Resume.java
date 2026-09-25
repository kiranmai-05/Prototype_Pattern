package prototype;
public class Resume{
    private String name;
    private String branch;
    private String college;
    private String skills;
    public Resume(String name,String branch,String college,String skills){
        this.name=name;
        this.branch=branch;
        this.college=college;
        this.skills=skills;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBranch(String branch){
        this.branch=branch;
    }
    public void setCollege(String college){
        this.college=college;
    }
    public void setSkills(String skills){
        this.skills=skills;
    }
    public String getName(){
        return name;
    }
    public String getBranch(){
        return branch;
    }
    public String getCollege(){
        return college;
    }
    public String getSkills(){
        return skills;
    }
    public Resume clone(){
        return new Resume(this.name,this.branch,this.college,this.skills);

    }
}