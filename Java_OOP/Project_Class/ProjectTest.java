public class ProjectTest{
    public static void main(String[] args) {
        Project test = new Project("Maksim","No desc");
        System.out.println(test.getName());
        System.out.println(test.getDescription());
    }
}






// public class ProjectCreateTest{
//     public static void main(String[] args){
//         ProjectCreate testProject = new ProjectCreate("Add Helipad", "South Plaza rooftop adjacent to C-suites", 49999.99);
//         testProject.setName("Downtown HQ");
//         testProject.setDescription("Relocating to Los Angeles.");
//         testProject.setCost(8000.99);
//         // System.out.println(testProject.getName());
//         // System.out.println(testProject.getDescription());
//         // System.out.println(testProject.getCost());
//         System.out.println(testProject.elevatorPitch());
//     }
// }