package paquete;

public class k {
    private Double value;

    public k(Double value){
        this.value = value;
    }

    public Double to (String op){
        Double converted;
        switch (op){
            case "°C":
                converted = (this.value) - 273.15;
                return converted;
            case "°F":
                converted = (((this.value)- 273.15) * 1.8) + 32;
                return converted ;
            default:
                return converted=this.value;
        }
    }


}
