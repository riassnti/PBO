package com.pbo;

class Classku {
    //Atribute
    public int x = 5; //atribut ini boleh diakses secara langsung dari luar classku
    int y = 15; //atribut ini dapat diakses secara langsung dari luar classku dalam 1 package
    private int z = 20; //atribut ini tak boleh diakses secara langsung dari luar classku

    //method
    public int tampilkanZ() {
        return this.z;
    }
}

