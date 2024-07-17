#include<iostream>
using namespace std;

class Matrix
{
    public:
    int row,col;
    int mat[row][col];
    Matrix(int x, int y)
    {
        row=x;
        col=y;
        int *mat= (int *)malloc(row*col*sizeof(int));
    }
    ~Matrix()
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0,j<col;j++)
            {
                free(mat[i][j]);
            }
        }

    void print()
    {
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                cout<<mat[i][j]<<" ";
            }
            cout<<endl;
        }
    }
    void set(int i,int j,int sum)
    {
        mat[i][j]=sum;
    }
    int get(int x,int y)
    {
        return mat[x][y];
    }

    void add(int n)
    {
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               mat[i][j]+=n;
            }

        }
    }
     int add(){
        int Sum=0;
         for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
               Sum+=mat[i][j];
            }

        }
        return Sum;
     }








