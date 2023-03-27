package paquete;

public class f {
    private Double value;

    public f(Double value){
        this.value = value;
    }

    public Double to (String op){
        Double converted;
        switch (op){
            case "°C":
                converted = (((this.value)-32) /1.8);
                return converted;
            case "K":
                converted = (((this.value)-32) /1.8 ) + 273.15;
                return converted ;
            default:
                return converted=this.value;
        }
    }


}
