// using the temp array

function printrotate(arr,n,d){
    let temp = [];
    k = 0;
    for(let i=d;i<n;i++){
        temp[k] = arr[i];
        k++;
    }

    for(let i=0;i<d;i++){
        temp[k] = arr[i];
        k++;
    }

    // for (let i=0;i<n;i++){
    //     console.log(temp[i]+" ")
    // }

   return temp;
}

function print1(arr,n){
    for(var i=0; i<n ;i++){
        console.log(arr[i]);
    }
}


var arr = [1,2,3,4,5,6];
var n = arr.length;
var d = 2;

printrotate(arr,n,d);
print1(printrotate(arr,n,d),n);


