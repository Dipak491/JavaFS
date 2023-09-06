package com.abstractt;


interface CNGcar
{
	public void cngkit();
	public void drive();
}


interface PetrolCar
{
	public void petrolkit();
	public void drive ();
}

class Carr implements CNGcar,PetrolCar
{
	public void cngkit()
	{
		System.out.println("CNG Car CNGKIT");
	}
	public void drive()
	{
		
		System.out.println("CNG Car CNGKIT");
	}
	
	public void petrolkit()
	{
		System.out.println("CNG Car PETROLKIT");
	}
}

public class InterfaceProgram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Carr obj = new Carr();
		obj.cngkit();
		obj.drive();
		obj.petrolkit();

	}

}
