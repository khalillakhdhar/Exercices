/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercices.exercice2;

/**
 *
 * @author khali
 */
public class CalculeImplement implements CalculeInterface {

    @Override
    public int somme(CalculeModel c) {
        return c.getEntier2()+c.getEntier2(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int produit(CalculeModel c) {
        return c.getEntier2()*c.getIntier1(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int soustraction(CalculeModel c) {
        return c.getIntier1()-c.getEntier2();
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double division(CalculeModel c) {
return c.getIntier1()/c.getEntier2();
    }

    @Override
    public double factoriel(CalculeModel c) {
int f=1;
for(int i=2;i<=c.getIntier1();i++)
{
f=f*i;
// f*=i;

}
return f;

    }

    @Override
    public int Pgcd(CalculeModel c) {
int a=c.getIntier1();
int b=c.getEntier2();
while(a!=b)
{
if(a>b)
    a=a-b;
else
b=b-a;
}
return a;


    }

    @Override
    public int Ppcm(CalculeModel c) {
int a=c.getIntier1();
int b=c.getEntier2();
int diviseur=Pgcd(c);
return (a*b)/diviseur;


    }
    
}
