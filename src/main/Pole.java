
package main;
public class Pole {
    char[][] pole = new char[13][50];
    Pole()
    {
        for (int i=0;i<13;i++)
        {
        for (int j=0;j<40;j++)
        {
        if (j==39)
        this.pole[i][j]='\n';
        else
            this.pole[i][j]=' ';
        }
        }
    }  
   }

