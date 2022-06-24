
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
export {getData}