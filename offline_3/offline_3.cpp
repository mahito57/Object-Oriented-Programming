#include<iostream>
#include<cstring>
using namespace std;

class Vector
{
    char *name;
    int x,y,z;
public:
    Vector(char *n)
    {
        int l = strlen(n);
        name = new char[l+1];
        strcpy(name,n);
        x=0;
        y=0;
        z=0;
    }
    Vector(char *n, int a, int b, int c)
    {
        int l = strlen(n);
        name = new char[l+1];
        strcpy(name,n);
        x=a;
        y=b;
        z=c;
    }
    /*Vector(const Vector &obj)
    {
        int l=strlen(obj.name);
        name=new char[l+1];
        strcpy(this->name,obj.name);
        x=obj.x;
        y=obj.y;
        z=obj.z;

    }*/

    int setX(int a){x=a;}
    int setY(int b){y=b;}
    int setZ(int c){z=c;}

    void setName(char *n)
    {
        int l = strlen(n);
        name = new char[l+1];
        strcpy(name,n);
    }

    int getX(){return x;}
    int getY(){return y;}
    int getZ(){return z;}

    char *getName(){return name;}

    ~Vector()
    {
        delete []name;
        //cout<<"freed";
    }
    void print()
    {
        cout<<name;
        cout<<": ";
        cout<<x<<"x";
        if(y>=0)
            cout<<"+"<<y<<"y";
        else
            cout<<y<<"y";
        if(z>=0)
            cout<<"+"<<z<<"z";
        else
            cout<<z<<"z";
        cout<<endl;
    }
    Vector operator^(Vector obj);
    Vector operator*(int n);
    Vector operator*(Vector obj);
    int operator==(Vector obj);
    Vector operator=(Vector obj);

    friend Vector operator*(int n, Vector& obj);


};

Vector Vector::operator^(Vector obj)
{
    Vector temp("temp");
    temp.x=y*obj.z-obj.y*z;
    temp.y=-(x*obj.z-obj.x*z);
    temp.z=x*obj.y-obj.x*y;
    return temp;
}

Vector Vector::operator*(int n)
{
    Vector temp("temp");
    temp.x=x*n;
    temp.y=y*n;
    temp.z=z*n;
    return temp;
}
Vector Vector::operator*(Vector obj)
{
    Vector temp("temp");
    temp.x=x*obj.x;
    temp.y=y*obj.y;
    temp.z=z*obj.z;
    return temp;
}

Vector operator*(int n, Vector& obj)
{
    obj.x=obj.x*n;
    obj.y=obj.y*n;
    obj.z=obj.z*n;
    return obj;
}

Vector Vector::operator=(Vector obj)
{
   x=obj.x;
   y=obj.y;
   z=obj.z;
   return *this;
}

int Vector::operator==(Vector obj)
{
    return(x==obj.x)&&(y==obj.y)&&(z==obj.z);
}

int main()
{
    Vector v1("v1", 1,2,3), v2("v2", 4, 5, -6), v3("Result1"),v4("Result2",-27,18,-3);

    v1.print();     ///Print the components of vector v1
    v2.print();     ///Print the components of vector v2

    v3=v1^v2;       ///Calculate the cross product of vector v1 and vector v2 (Consider ^ as cross product for this assignment)
    v3.print();     ///Print the modified components of vector v3 (Name: Result1)

    if(v3==v4)      ///Check for equality; if two vectors contain equal component values (x, y, z), then they are equal.
        cout<<"Vectors are equal"<<endl;
    else
        cout<<"Vectors are not equal"<<endl;

    v1= v1*2;       ///Multiply each component of vector v1 with the given value
    v1.print();     ///Print the modified components of vector v1

    v2=2*v2;        ///Multiply each component of vector v2 with the given value
    v2.print();     ///Print the modified components of vector v2

    v3=v1*v2;       ///Multiply each component of vector v1 with the corresponding component of vector v2.
    v3.print();     ///Print the modified components of vector v3 (Name: Result1)

    if(v3==v4)      ///Check for equality; if two vectors contain equal component values (x, y, z), then they are equal.
        cout<<"Vectors are equal"<<endl;
    else
        cout<<"Vectors are not equal"<<endl;

    return 0;
}
