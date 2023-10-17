var str=prompt("Enter a sentence")

console.log(rev(str))

function rev(str){
   const spltArr = str.split(" ");
   const reversed = spltArr.map(i => {
      return i.split('').reverse().join("");
   });
   return reversed.join(" ");
}
