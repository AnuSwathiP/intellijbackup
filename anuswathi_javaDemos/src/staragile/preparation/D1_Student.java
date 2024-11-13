package staragile.preparation;

public  class D1_Student {
    private String name;
    private String college;
    public  D1_Student() {//class can have more than 0ne contructor
        System.out.println("I am constructor ");
    }
    public  D1_Student(String name, String college) {//constructor have no return type,no void
        this.name = name;
        this.college = college;//'Every class method is having an implicit hidden parameter a 'this' reference
        // which holds address of an object which is invoking the method
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
