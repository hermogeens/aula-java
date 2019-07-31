package br.senac.rn.introducao;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Lampada {
    final Integer FREQUENCIA = 60;

 public String cor;
 public Integer potencia;
 public Integer tensao;
 public Float comprimento;
 private Boolean estado;

 public Lampada(String cor, Integer potencia) {
     this.cor = cor;
     this.potencia = potencia;
 }

 public void acende() {
     estado = true;
 }

 public void apaga() {
    estado = false;
 }
 public String statusLampada() {
     if (estado == true) {
         return "Ligado";
     } return "Desligado";
 }

    @Override
    public String toString() {
        return "Lampada{" +
                "cor='" + cor + '\'' +
                ", estado=" + statusLampada() +
                '}';
    }
}
