class AboutUser {
  private String name;
  private int grade;
  private boolean isFunny = false;
  private double age;
  private char firstInitial;

  private void setFirstInitial(){
    firstInitial = name.charAt(0);
  }
  
  public void setName(String name){
    this.name = name;
    setFirstInitial();
  }
  public String getName(){
    return name;
  }
  public void setGrade(int grade){
    this.grade = grade;
  }
  public int getGrade(){
    return grade;
  }
  public void setAge(double age){
    this.age = age;
  }
  public double getAge(){
    return age;
  }
  public void setFunnyStatus(boolean funnyStatus){
    isFunny = false;
  }
  public boolean getFunnyStatus(){
    return isFunny;
  }
  public char getFirstInitial(){
    return firstInitial;
  }
  public AboutUser(){
    System.out.println("NEW USER CREATED");
  }
  
  }

