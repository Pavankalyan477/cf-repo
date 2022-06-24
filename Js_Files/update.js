

var temp=-1;
function add() {
 var arr = JSON.parse(localStorage.getItem("user")) ;
  let name = document.getElementById("Name").value;
  let id = document.getElementById("id").value;
  let mobile = document.getElementById("mob").value;
  let mail = document.getElementById("email").value;
  let dsgn = document.getElementById("dsgn").value;

  var detail = {
    Name: name,
    Id: id,
    Mobile: mobile,
    Mail: mail,
    Dsgn: dsgn,
  };


if(temp===-1){
    if(arr.length==0){
        arr[0]={
           Name: name,
           Id: id,
           Mobile: mobile,
           Mail: mail,
           Dsgn: dsgn,
       
        }
       }
       //validation
       else{

       if(name==""||id==""||mobile.length!=10||mail==""||dsgn==""){
       alert("Fields are not valid")
       }

       
            
          else if(arr.some(details => details.Id==id)|| arr.some(details => details.Name==name)||arr.some(details => details.Mobile==mobile)){
            alert("Dupliactes are not allowed pls check the Fileds")
          }  
          //validation end//
          else
            {
           arr.push(detail);}
       }
 }







 else{
    arr.splice(temp,1,detail);
}




  

  localStorage.setItem("user",JSON.stringify(arr));
 

}



function getData() {
    var details = JSON.parse(localStorage.getItem("user"));
  
    var h = "";
    var Sno = 1;
     
  
    let i = 0;
    for (let i in details) {
      h =
        h +
        `<tr><td>${Sno}</td><td>${details[i].Name}</td><td>${details[i].Id}</td><td>${details[i].Mobile}</td><td>${details[i].Mail}</td><td>${details[i].Dsgn}</td>
          
  
          <td><button id = "edit" onclick="myUpdate(${i})">Edit</button> <button id ="delete" onclick="myDelete(${i})">delete</button></td>
          </tr>`;
    Sno++;
    
      }
      
   
    document.getElementById("tbodyRows").innerHTML = h;
  }

  
  function myDelete(i){
      
      var arr = JSON.parse(localStorage.getItem("user"));
     arr.splice(i,1);
     localStorage.setItem("user",JSON.stringify(arr));
     getData();
  
  }


  function myUpdate(i){
    var arr = JSON.parse(localStorage.getItem("user"));
    alert(arr[i].Name);

     document.getElementById("Name").value = arr[i].Name;
     document.getElementById("id").value = arr[i].Id;
     document.getElementById("mob").value = arr[i].Mobile;
     document.getElementById("email").value = arr[i].Mail
     document.getElementById("dsgn").value = arr[i].Dsgn;
    //  myDelete(i);
    //  add();
    temp=i;

  }
  
 


