public class Car  extends Vehicle{
    private int wheels;
    private  String type;
    private  int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name,int doors, int wheels ,int gears,boolean isManual,String type){
      super(name);
      this.type=type;
      this.gears=gears;
      this.isManual=isManual;
      this.wheels=wheels;
      this.doors=doors;
      currentGear=1;
    }

    public  void  changeGear(int newGear){
        this.currentGear=newGear;
        System.out.println("changeGear method called Changed "+this.currentGear+"gear");

    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed,newDirection);
        System.out.println("changeGear method called Changed "+newSpeed+"direction"+newDirection);

    }
}
