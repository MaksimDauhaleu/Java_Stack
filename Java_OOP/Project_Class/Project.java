class Project{
    private String description;
    private String name;


    public String elevatorPitch(){
        return(this.getName() + " : " + this.getDescription());
    }

    public Project(){
        this.name = "";
        this.description = "";
    }
    public Project(String name){
        this.name = name;
        this.description = "";
    }
    public Project(String name,String description){
        this.name = name;
        this.description = description;
    }


















    //Setters
    public void setName(String newName){
        this.name = newName;
    }
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
    




    // Getters
    public String getName() {
        return (name);
    }
    public String getDescription(){
        return (description);
    }
}