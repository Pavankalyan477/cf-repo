function AddDetails(index, values,len) {
    var table = document.getElementById("tableRows");
    var row = table.insertRow();
    for(let i=0;i<len-1;i++){
      let cell=row.insertCell(i);
          if(i==0){
            cell.innerHTML=index+1;
          }
          else{
            cell.innerHTML=values[i-1];
          }
  
     }
    var actionCell = row.insertCell(len-1);
    actionCell.innerHTML =
      '<button onclick=" UpdateDetails(' +
      index +
      ')">EDIT</button><button onclick="DeleteRow(' +
      index +
      ')">DELETE</button>';
  }
  
  // Deleting Data
  function DeleteRow(index) {
    var table = document.getElementById("employeeList");
    table.deleteRow(index + 1);
    let arr = JSON.parse(localStorage.getItem("Employee_Details"));
    arr.splice(index, 1);
    localStorage.setItem("Employee_Details", JSON.stringify(arr));
    init();
  }

  
  
  // Updating Deatails a Row
  
  function UpdateDetails(index) {
    let arr = JSON.parse(localStorage.getItem("Employee_Details"));
    let emp_obj = {};
    for (let i = 0; i < arr.length; i++) {
      if (i === index) {
        emp_obj = arr[i];
        selectValue = i;
        break;
      }
    }
    document.getElementById("name").value = emp_obj.name;
    document.getElementById("id").value = emp_obj.id;
    document.getElementById('id').setAttribute('readonly', true);
   
  
    document.getElementById("mail").value = emp_obj.email;
    document.getElementById("phone").value = emp_obj.mobile;
    document.getElementById("design").value = emp_obj.desn;
    document.getElementById("btnd").innerHTML = "UPDATE DETAILS";
    document.getElementById("btn1").innerHTML = "VIEW EMPLOYEE";
    document.querySelector(".details").style.display = "block";
    document.querySelector("#tbl").style.display = "none";
  }
  