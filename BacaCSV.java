
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BacaCSV {
    public static void main(String[] args) {
        String csvFile = "laptops_train.csv";
        DataLaptop[] ListLaptop = new DataLaptop[978]; //data laptop sebanyak 978

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))){

            String line = "";
            br.readLine(); //skip baris pertama
            int idx = 0;

            // membaca setiap baris dalam file CSV
            while ((line = br.readLine()) != null){
                String[] file = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

                // membuat objek DataCSV dan mengisi data
                DataLaptop dataLaptop = new DataLaptop();
                dataLaptop.Manufacturer = file[0];
                dataLaptop.ModelName = file[1];
                dataLaptop.Category = file[2];
                dataLaptop.ScreenSize = file[3];
                dataLaptop.Screen = file[4];
                dataLaptop.CPU = file[5];
                dataLaptop.RAM = file[6];
                dataLaptop.Storage = file[7];
                dataLaptop.GPU = file[8];
                dataLaptop.OperatingSystem = file[9];
                dataLaptop.OperatingSystemVersion = file[10];
                dataLaptop.Weight = file[11];
                dataLaptop.Price = Double.parseDouble(file[12]);


                ListLaptop [idx] = dataLaptop;
                idx++;

                dataLaptop.print();


                 // memanggil metode print untuk menampilkan informasi laptop


            }
            System.out.println("===========================");
            System.out.println("");
            System.out.println("Jenis laptop dengan spesifik : ");
            br.close();

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }

        //pencarian untuk semua laptop yg diproduksi oleh "Apple"

        for (DataLaptop dataLaptop : ListLaptop) {

            if (dataLaptop !=null && dataLaptop.Manufacturer.equalsIgnoreCase("Apple")) {
                dataLaptop.print();
            }


        }

        System.out.println("");

    }
}
