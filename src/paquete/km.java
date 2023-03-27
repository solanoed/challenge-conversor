package paquete;

public class km {
    private Double value;

    public km(Double value){
        this.value = value;
    }

    public Double to (String op){
        Double converted;
        switch (op){
            case "M":
                converted = this.value*1000;
                return converted;
            case "Cm":
                converted = this.value*100000;
                return converted ;
            default:
                return converted=this.value;
        }
    }


}
