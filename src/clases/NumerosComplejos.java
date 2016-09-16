/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author LUCYLEONOR
 */
public class NumerosComplejos {
    private int numerouno;
    private int numerodos;
   

    public NumerosComplejos(int numerouno, int numerodos) {
        this.numerouno = numerouno;
        this.numerodos = numerodos;
        }

   

    public int getNumerouno() {
        return numerouno;
    }

    public void setNumerouno(int numerouno) {
        this.numerouno = numerouno;
    }

    public int getNumerodos() {
        return numerodos;
    }

    public void setNumerodos(int numerodos) {
        this.numerodos = numerodos;
    }

  
   
    
    public NumerosComplejos Suma(NumerosComplejos c2){
        int n1, n2, n3, n4, s, s2;
        NumerosComplejos c;
        s = (this.numerouno + c2.numerouno);
        s2 = (this.numerodos + c2.numerodos);        
        c = new NumerosComplejos(s, s2);
        return c;
    }
    public NumerosComplejos Resta(NumerosComplejos c2){
        int s, s2;
        NumerosComplejos c;
        s = (this.numerouno - c2.numerouno);
        s2 = (this.numerodos - c2.numerodos);        
        c = new NumerosComplejos(s, s2);
        return c;
    }
    public NumerosComplejos Multiplicacion(NumerosComplejos c2){
        int s, s2,n1,n2,n3,n4;
        NumerosComplejos c;
        n1 = this.numerouno * c2.numerouno;
        n2 = this.numerodos * c2.numerodos;
        n3 = this.numerouno * c2.numerodos;
        n4 = this.numerodos * c2.numerouno;
        s = n1 - n2;
        s2 = n3 -n4*(-1);  
        c = new NumerosComplejos(s, s2);
        return c;
    }
    
   
    
    
    
}
