package paquete;

public class c {
    private Double value;

    public c (Double value){
        this.value = value;
    }

    public Double to (String op){
        Double converted;
        switch (op){
            case "°F":
                converted = (this.value)*1.8 + 32;
                return converted;
            case "K":
                converted = (this.value)+ 273.15;
                return converted ;
            default:
                return converted=this.value;
        }
    }


}
