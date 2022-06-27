function Validate(details) {
    let err = document.getElementById("error");
    let get_Data = JSON.parse(localStorage.getItem("Employee_Details"));
    if (details.desn === "Select Employee Role") {
      err.style.display = "block";
    } else if(details.mobile.length<10 || details.mobile.length>10){
      alert("MOBILE NO must be 10 Digits")
    }
    else {
      let unique = true;
      if (get_Data !== null) {
        for (let i = 0; i < get_Data.length; i++) {
          if (
            details.id === get_Data[i].id ||
            details.email === get_Data[i].email ||
            details.mobile===get_Data[i].mobile
          ) {
            unique = false;
            break;
          }
        }
      }
  
      if (unique === false) {
        alert("Employee I'D Should be Unique,  OR EMAIL Already taken OR MOBILE NO already taken ):");
      } else {
        return unique;
      }
    }
  }

 // export {Validate}