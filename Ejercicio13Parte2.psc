//202030799 Manuel Rojas
//Realice un men� que permita ejecutar operaciones b�sicas matem�ticas de dos n�meros.
//Este men� debe repetirse hasta que el usuario seleccione la opci�n de salir. Las operaciones a considerarse son:
//	a. Sumar dos n�meros
//	b. Dividir dos n�meros (no se puede dividir por cero)
//	c. Salir
Proceso Ejercicio13Parte2
	opcionS <- ""
	Mientras Minusculas(opcionS) <> "c"
		Escribir "Seleccione una opcion:"
		Escribir "   a. Sumar dos n�meros"
		Escribir "   b. Dividir dos n�emeros"
		Escribir "   c. Salir"
		Leer opcionS
		
		Si Minusculas(opcionS) == "a" Entonces
			Escribir "Ingrese los dos numeros que desea sumar: "
			Leer num1, num2
			suma <- num1 + num2
			Escribir "El total de la suma es: ", suma
		SiNo
			Si Minusculas(opcionS) == "b" Entonces
				Escribir "Ingrese los dos numeros que desea dividir:"
				Leer num3, num4
				Si num4 == 0 Entonces
					Escribir "No se puede dividir entre cero"
				SiNo
					division <- num3/num4
					Escribir "El resultado de la division es: ", division
				FinSi
			SiNo
				Si Minusculas(opcionS) == "c" Entonces
					Escribir "Adios, vuelve pronto"
				SiNo
					Escribir "Ups, ingrese una opcion valida"	
				FinSi
			FinSi
		FinSi
	FinMientras
FinProceso