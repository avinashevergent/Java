
const passkey = "    T#2q9pasd7dsa     ";
console.log(passkey);
const updatedPassword = passkey.trim();  //Strings are immutable so if we trim() new string will be created
//Old one will not be modified
console.log(updatedPassword);


if (updatedPassword.length < 8 || updatedPassword.includes("Password") ){
    console.log("Weak Password:- Please enter a password which is atleast 8 characters and don't use Password as Password");
}

else {

    console.log(`Password Accepted:- You entered a strong password which is the length of ${updatedPassword.length} and your password is ${updatedPassword}`);
}
