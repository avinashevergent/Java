let schoolName="Aravinda high school";
let num=10;
let value=true;

console.log(`"My school name is ${schoolName} and number is ${num} and the value is ${value}`);

console.log(schoolName.length);
console.log(schoolName.charAt(7));
console.log(schoolName.charCodeAt(7));
console.log(schoolName.substring(2,7));
console.log(schoolName.slice(2,7))
console.log(schoolName.toUpperCase());
console.log(schoolName.toLowerCase());
console.log(schoolName.includes("school"));
console.log(schoolName.indexOf("a"));
console.log(schoolName.lastIndexOf("a"));
console.log(schoolName.startsWith("Ar"));
console.log(schoolName.endsWith("ol"));


let place="  Rajaghatta   ";
console.log(place.trim());
console.log(place);
console.log(place.trimStart());
console.log(place.trimEnd());

let place2="Vikarna";
console.log(place2.split(""));

let laugh="ha";
console.log(laugh.repeat(5 ));

console.log(place2.concat(laugh));

let con="Avi".concat("Vikarna");
console.log(con);

let pad=place2.padStart(10,"A");
console.log(pad);

console.log(place2.padEnd(12,"B"));

let value5="abc123xyz456";

newValue=value.match(/\d+/);
console.log(newValue5);

newValue2=value.match(/\d+/g);
console.log(newValue2);

newValue3=value.matchAll(/\d+/g);
console.log(newValue3);

newValue4=value.search(/\d+/);
console.log(newValue4);

