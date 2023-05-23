# Merge Sort

![s1](s1.png)
![s2](s2.png)
![s3](s3.png)
![s4](s4.png)
![s5](s5.png)
![s6](s6.png)
![s7](s7.png)
![s8](s8.png)
![s9](s9.png)
![s10](s10.png)
![s11](s11.png)
![s12](s12.png)
![s13](s13.png)

```

public void mergSort(int[] arr) {
  int n = arr.length;

  if (n > 1) {
    int mid = n/2;
    int[] left = arr[0 ... mid];
    int[] right = arr[0...mid];

    mergeSort(left);

    mergeSort(right);

    merge(left,right, arr);
    }
}

public void merge(int[] left, int[] right, int[] arr) {

  int i = 0;
  int j = 0;
  int k = 0;

  while (i < left.length && j <right.length) {
    if (left[i] <= right[j] {
      arr[k] = left[i];
      i++;
      } else {
        arr[k] = right[j];
        j++;
    k++;

  }

  if (i == left.length) {
    for (i; i < arr.length; i++) {
      arr.push(left[i]);
      }
    } else {
       for (i; i < arr.length; i++) {
      arr.push(right[i]);
      }
}


```

