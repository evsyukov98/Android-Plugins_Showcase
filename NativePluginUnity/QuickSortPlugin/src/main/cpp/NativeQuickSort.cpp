// Write C++ code here.
//
// Do not forget to dynamically load the C++ library into your application.
//
// For instance,
//
// In MainActivity.java:
//    static {
//       System.loadLibrary("main");
//    }
//
// Or, in MainActivity.kt:
//    companion object {
//      init {
//         System.loadLibrary("main")
//      }
//    }

#include <algorithm>

int Partition(int* arr, int left, int right) {
    int pivot = arr[right];
    int i = (left - 1);

    for (int j = left; j <= right - 1; j++) {
        if (arr[j] < pivot) {
            i++;
            std::swap(arr[i], arr[j]);
        }
    }
    std::swap(arr[i + 1], arr[right]);
    return (i + 1);
}

extern "C" {
void QuickSort(int* arr, int left, int right) {
    if (left < right) {
        int pivotIndex = Partition(arr, left, right);
        QuickSort(arr, left, pivotIndex - 1);
        QuickSort(arr, pivotIndex + 1, right);
    }
}
}

