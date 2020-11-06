package test;


public class EstudoCaso1 
{

    public boolean calcularAprovacao(float nota1, float nota2, float notafinal, int frequencia){
        float media;
        boolean resultado;
        
        if (frequencia < 75){
            resultado = false;
        }
        else{
            media = (nota1 + nota2) / 2;
            if (media < 30){
                resultado = false;
            }
            else if (media >= 70){
                resultado = true;
            }
            else if ((media + notafinal)/2 >= 50){
                resultado = true;
            }else{
                resultado = false;
            }
        }
        return resultado;
    }
}

