function reverse(arr,start,end){
    
    var temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;

    if (start+1 < end-1){
        reverse(arr,start+1,end-1)
    }
}

function print1(arr,n){
    for(var i=0; i<n ;i++){
        console.log(arr[i]);
    }
}

var arr = [1,2,3,4,5];
var n = arr.length;
var start = 0;
var end = n-1;
reverse(arr, 0,arr.length-1);
print1(arr,n);