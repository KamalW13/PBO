class BangunDatar{
    
}

class Persegi extends BangunDatar{
    int sisi;
    
    Persegi(int inputSisi){
        this.sisi = inputSisi;
    }
    
    void luas(){
        int luas = this.sisi * this.sisi;
        System.out.println(luas);
    }
    
    void keliling(){
        int keliling = 4 * this.sisi;
        System.out.println(keliling);
    }
}

class Lingkaran extends BangunDatar{
    int jariJari;
    
    Lingkaran(int inputJariJari){
        this.jariJari = inputJariJari;
    }
    
    void luas(){
        double luas = 3.14 * this.jariJari * this.jariJari;
        System.out.println(luas);
    }
    
    void keliling(){
        double keliling = 3.14 * 2 * this.jariJari;
        System.out.println(keliling);
    }
}

class HelloWorld {
    public static void main(String[] args) {
        
        Lingkaran lingkaran1 = new Lingkaran(14);
        Persegi persegi1 = new Persegi(14);
        
        lingkaran1.luas();
        lingkaran1.keliling();
        persegi1.luas();
        persegi1.keliling();
    }
}
