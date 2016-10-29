
package main;

import java.util.Random;

public class Car extends Wzory
{
    int x,y;
    int last_x,last_y;
    int speed=3;
    char icon = 'C';
    public Car(Walker walker)
    {
        this.x=walker.x;
        this.y=walker.y;
        this.last_x=walker.x;
        this.last_y=walker.y;
    }
    public void direction()
    {
        Random direction = new Random();
        int direction1 = direction.nextInt(4);
        switch (direction1) {
            case 0:
                if (this.y-this.speed<0||this.y-this.speed>38)
                {
                    this.x=this.last_x;
                    this.y=this.last_y;
                }
                else{
                    this.last_x=this.x;
                    this.last_y=this.y;
                    this.y=this.y-this.speed;}
                break;
            case 1:
                if (this.x+this.speed<0||this.x+this.speed>12)
                {
                    this.x=this.last_x;
                    this.y=this.last_y;
                }
                else{
                    this.last_x=this.x;
                    this.last_y=this.y;
                    this.x=this.x+this.speed;}
                break;
            case 2:
                if (this.y+this.speed<0||this.y+this.speed>38){
                this.x=this.last_x;
                this.y=this.last_y;
                }
                else{
                    this.last_x=this.x;
                    this.last_y=this.y;
                this.y=this.y+this.speed;}
                break;
            case 3:
                if (this.x-this.speed<0||this.x-this.speed>12){
                this.last_x=this.x;
                this.last_y=this.y;
                this.x=this.x-this.speed;}
                break;
            default:
                break;
        }
       }
    }
