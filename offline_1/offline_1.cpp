#include <iostream>
#include<cmath>
using namespace std;

class Point
{
    // x and y coordinate
    int x, y;
public:
    Point()
    {
        x=0;
        y=0;
    }
    Point(int a, int b)
        {
            x=a;
            y=b;
        }
    void setm(int a,int b)
    {
        x=a;
        y=b;
    }
    int getx()
    {
        return x;
    }
    int gety()
    {
        return y;
    }
    void print()
    {
        cout << "Coordinate: "<< x <<", " <<y <<endl;
    }
};

class Circle
{
    Point p;
    int radius;
 public:
    Circle(int a,int b, int r)
     {
         p.setm(a,b);
         radius=r;
     }

     void print()
    {
        cout << "Center ";
        p.print();
        cout << "Radius: " << radius << endl;
    }
    void update(int a,int b)
    {
        int temp1=p.getx();
        int temp2=p.gety();
        temp1=temp1+a;
        temp2=temp2+b;
        p.setm(temp1,temp2);
    }
    void update(int a)
    {
        radius=radius+a;
    }
    void update(int a,int b, int c)
    {
        update(a,b);
        radius+=c;
    }
};

int main()
{
    Point p(5,5);
    Circle c(2, 3, 5);
    cout << endl << "Point Display" <<endl;
    p.print();
    cout << endl << "Circle Display" <<endl;
    c.print();
    cout << endl;
    //First update
    cout << "First Update" << endl;
    // call “update” function of Circle class to increase the center’ coordinate by 5 and y coordinate by 5;
    c.update(5,5);
    c.print();
    cout <<endl;

    //Second update
    cout << "Second Update" << endl;
    c.update(6);
    c.print();
    cout<<endl;

    //Third update
    cout << "Third Update" << endl;
    c.update(2,2,2);
    c.print();
    cout<<endl;
    return 0;
}






