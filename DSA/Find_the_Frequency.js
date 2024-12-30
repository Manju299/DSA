function frequency(arr,key){
    let count=0;
    for(let i=0; i<arr.length; i++){
        if(arr[i]==key){
            count +=1;
            // console.log(arr[i]);
        }
    }
    console.log(count);

}

var arr = [1,2,2,3,3,2];
var key = 2;
// console.log(key)
frequency(arr,key);
console.log("after the call");