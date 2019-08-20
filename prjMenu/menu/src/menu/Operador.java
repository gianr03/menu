
package menu;


public class Operador {
    

public int numero1=0;
public int numero2=0;
public int total=0;

public Operador(int num1, int num2){

this.numero1 = num1;
this.numero2 = num2;

}
//este metodo es muy recomendable
public int suma(){
    return this.numero1+this.numero2;
}

public int resta(){
    return this.numero1-this.numero2;
}

public int multiplicacion(){
    return this.numero1*this.numero2;
}

public int divicion(){
    return this.numero1/this.numero2;
}









}
