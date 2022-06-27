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

function ResetForm() {
  document.getElementById("name").value = "";
  document.getElementById("id").value = "";
  document.getElementById("mail").value = "";
  document.getElementById("phone").value = "";
  document.getElementById("design").value = "Select Employee Role";
  document.getElementById("btnd").innerHTML = "ADD DETAILS";
  document.getElementById("btn1").innerHTML = "ADD EMPLOYEE";
  selectValue = -1;
}

function getData() {
  let data = localStorage.getItem("Employee_Details");
  return data;
}

function setData(data) {
  localStorage.setItem("Employee_Details", JSON.stringify(data));
}

$(document).ready(function(){
  $("#btn1").click(function(){
    if($("#btn1").text()==="ADD EMPLOYEE"){
      $(".details").show();
      $("#tbl").hide();
      $("#btn1").html("VIEW EMPLOYEE");
    }else{
      $(".details").hide();
      $("#tbl").show();
      $("#btn1").html("ADD EMPLOYEE");
    }
    
  })
})

// $(document).ready(function(){
//   $("#btn2").click(function(){
//     $(".details").hide();
//     $("#tbl").show();
//   })
// })

