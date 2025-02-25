//deklarasi variabel informasi pada laptop
public class DataLaptop {
        public String Manufacturer;
        public String ModelName;
        public String Category;
        public String ScreenSize;
        public String Screen;
        public String CPU;
        public String RAM;
        public String Storage;
        public String GPU;
        public String OperatingSystem;
        public String OperatingSystemVersion;
        public String Weight;
        public Double Price;

        //menampilkan informasi tertentu yang ingin ditampilkan
        public void print(){
                System.out.println("Manufacturer : " + Manufacturer + ", Model: " + ModelName + ", CPU : " + CPU + ", RAM: " + RAM + ", Harga: " + Price);

    }
}
