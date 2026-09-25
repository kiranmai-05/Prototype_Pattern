package prototype;
public class Client{
    public static void main(String args[]){
        Resume Original=new Resume("Kiranmai","CSE","ABC","Java,Python,Sql");
        Resume copy=Original.clone();
        System.out.println(Original==copy);
        System.out.println("Name of the candidate: "+Original.getName());
        System.out.println("Branch of the candidate: "+Original.getBranch());
        System.out.println("College of the candidate: "+Original.getCollege());
        System.out.println("Skills of the candidate: "+Original.getSkills());
        copy.setName("Haneesh");
        System.out.println("Name of another candidate: "+copy.getName());
    }
}