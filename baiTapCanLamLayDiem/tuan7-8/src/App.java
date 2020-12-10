public class App {
  public static void main(String[] args) throws Exception {

    PhanSo arr[] = { new PhanSo(3, 2), new PhanSo(1, 2), new PhanSo(1, 3) };

    // Sorting.bubbleSort(arr);
    // Sorting.selectionSort(arr);
    Protocol.insertionSort(arr);

    for (PhanSo phanSo : arr) {
      System.out.println(phanSo.toString());
    }

    Contact arr2[] = { new Contact("phung", "khang", "0793607376"), new Contact("phung", "hien", "0793607376"),
        new Contact("phung", "duy", "0793607376"), new Contact("phung", "phong", "0793607376") };
    Contact item = new Contact("phung", "khang", "0793607376");

    Protocol.insertionSort(arr2);
    for (Contact contact : arr2) {
      System.out.println(contact);
    }

    Protocol.searching(arr2, item);

    Diem arr3[] = { new Diem("khang"), new Diem("hien"), new Diem("phong") };

    Protocol.bubbleSort(arr3);

    for (Diem diem : arr3) {
      System.out.println(diem);
    }
  }
}
