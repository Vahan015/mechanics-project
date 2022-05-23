package com.company;

public class Spring {

    double k;
//Task1_1
    public Spring(){
        k = 1;
    }
    public Spring(double k){
        this.k = k;
    }
//Task1_2
    public double getStiffness(){
        return k;
    }

    private void setStiffness(double k){
        this.k = k;
    }
//Task1_3
    public double[] move(double t, double dt, double x0, double v0){

        double tInitial = 0;
        double m = 1;
        double w = Math.sqrt(k/m);
        int count = (int) Math.ceil((t - tInitial)/dt);
        double[] array = new double[count];
        int i = 0;

        while(i < count){
            double temp = x0*Math.cos(w*(i*dt)) + (v0/w)*Math.sin(w*(i*dt));
            array[i] = temp;
            i++;
        }
        return array;

    }


    public double[] move(double t, double dt, double x0){

        double tInitial = 0;
        double m = 1;
        double v0 = 0;
        double w = Math.sqrt(k/m);
        int count = (int) Math.ceil((t - tInitial)/dt);
        double[] array = new double[count];
        int i = 0;

        while(i < count){
            double temp = x0*Math.cos(w*(i*dt)) + (v0/w)*Math.sin(w*(i*dt));
            array[i] = temp;
            i++;
        }
        return array;

    }

    public double[] move(double t0, double t1, double dt, double x0, double v0){
        double m = 1;
        double w = Math.sqrt(k/m);
        int count = (int) Math.ceil((t1 - t0)/dt);
        double[] array = new double[count];
        int i = 0;

        while(i < count){
            double temp = x0*Math.cos(w*(i*dt)) + (v0/w)*Math.sin(w*(i*dt));
            array[i] = temp;
            i++;
        }
        return array;
    }

    public double[] move(double t0, double t1, double dt, double x0, double v0, double m){
        double w = Math.sqrt(k/m);
        int count = (int) Math.ceil((t1 - t0)/dt);
        double[] array = new double[count];
        int i = 0;
        while(i < count){
            double temp = x0*Math.cos(w*(i*dt)) + (v0/w)*Math.sin(w*(i*dt));
            array[i] = temp;
            i++;
        }
        return array;
    }


//Task2_1
    public Spring inSeries(Spring that){
        double kNew = (this.k*that.k)/(this.k + that.k);
        Spring updatedSpring = new Spring(kNew);
        return updatedSpring;
    }
    public Spring inParallel(Spring that){
        double kNew = (this.k + that.k);
        Spring updatedSpring = new Spring(kNew);
        return updatedSpring;
    }
//Task2_2
   /* public Spring equivalentSpring(String springExpr){

    }*/


}
