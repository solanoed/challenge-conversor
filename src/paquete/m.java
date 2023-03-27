package paquete;

public class m {
    private Double value;

    public m(Double value){
        this.value = value;
    }

    public Double to (String op){
        Double converted;
        switch (op){
            case "Km":
                converted = this.value/1000;
                return converted;
            case "Cm":
                converted = this.value/100;
                return converted ;
            default:
                return converted=this.value;
        }
    }


}
