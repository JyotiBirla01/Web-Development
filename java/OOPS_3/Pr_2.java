class Dog {

    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    
    }

    public void  setName(String name) {
        this.name = name;
       

    }

    public String getName() {
        return ("Name : " + name );

    }
    public void setBreed(String breed){
        this.breed=breed;

    }
     public String getBreed() {
        return ("Breed : " + breed );

    }

}

class Main {
    public static void main(String[] args) {
        Dog obj = new Dog("Entertainement ", "Bhau ");
       
        System.out.println(obj.getName()+" , " +obj.getBreed());
        obj.setName("Tonny ");
        obj.setBreed("Daisy ");
        System.out.println(obj.getName()+" , " +obj.getBreed());

    }
}