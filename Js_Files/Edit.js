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
    t=i;
  }
export const temp =t;
  
  