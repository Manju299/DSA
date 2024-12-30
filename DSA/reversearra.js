

function reverse(arr,n){
    var start = 0;
    var end = n-1;

    while(start < end){
        var temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }



}

function print1(arr,n){
    for(var i=0; i<n ;i++){
        console.log(arr[i]);
    }
}


var arr = [1,2,3,4,5];
var n = arr.length;
print1(arr,n)
reverse(arr,n);
console.log("****after the Reverse of the array****");

print1(arr,n);