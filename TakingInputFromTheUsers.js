
import { createInterface } from 'readline';

const r1= createInterface(
    {
input: process.stdin,
output: process.stdout
    }
   )

   r1.question("Enter your name:", function(name)
   {

   r1.question("Enter your age:", function(ageInput)
   {
     const age=parseInt(ageInput);

     if (isNaN(age))
     {
        console.log("Invalid age, Please enter a number");
     }
     else{
        console.log(`Hello ${name}, you are ${age} years old`);
     }

   });


   });

   