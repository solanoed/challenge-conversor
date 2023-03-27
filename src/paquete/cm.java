package paquete;

public class cm {
    private Double value;

    public cm(Double value){
        this.value = value;
    }

    public Double to (String op){
        Double converted;
        switch (op){
            case "Km":
                converted = this.value/100000;
                return converted;
            case "M":
                converted = this.value/100;
                return converted ;
            default:
                return converted=this.value;
        }
    }


}
