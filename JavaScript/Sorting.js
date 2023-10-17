let input = prompt("Enter a list of items separated by commas");
let array = input.split(",");
console.log(aSort(array));
function aSort(array) { 
    array.sort((a,b)=>a-b); 
    const arr=array.map(i=>{
        console.log(i);
    })
    return array;
} 
