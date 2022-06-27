if (JSON.parse(localStorage.getItem("Employee_Details")) === null) {
    localStorage.setItem("Employee_Details", JSON.stringify([]));
  }
  
  function init() {
    document.getElementById("tableRows").innerHTML = "";
    let arr = JSON.parse(localStorage.getItem("Employee_Details"));
    let length=document.getElementById("heads").childElementCount;
    for (let i = 0; i < arr.length; i++) {
      var values = Object.values(arr[i]);
      AddDetails(i, values,length);
    }
  }
  
  var selectValue = -1;
  function add(e) {
    e.preventDefault();
  
    let details = getDetails();
    var employee_data = JSON.parse(localStorage.getItem("Employee_Details"));
    if (selectValue === -1) {
      if (Validate(details)) {
        employee_data.push(details);
       
        document.querySelector(".details").style.display = "block";
        document.querySelector("#tbl").style.display = "none";
        ResetForm();
      }
    } else {
      employee_data.splice(selectValue, 1, details);
      document.querySelector(".details").style.display = "none";
      document.querySelector("#tbl").style.display = "block";
      ResetForm();
    }
    localStorage.setItem("Employee_Details", JSON.stringify(employee_data));
   
    init();
  }
  
  function errror() {
    let err = document.getElementById("error");
    err.style.display = "none";
  }

 // export {init,add,error}