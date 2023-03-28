package paquete;

import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap; // import the HashMap class

public class ventana extends JFrame {

    private JPanel ventana;
    private JComboBox exchangeBox;
    private JComboBox input1;
    private JComboBox input2;
    private JTextField value;
    private JLabel finalValue;
    private DefaultListCellRenderer listRenderer;

    static String finalSentence;
    static Double finalV;

//    static int

    void temperatura (){

        String uno = input1.getSelectedItem().toString();
        String dos = input2.getSelectedItem().toString();
        Double finalV;

        switch (uno){
            case "°C":
                c cel = new c(Double.parseDouble(value.getText()));
                finalV = cel.to(dos);
             break;
            case "°F":
                f far = new f(Double.parseDouble(value.getText()));
                finalV = far.to(dos);

                break;
            case "K":
                k kel = new k(Double.parseDouble(value.getText()));
                finalV = kel.to(dos);

                break;
            default:
                finalV=.0;
        }

        finalSentence = value.getText() + " " + input1.getSelectedItem() + " = " + finalV + " " + input2.getSelectedItem();
        finalValue.setText(finalSentence);



    }
    void distance (){
        String uno = input1.getSelectedItem().toString();
        String dos = input2.getSelectedItem().toString();
        Double finalV;

        switch (uno){
            case "M":
                m met = new m(Double.parseDouble(value.getText()));
                finalV = met.to(dos);
                break;
            case "Km":
                km kmm = new km(Double.parseDouble(value.getText()));
                finalV = kmm.to(dos);

                break;
            case "Cm":
                cm cmm = new cm(Double.parseDouble(value.getText()));
                finalV = cmm.to(dos);

                break;
            default:
                finalV=.0;
        }

        finalSentence = value.getText() + " " + input1.getSelectedItem() + " = " + finalV + " " + input2.getSelectedItem();
        finalValue.setText(finalSentence);
    }
    void divisas (HashMap<String, Double> cop, HashMap<String, Double> eur,HashMap<String, Double> gbp, HashMap<String, Double> jpy,HashMap<String, Double> krw,HashMap<String, Double> usd) {

        String uno = input1.getSelectedItem().toString();
        String dos = input2.getSelectedItem().toString();

        Double change = 0.0;
        switch (uno) {
            case "EUR":
                change = eur.get(dos);
                break;
            case "GBP":
                change = gbp.get(dos);
                break;

            case "JPY":
                change = jpy.get(dos);
                break;

            case "KRW":
                change = krw.get(dos);
                break;

            case "COP":
                change = cop.get(dos);
                break;

            case "USD":
                change = usd.get(dos);
                break;


        }
        Double inputValue;

        if (value.getText().length() == 0) {
            finalV = 0.0;
        } else {
            finalV = Double.parseDouble(value.getText()) * change;
        }
        ;
//
        finalSentence = value.getText() + " " + input1.getSelectedItem() + " = " + finalV + " " + input2.getSelectedItem();
        finalValue.setText(finalSentence);



    };
    public ventana() {
        value.setText("0");

        HashMap<String, Double> cop = new HashMap<String, Double>() {{
            put("COP", 1.0);
            put("USD", 0.00021);
            put("GBP", 0.00019);
            put("JPY", 0.027);
            put("KRW", 0.27);
            put("EUR", 0.27);

        }};;
        HashMap<String, Double> usd = new HashMap<String, Double>() {{
            put("COP", 4764.71);
            put("USD", 1.0);
            put("GBP", 0.82);
            put("JPY", 131.77);
            put("KRW", 1308.42);
            put("EUR", 0.93);

        }};;
        HashMap<String, Double> eur = new HashMap<String, Double>() {{
            put("COP", 5134.22);
            put("USD", 1.08);
            put("GBP", 0.88);
            put("JPY", 142.10);
            put("KRW", 3.64);
            put("EUR", 1.0);

        }};;
        HashMap<String, Double> gbp = new HashMap<String, Double>() {{
            put("COP", 5802.23);
            put("USD", 1.22);
            put("GBP", 1.0);
            put("JPY", 162.20);
            put("KRW", 3.64);
            put("EUR", 5134.22);

        }};;
        HashMap<String, Double> jpy = new HashMap<String, Double>() {{
            put("COP", 36.15);
            put("USD", 0.0076);
            put("GBP", 0.0076);
            put("JPY", 1.0);
            put("KRW", 9.93);
            put("EUR", 0.0071);

        }};;
        HashMap<String, Double> krw = new HashMap<String, Double>() {{
            put("COP", 3.64);
            put("USD", 0.0076);
            put("GBP", 0.00063);
            put("JPY", 0.10);
            put("KRW", 1.0);
            put("EUR", 0.00071);

        }};;

        add(ventana);
        setSize(500, 200);
        exchangeBox.setSelectedItem(null);
        listRenderer = new DefaultListCellRenderer();
        listRenderer.setHorizontalAlignment(DefaultListCellRenderer.CENTER);
        exchangeBox.setRenderer(listRenderer);
        input1.setRenderer(listRenderer);
        input2.setRenderer(listRenderer);


        exchangeBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (exchangeBox.getSelectedItem().equals("Divisas")) {
                    String[] divisasItems = {"COP", "USD", "EUR", "GBP", "JPY", "KRW"};
                    input1.removeAllItems();
                    input2.removeAllItems();

                    for (int i = 0; i < divisasItems.length; i++) {
                        input1.addItem(divisasItems[i]);
                        input2.addItem(divisasItems[i]);
                    }

                } else if (exchangeBox.getSelectedItem().equals("Temperatura")) {
                    String[] temperaturaItems = {"°C", "°F", "K"};
                    input1.removeAllItems();
                    input2.removeAllItems();

                    for (int i = 0; i < temperaturaItems.length; i++) {
                        input1.addItem(temperaturaItems[i]);
                        input2.addItem(temperaturaItems[i]);
                    }
                } else if (exchangeBox.getSelectedItem().equals("Medidas")) {
                    String[] medidasItems = {"Km", "M", "Cm"};
                    input1.removeAllItems();
                    input2.removeAllItems();

                    for (int i = 0; i < medidasItems.length; i++) {
                        input1.addItem(medidasItems[i]);
                        input2.addItem(medidasItems[i]);
                    }
                }
            }
        });

        value.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {


                super.keyReleased(e);
                if (exchangeBox.getSelectedItem()!=null){
                    if (input1.getSelectedItem()!=null && input2.getSelectedItem()!=null){
                        switch (exchangeBox.getSelectedItem().toString()){
                            case "Divisas":
                                divisas(cop,eur,gbp,jpy,krw,usd);
                                break;
                            case "Temperatura":
                                temperatura();
                                System.out.println("temperatura");
                                break;
                            case "Medidas":
                                distance();
                                break;
                        }
                    }
                }



            }
        });
        input1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

//
                if (exchangeBox.getSelectedItem()!=null){
                    if (input1.getSelectedItem()!=null && input2.getSelectedItem()!=null){
                        switch (exchangeBox.getSelectedItem().toString()){
                            case "Divisas":
                                divisas(cop,eur,gbp,jpy,krw,usd);
                                break;
                            case "Temperatura":
                                temperatura();
                                System.out.println("temperatura");
                                break;
                            case "Medidas":
                                distance();
                                break;
                        }
                    }
                }

            }
        });
        input2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (exchangeBox.getSelectedItem()!=null){
                    if (input1.getSelectedItem()!=null && input2.getSelectedItem()!=null){
                        switch (exchangeBox.getSelectedItem().toString()){
                            case "Divisas":
                                divisas(cop,eur,gbp,jpy,krw,usd);
                                break;
                            case "Temperatura":
                                temperatura();
                                break;
                            case "Medidas":
                                distance();
                                break;
                        }
                    }
                }
            }
        });
    };

};

