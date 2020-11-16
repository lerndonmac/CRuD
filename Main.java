package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {
        List<Protuct> productList = new ArrayList<>();
        String filePath = "products.txt";
        //read
        try(BufferedReader fileReader = new BufferedReader(new FileReader(filePath))) {
            while (fileReader.ready()){
                Protuct protuct = getProduct(fileReader.readLine());
                productList.add(protuct);
            }

        }
        //write
        if ("-c".equals(args[0])){
            int id = 0;
            String name;
            String price;
            String quantity;
            for (Protuct protuct:productList) {
                if (protuct.getPid()>id){
                    id = protuct.getPid();
                }
            }
            name = args[args.length-3];
            price = args[args.length-2];
            quantity = args[args.length-1];
            Protuct protuct = new Protuct(++id,name,price,quantity);
            productList.add(protuct);
            try (FileWriter fw = new FileWriter(filePath)) {
                fw.write(productList.toString());
            }
        }


    }


    public static Protuct getProduct (String strProduct){
        String id;
        String name;
        String price;
        String quantity;
        id = strProduct.substring(0,8);
        name = strProduct.substring(8,38);
        price = strProduct.substring(38,46);
        quantity = strProduct.substring(46,50);
        Protuct protuct = new Protuct(Integer.parseInt(id),name,price,quantity);
        return protuct;
    }
}
