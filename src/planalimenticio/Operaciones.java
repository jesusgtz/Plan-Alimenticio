/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planalimenticio;

/**
 *
 * @author Miguel
 * 
 */
public class Operaciones {
    public double IMC(double peso,double altura){
        return (peso/(Math.pow((altura*.01),2)));
    }
    public double PGC(double cintura,double cuello,double altura,double cadera,String sexo){
        if(sexo=="Masculino"){ 
        return (495/(1.0324-0.19007*Math.log10(cintura-cuello)+0.15456*Math.log10(altura)))-450;
        }else
        return (495/(1.29579-0.35004*Math.log10(cintura+cadera-cuello)+0.221*Math.log10(altura)))-450;
        
    }   
    public double MCM(double peso,double PGC){
        return (peso*(100-PGC))/100;
    }
    public double TMB(double MCM){
        return (370+(21.6*MCM));
    }
    public double CxD(double TMB,double NIVACT){
        return (TMB*NIVACT);
    }
    public double PxD(double peso){
        return ((peso*2.20462)*.36);
    }
    
}
