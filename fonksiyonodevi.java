
int[] barkod1 = new int[12];
int[] barkod2 = new int[12];


void main() {
    diziyiDoldur(barkod1);
    diziyiDoldur2(barkod2);
    System.out.println("birinci barkodalar:");
    diziyiYazdır(barkod1);
    System.out.println("ikinci barkodlar:");
    diziyiYazdır(barkod2);
    System.out.println("BARKODLAR BAŞARIYLA BASILDI:");
}

public void diziyiDoldur(int[] array) {
    for (int i = 0; i < array.length; i++) {
        array[i] = 869;
    }
}

public void diziyiDoldur2(int[] array) {
    for (int i = 0; i < array.length; i++) {
        array[i] = 868;
    }
}


public void diziyiYazdır(int[] array) {
    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
    }
}




