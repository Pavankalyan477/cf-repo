let users_record = []


function test(){

    var uid = document.getElementById("userName").value;
    var email = document.getElementById("email").value;
    var pass = document.getElementById("pass").value;


    alert(uid+email+pass);

    


    users_record.push({

        UserId:uid,
        Email:email,
        Password:pass
    })
    localStorage.setItem("users",JSON.stringify(users_record));

        // localStorage.setItem("UserId",uid);
    // localStorage.setItem("Email",email);
    // localStorage.setItem("Password",pass);
}




