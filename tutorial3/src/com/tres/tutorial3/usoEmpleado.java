package com.tres.tutorial3;

public class usoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado[] empleado=new Empleado[5];
		Jefe jefe_rrhh= new Jefe("Juan Gonzalez",55000,2006,9,25);
		Alumno pasante=new Alumno("Juan Gomez","Biologia");
		jefe_rrhh.estableceIncentivo(2570);
		 empleado[0]=new Empleado("Jose Gomez",1500,1980,06,24);
		 empleado[1]=new Empleado("Alva Perez",1600,1995,8,15);
		 empleado[2]=new Empleado("Mirta Casas",1250,2001,12,22);
		 empleado[3]=jefe_rrhh; //Polimorfismoerez
		 empleado[4]=new Jefe("Maria Perez",95000,1999,5,26);//Polimorfismoerez
		 
		 Jefe jefa_finanzas=(Jefe)empleado[4];//Casting
		 jefa_finanzas.estableceIncentivo(02570);	 
		 //Impromir el nombre de los empleados
		 for (Empleado e: empleado) {
				System.out.println("El Nombre: "+e.dameNombre()+" ID: "+e.dameId()+" el sueldo es "+e.dameSueldo());	
				 }
		 //Subir sueldo 
		 for (Empleado e: empleado) {
				e.subeSueldo(20);	
				 }
		 System.out.println("Nombre: "+jefe_rrhh.dameNombre()+" "+jefe_rrhh.dameDescripcion());
		 System.out.println("Nombre: "+pasante.dameNombre()+" "+pasante.dameDescripcion());
		 
		 //Impromir el nombre de los empleados
		 for (Empleado e: empleado) {
				System.out.println("El Nombre: "+e.dameNombre()+" el sueldo con aumento es es "+e.dameSueldo());	
				 }

	}

}
