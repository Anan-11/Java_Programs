// program to print area and volume of a box(cuboid)
class box
{
    public int length;
    public int height;
    public int breadth;
}
class box3d extends box {                                    //box3d class inherits the class box
    public box3d(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;

    }

    public int area() {
        int n = 2 * (length * breadth + breadth * height + height * length);
        return n;
    }

    public int volume() {
        return length * breadth * height;
    }

    public static void main(String[] args) {                      //main method
        box3d obj=new box3d(10,20,30);
        System.out.println(obj.area());
        System.out.println(obj.volume());
    }
}
