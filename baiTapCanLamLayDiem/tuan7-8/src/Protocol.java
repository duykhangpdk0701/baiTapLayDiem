public interface Protocol {

  public static void bubbleSort(Comparable[] list) {

    for (int i = 0; i < list.length - 1; i++) {
      for (int j = 0; j < list.length - i - 1; j++) {
        if (list[j].compareTo(list[j + 1]) >= 0) {
          Comparable temp = list[j];
          list[j] = list[j + 1];
          list[j + 1] = temp;
        }
      }
    }
  }

  public static void selectionSort(Comparable[] list) {
    int min;
    for (int i = 0; i < list.length - 1; i++) {
      min = i;
      for (int j = i + 1; j < list.length; j++) {
        if (list[j].compareTo(list[min]) < 0) {
          min = j;
        }
      }
      Comparable temp = list[min];
      list[min] = list[i];
      list[i] = temp;
    }
  }

  public static void insertionSort(Comparable[] list) {
    int j;
    Comparable key;
    for (int i = 1; i < list.length; i++) {
      key = list[i];
      j = i - 1;
      while (j >= 0 && list[j].compareTo(key) > 0) {
        list[j + 1] = list[j];
        j = j - 1;

      }
      list[j + 1] = key;
    }
  }

  public static void searching(Comparable[] list, Comparable item) {
    for (Comparable index : list) {
      if (index.compareTo(item) == 0) {
        System.out.println("phan tu ban tim co trong mang");
        return;
      }
    }
    System.out.println("phan tu ban tim khong co trong mang");
  }

}