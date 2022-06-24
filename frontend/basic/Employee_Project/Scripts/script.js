if (JSON.parse(localStorage.getItem("Employee_Details")) === null) {
  localStorage.setItem("Employee_Details", JSON.stringify([]));
}
//let arr=[{id:123,name:"pavan",email:"pavan@gmail.com",mobile:"9989175395",desn:"software"},{id:123,name:"pavan",email:"pavan@gmail.com",mobile:"9989175395",desn:"software"},{id:123,name:"pavan",email:"pavan@gmail.com",mobile:"9989175395",desn:"software"},{id:123,name:"pavan",email:"pavan@gmail.com",mobile:"9989175395",desn:"software"},]
function init() {
  document.getElementById("tableRows").innerHTML = "";
  let arr = JSON.parse(localStorage.getItem("Employee_Details"));
  let length=document.getElementById("heads").childElementCount;
  for (let i = 0; i < arr.length; i++) {
    var values = Object.values(arr[i]);
    console.log(values)
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

// Reading Details
function getDetails() {
  let details = {
    id: document.getElementById("id").value,
    name: document.getElementById("name").value,
    email: document.getElementById("mail").value,
    mobile: document.getElementById("phone").value,
    desn: document.getElementById("design").value,
  };

  return details;
}

console.log(document.getElementById("heads").childElementCount);

// Validating
function Validate(details) {
  let err = document.getElementById("error");
  let get_Data = JSON.parse(localStorage.getItem("Employee_Details"));
  console.log(details.mobile.length);
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

// Adding a Initial Row
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

  // snoCell.innerHTML = index + 1;
  // idCell.innerHTML = details.id;
  // nameCell.innerHTML = details.name;
  // mailCell.innerHTML = details.email;
  // phoneCell.innerHTML = details.mobile;
  // desnCell.innerHTML = details.desn;
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
  document.querySelector(".details").style.display = "block";
  document.querySelector("#tbl").style.display = "none";
}

function ResetForm() {
  document.getElementById("name").value = "";
  document.getElementById("id").value = "";
  document.getElementById("mail").value = "";
  document.getElementById("phone").value = "";
  document.getElementById("design").value = "Select Employee Role";
  document.getElementById("btnd").innerHTML = "ADD DETAILS";
  selectValue = -1;
}

function getData() {
  let data = localStorage.getItem("Employee_Details");
  return data;
}

function setData(data) {
  localStorage.setItem("Employee_Details", JSON.stringify(data));
}

function AddEmp() {
  document.querySelector(".details").style.display = "block";
  document.querySelector("#tbl").style.display = "none";
}
function ShowEmp() {
  document.querySelector(".details").style.display = "none";
  document.querySelector("#tbl").style.display = "block";
}
