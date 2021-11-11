// simple program to show concept of method overriding using classes. class Circle(child class) inherits class Shape(parent class) and overrides its method draw().  

class Shape
{
    public void draw()
    {
        System.out.println("drawing shape");
    }
    public void erase()
    {
        System.out.println("erasing shape");
    }
}
class Circle extends Shape{
    public void draw()
    {
        System.out.println("drawimng circle");
    }
}
class Shapemain
{
    public static void main(String[] args) {
       Shape c=new Circle();
       c.draw();
    }
}
