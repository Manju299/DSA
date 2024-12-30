function duplicateItems(arr, n) {
  let uniques = new Set();
  for (let i = 0; i < n; i++) {
    if (uniques.has(arr[i])) {
      return true;
    } else {
      uniques.add(arr[i]);
    }
  }

  return false;
}

const arr = [1, 2, 3, 4, 5];
const n = arr.length;   
console.log(duplicateItems(arr, n));
